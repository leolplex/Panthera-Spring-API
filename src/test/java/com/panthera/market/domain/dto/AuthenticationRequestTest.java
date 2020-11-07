package com.panthera.market.domain.dto;

import com.panthera.market.persistence.entity.Categoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AuthenticationRequestTest {

    AuthenticationRequest tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new AuthenticationRequest();
    }

    @Test
    void InstanceAuthenticationRequestDefaultValues() {
        // Assert
        assertNull(tester.getUsername(), "getUsername must be null");
        assertNull(tester.getPassword(), "getPassword must be null");
    }

    @Test
    void getAndSetUsername() {
        // Arrange
        final String username = "mockusername";

        //Act
        tester.setUsername(username);
        final String getUsername = tester.getUsername();

        // Assert
        assertEquals(username, getUsername, "getUsername must be mockusername");
    }

    @Test
    void getAndSetPassword() {
        // Arrange
        final String password = "mockpassword";

        //Act
        tester.setPassword(password);
        final String getPassword = tester.getPassword();

        // Assert
        assertEquals(password, getPassword, "getPassword must be mockpassword");
    }
}
