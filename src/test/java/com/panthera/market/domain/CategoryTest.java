package com.panthera.market.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new Category();
    }

    @Test
    void InstanceCategoryDefaultValues() {

        // Assert
        assertEquals(0, tester.getCategoryId(), "getCategoryId must be 0");
        assertNull(tester.getCategoryName(), "getCategoryName must be null");
        assertFalse(tester.isActive(), "isActive must be false");
    }


    @Test
    void getAndSetCategoryId() {
        // Arrange
        final int categoryId = 5;

        //Act
        tester.setCategoryId(categoryId);
        final int getCategoryId = tester.getCategoryId();

        // Assert
        assertEquals(categoryId, getCategoryId, "setCategoryId must be 5");
    }

    @Test
    void getAndSetCategoryName() {
        // Arrange
        final String categoryName = "My Category";

        //Act
        tester.setCategoryName(categoryName);
        final String getCategoryName = tester.getCategoryName();

        // Assert
        assertEquals(categoryName, getCategoryName, "setCategoryName must be My Category");
    }

    @Test
    void getAndSetActive() {
        // Arrange
        final boolean active = true;

        //Act
        tester.setActive(active);
        final boolean getActive = tester.isActive();

        // Assert
        assertEquals(active, getActive, "setCategoryName must be true");
    }
}
