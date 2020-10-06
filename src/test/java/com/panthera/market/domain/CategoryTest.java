package com.panthera.market.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryTest {

    @Test
    public void InstanceCategoryDefaultValues() {
        // Arrange & Act
        Category tester = new Category();


        // Assert
        assertEquals(tester.getCategoryId(), 0, "getCategoryId must be 0");
        assertNull(tester.getCategoryName(), "getCategoryName must be null");
        assertFalse(tester.isActive(), "isActive must be false");
    }


    @Test
    public void getAndSetCategoryId() {
        // Arrange
        Category tester = new Category();
        final int categoryId = 5;

        //Act
        tester.setCategoryId(categoryId);
        final int getCategoryId = tester.getCategoryId();

        // Assert
        assertEquals(getCategoryId, categoryId, "setCategoryId must be 5");
    }

    @Test
    public void getAndSetCategoryName() {
        // Arrange
        Category tester = new Category();
        final String categoryName = "My Category";

        //Act
        tester.setCategoryName(categoryName);
        final String getCategoryName = tester.getCategoryName();

        // Assert
        assertEquals(getCategoryName, categoryName, "setCategoryName must be My Category");
    }

    @Test
    public void getAndSetActive() {
        // Arrange
        Category tester = new Category();
        final boolean active = true;

        //Act
        tester.setActive(active);
        final boolean getActive = tester.isActive();

        // Assert
        assertEquals(getActive, active, "setCategoryName must be true");
    }
}
