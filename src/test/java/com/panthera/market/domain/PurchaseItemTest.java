package com.panthera.market.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseItemTest {

    PurchaseItem tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new PurchaseItem();
    }

    @Test
    void InstanceCategoryDefaultValues() {
        // Assert
        assertEquals(0, tester.getProductId(), "getPurchaseId must be 0");
        assertEquals(0, tester.getQuantity(), "getClientId must be 0");
        assertEquals(0, tester.getTotal(), "getDate must be 0");
        assertFalse(tester.isActive(), "isActive must be false");
    }

    @Test
    void getAndSetProductId() {
        // Arrange
        final int productId = 5;

        //Act
        tester.setProductId(productId);
        final int getProductId = tester.getProductId();

        // Assert
        assertEquals(productId, getProductId, "setProductId must be 5");
    }

    @Test
    void getAndSetQuantity() {
        // Arrange
        final int quantity = 1213;

        //Act
        tester.setQuantity(quantity);
        final int getQuantity = tester.getQuantity();

        // Assert
        assertEquals(quantity, getQuantity, "setPurchaseId must be 1213");
    }

    @Test
    void getAndSetTotal() {
        // Arrange
        final double total = 556464.254;

        //Act
        tester.setTotal(total);
        final double getTotal = tester.getTotal();

        // Assert
        assertEquals(total, getTotal, "setPurchaseId must be 556464.254");
    }

    @Test
    void getAndSetActive() {
        // Arrange
        final boolean active = true;

        //Act
        tester.setActive(active);
        final boolean isActive = tester.isActive();

        // Assert
        assertEquals(active, isActive, "setActive must be true");
    }
}
