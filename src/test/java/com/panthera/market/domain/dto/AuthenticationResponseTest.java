package com.panthera.market.domain.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationResponseTest {

    private AuthenticationResponse tester;
    private final String jwt = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJEYW5pZWwiLCJpYXQiOjE2MDI2ODM1NzYsImV4cCI6MTYwMjcxOTU3Nn0.333emD3sadckl3ug5jTRDO0iYwkhkpTsADDsjcC5jUk";

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new AuthenticationResponse(jwt);
    }

    @Test
    void InstanceAuthenticationResponseDefaultValues() {
        // Assert
        assertEquals(jwt, tester.getJwt(), "getJwt must be jwt");
    }

    @Test
    void getAndSetJwt() {

        //Act
        tester.setJwt(jwt);
        final String getJwt = tester.getJwt();

        // Assert
        assertEquals(jwt, getJwt, "setJwt must be jwt");
    }
}
