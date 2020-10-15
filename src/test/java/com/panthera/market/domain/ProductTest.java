package com.panthera.market.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new Product();
    }

    @Test
    void InstanceProductDefaultValues() {
        // Assert
        assertEquals(0, tester.getProductId(), "getProductId must be 0");
        assertNull(tester.getName(), "getName must be null");
        assertEquals(0, tester.getCategoryId(), "getCategoryId must be 0");
        assertEquals(0.0d, tester.getPrice(), 0.0d, "getPrice must be 0.0d");
        assertEquals(0, tester.getStock(), "getStock must be 0");
        assertFalse(tester.isActive(), "isActive must be false");
        assertNull(tester.getCategory(), "getCategory must be null");
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
    void getAndSetName() {
        // Arrange
        final String name = "My Name";

        //Act
        tester.setName(name);
        final String getName = tester.getName();

        // Assert
        assertEquals(name, getName, "setName must be My Name");
    }


    @Test
    void getAndSetCategoryId() {
        // Arrange
        final int categoryId = 150;

        //Act
        tester.setCategoryId(categoryId);
        final int getCategoryId = tester.getCategoryId();

        // Assert
        assertEquals(categoryId, getCategoryId, "setCategoryId must be 150");
    }


    @Test
    void getAndSetPrice() {
        // Arrange
        final double price = 200.15;

        //Act
        tester.setPrice(price);
        final double getPrice = tester.getPrice();

        // Assert
        assertEquals(price, getPrice, "setPrice must be 200.15");
    }


    @Test
    void getAndSetStock() {
        // Arrange
        final int stock = 6500;

        //Act
        tester.setStock(stock);
        final int getStock = tester.getStock();

        // Assert
        assertEquals(stock, getStock, "setStock must be 6500");
    }


    @Test
    void getAndSetActive() {
        // Arrange
        final boolean active = true;

        //Act
        tester.setActive(active);
        final boolean getActive = tester.isActive();

        // Assert
        assertEquals(active, getActive, "setActive must be true");
    }


    @Test
    void getAndSetCategory() {
        // Arrange
        final Category category = new Category();

        //Act
        tester.setCategory(category);
        final Category getCategory = tester.getCategory();

        // Assert
        assertEquals(category, getCategory, "setCategory must be new Category()");
    }
}
