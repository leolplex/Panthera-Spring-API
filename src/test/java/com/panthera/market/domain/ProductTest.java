package com.panthera.market.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void getAndSetProductId() {
        // Arrange
        Product tester = new Product();
        final int productId = 5;

        //Act
        tester.setProductId(productId);
        final int getProductId = tester.getProductId();

        // Assert
        assertEquals(getProductId, productId, "setProductId must be 5");
    }

    @Test
    public void getAndSetName() {
        // Arrange
        Product tester = new Product();
        final String name = "My Name";

        //Act
        tester.setName(name);
        final String getName = tester.getName();

        // Assert
        assertEquals(getName, name, "setName must be My Name");
    }


    @Test
    public void getAndSetCategoryId() {
        // Arrange
        Product tester = new Product();
        final int categoryId = 150;

        //Act
        tester.setCategoryId(categoryId);
        final int getCategoryId = tester.getCategoryId();

        // Assert
        assertEquals(getCategoryId, categoryId, "setCategoryId must be 150");
    }



    @Test
    public void getAndSetPrice() {
        // Arrange
        Product tester = new Product();
        final double price = 200.15;

        //Act
        tester.setPrice(price);
        final double getPrice = tester.getPrice();

        // Assert
        assertEquals(getPrice, price, "setPrice must be 200.15");
    }




    @Test
    public void getAndSetStock() {
        // Arrange
        Product tester = new Product();
        final int stock = 6500;

        //Act
        tester.setStock(stock);
        final int getStock = tester.getStock();

        // Assert
        assertEquals(getStock, stock, "setStock must be 6500");
    }



    @Test
    public void getAndSetActive() {
        // Arrange
        Product tester = new Product();
        final boolean active = true;

        //Act
        tester.setActive(active);
        final boolean getActive = tester.isActive();

        // Assert
        assertEquals(getActive, active, "setActive must be true");
    }



    @Test
    public void getAndSetCategory() {
        // Arrange
        Product tester = new Product();
        final Category category = new Category();

        //Act
        tester.setCategory(category);
        final Category getCategory = tester.getCategory();

        // Assert
        assertEquals(getCategory, category, "setCategory must be new Category()");
    }
}
