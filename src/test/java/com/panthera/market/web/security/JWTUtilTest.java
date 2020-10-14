package com.panthera.market.web.security;

import com.panthera.market.domain.service.PantheraUserDetailService;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class JWTUtilTest {
    @Autowired
    private PantheraUserDetailService pantheraUserDetailService;
    private JWTUtil tester;
    private UserDetails userDetails;
    private Date dateNow = new Date();
    private Date dateExpiration = new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10);

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new JWTUtil();
        pantheraUserDetailService = new PantheraUserDetailService();
        userDetails = pantheraUserDetailService.loadUserByUsername("Daniel");
    }

    @Test
    void generateToken() {
        // Arrange
        final String tokenMock = mockGenerateToken(userDetails.getUsername(), dateNow, dateExpiration);

        // Act
        String token = tester.generateToken(userDetails, dateNow, dateExpiration);

        // Assert
        assertEquals(tokenMock, token, "generateToken must be tokenMock");
    }

    @Test
    void validateToken() {
        // Arrange
        final String tokenMock = mockGenerateToken(userDetails.getUsername(), dateNow, dateExpiration);

        // Act
        boolean isValid = tester.validateToken(tokenMock, userDetails);

        // Assert
        assertTrue(isValid, "validateToken must be true");
    }

    @Test
    void extractUsername() {
        // Arrange
        final String tokenMock = mockGenerateToken(userDetails.getUsername(), dateNow, dateExpiration);

        // Act
        String tokenResult = tester.extractUsername(tokenMock);

        // Assert
        assertEquals("Daniel", tokenResult, "extractUsername must be tokenMock");
    }

    @Test
    void isTokenIsNotExpire() {
        // Arrange
        final String tokenMock = mockGenerateToken(userDetails.getUsername(), dateNow, dateExpiration);

        // Act
        boolean isExpired = tester.isTokenExpire(tokenMock);

        // Assert
        assertFalse(isExpired, "isTokenExpire must be false");
    }

    @Test
    void isTokenIsExpire() {
        try {
            // Act
            tester.isTokenExpire("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJEYW5pZWwiLCJpYXQiOjE2MDI2OTM4NjksImV4cCI6MTYwMjY5Mzg3M30.ITqc1b9xU4Cn64sJ7oqfi9UKP5NXm4O1lS1iYcH48io");
        } catch (ExpiredJwtException e) {
            // Assert
            assertThat(e.getMessage(), CoreMatchers.containsString("2020-10-14T11:44:33Z"));

        }
    }


    private String mockGenerateToken(String username, Date dateNow, Date dateExpiration) {
        return Jwts.builder().setSubject(username)
                .setIssuedAt(dateNow)
                .setExpiration(dateExpiration)
                .signWith(SignatureAlgorithm.HS256, "Ph4nth3r4").compact();
    }
}
