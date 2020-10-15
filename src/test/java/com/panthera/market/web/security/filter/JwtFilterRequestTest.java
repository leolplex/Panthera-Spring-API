package com.panthera.market.web.security.filter;

import com.panthera.market.domain.service.PantheraUserDetailService;
import com.panthera.market.web.security.JWTUtil;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JwtFilterRequestTest {

    JwtFilterRequest tester;
    private Date dateNow = new Date();
    private Date dateExpiration = new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10);
    private MockHttpServletRequest request;
    private HttpServletResponse response;
    private FilterChain filterChain;
    private String tokenMock;
    private String tokenWithOutBearer;

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private PantheraUserDetailService pantheraUserDetailService;

    @BeforeEach
    void initEach() {
        // Arrange
        jwtUtil = Mockito.mock(JWTUtil.class);
        pantheraUserDetailService = Mockito.mock(PantheraUserDetailService.class);
        tester = new JwtFilterRequest(jwtUtil, pantheraUserDetailService);
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
        filterChain = new MockFilterChain();
        tokenMock = "Bearer " + mockGenerateToken("Daniel", dateNow, dateExpiration);
        tokenWithOutBearer = tokenMock.substring(7);
    }

    @Test
    void doFilterInternal() throws ServletException, IOException {
        // Act
        tester.doFilterInternal(request, response, filterChain);

        // Assert
        assertEquals(HttpStatus.OK.value(), response.getStatus(), "httpServletResponse.getStatus() must be ok");
    }

    @Test
    void doFilterInternalWithValidRequest() throws ServletException, IOException {
        // Arrange
        request.addHeader("Authorization", tokenWithOutBearer);

        // Act
        tester.doFilterInternal(request, response, filterChain);

        // Assert
        assertEquals(HttpStatus.OK.value(), response.getStatus(), "httpServletResponse.getStatus() must be ok");

    }


    @Test
    void doFilterInternalWithValidRequestAndContainBearer() throws ServletException, IOException {
        // Arrange
        request.addHeader("Authorization", tokenMock);
        request.setRequestURI("/products/all");

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String passwordEncode = passwordEncoder.encode("panthera");
        UserDetails userDetails = new User("Daniel", passwordEncode, new ArrayList<>());

        Mockito.when(jwtUtil.extractUsername(tokenWithOutBearer)).thenReturn("Daniel");
        Mockito.when((pantheraUserDetailService.loadUserByUsername("Daniel"))).thenReturn(userDetails);
        Mockito.when((jwtUtil.validateToken(tokenWithOutBearer, userDetails))).thenReturn(true);
        // Act
        tester.doFilterInternal(request, response, filterChain);

        // Assert
        assertEquals(HttpStatus.OK.value(), response.getStatus(), "httpServletResponse.getStatus() must be Ok");

    }

    private String mockGenerateToken(String username, Date dateNow, Date dateExpiration) {
        return Jwts.builder().setSubject(username)
                .setIssuedAt(dateNow)
                .setExpiration(dateExpiration)
                .signWith(SignatureAlgorithm.HS256, "Ph4nth3r4").compact();
    }

}

