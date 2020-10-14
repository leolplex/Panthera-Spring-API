package com.panthera.market.web.security.filter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

class JwtFilterRequestTest {

    JwtFilterRequest tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new JwtFilterRequest();
    }

    @Test
    void doFilterInternal() throws ServletException, IOException {
        // Arrange

        // Act
        tester.doFilterInternal(Mockito.mock(HttpServletRequest.class), Mockito.mock(HttpServletResponse.class), Mockito.mock(FilterChain.class));

        // Assert
        // assertNull(tester.getUsername(), "getUsername must be null");
    }

}
