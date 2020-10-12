package com.panthera.market.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseTest {
    Purchase tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new Purchase();
    }

    @Test
    void InstanceCategoryDefaultValues() {

        // Assert
        assertEquals(0, tester.getPurchaseId(), "getPurchaseId must be 0");
        assertNull(tester.getClientId(), "getClientId must be Null");
        assertNull(tester.getDate(), "getDate must be Null");
        assertNull(tester.getPaymentMethod(), "getPaymentMethod must be Null");
        assertNull(tester.getComment(), "getComment must be Null");
        assertNull(tester.getState(), "getState must be Null");
        assertNull(tester.getItem(), "getState must be Null");
    }

    @Test
    void getAndSetPurchaseId() {
        // Arrange
        final int purchaseId = 5;

        //Act
        tester.setPurchaseId(purchaseId);
        final int getPurchaseId = tester.getPurchaseId();

        // Assert
        assertEquals(purchaseId, getPurchaseId, "setPurchaseId must be 5");
    }

    @Test
    void getAndSetClientId() {
        // Arrange
        final String clientId = "My client";

        //Act
        tester.setClientId(clientId);
        final String getClientId = tester.getClientId();

        // Assert
        assertEquals(clientId, getClientId, "getClientId must be My client");
    }

    @Test
    void getAndSetDate() {
        // Arrange
        final LocalDateTime date = LocalDateTime.now();

        //Act
        tester.setDate(date);
        final LocalDateTime getDate = tester.getDate();

        // Assert
        assertEquals(date, getDate, "setDate must be LocalDateTime.now()");
    }

    @Test
    void getAndSetPaymentMethod() {
        // Arrange
        final String paymentMethod = "Credit Card";

        //Act
        tester.setPaymentMethod(paymentMethod);
        final String getPaymentMethod = tester.getPaymentMethod();

        // Assert
        assertEquals(paymentMethod, getPaymentMethod, "setPaymentMethod must be Credit Card");
    }

    @Test
    void getAndSetComment() {
        // Arrange
        final String comment = "my new comment";

        //Act
        tester.setComment(comment);
        final String getComment = tester.getComment();

        // Assert
        assertEquals(comment, getComment, "setComment must be my new comment");
    }

    @Test
    void getAndSetState() {
        // Arrange
        final String state = "In progress";

        //Act
        tester.setState(state);
        final String getState = tester.getState();

        // Assert
        assertEquals(state, getState, "setState must be In Progress");
    }

    @Test
    void getAndSetItem() {
        // Arrange
        final List<PurchaseItem> items = new ArrayList<>();

        //Act
        tester.setItem(items);
        final List<PurchaseItem> getItem = tester.getItem();

        // Assert
        assertEquals(items, getItem, "setItem must be new ArrayList<>()");
    }
}
