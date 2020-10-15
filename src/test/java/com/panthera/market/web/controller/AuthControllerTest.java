package com.panthera.market.web.controller;

import com.panthera.market.domain.Product;
import com.panthera.market.domain.dto.AuthenticationRequest;
import com.panthera.market.domain.dto.AuthenticationResponse;
import com.panthera.market.domain.service.PantheraUserDetailService;
import com.panthera.market.domain.service.ProductService;
import com.panthera.market.web.security.JWTUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthControllerTest {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PantheraUserDetailService pantheraUserDetailService;

    @Autowired
    private JWTUtil jwtUtil;


    AuthController tester;

    @BeforeEach
    void initEach() {
        // Arrange
        authenticationManager = Mockito.mock(AuthenticationManager.class);
        pantheraUserDetailService = Mockito.mock(PantheraUserDetailService.class);
        jwtUtil = Mockito.mock(JWTUtil.class);
        tester = new AuthController(authenticationManager, pantheraUserDetailService, jwtUtil);
    }

    @Test
    void createToken() {

        AuthenticationRequest authenticationRequest = Mockito.mock(AuthenticationRequest.class);
        assertEquals(HttpStatus.OK, tester.createToken(authenticationRequest).getStatusCode(), "createToken must be OK");
    }

    @Test
    void createTokenBadRequest() {

        AuthenticationRequest authenticationRequest = Mockito.mock(AuthenticationRequest.class);
        authenticationRequest.setUsername("mymock");
        authenticationRequest.setPassword("mypass");
        Mockito.when(authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())))
                .thenThrow(new BadCredentialsException("bad"));
        assertEquals(HttpStatus.FORBIDDEN, tester.createToken(authenticationRequest).getStatusCode(), "createToken must be OK");
    }


}
