package com.panthera.market.web.controller;


import com.panthera.market.domain.Product;
import com.panthera.market.domain.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ProductControllerTest {
    ProductController tester;

    @BeforeEach
    void initEach() {
        // Arrange
        ProductService productService = Mockito.mock(ProductService.class);
        tester = new ProductController(productService);
    }

    @Test
    void getAll() {
        assertEquals(tester.getAll(), new ArrayList<>(), "getAll must be []");
    }

    @Test
    void getProduct() {
        assertEquals(tester.getProduct(1), Optional.empty(), "getProduct(1) must be Optional.empty()");
    }

    @Test
    void getByCategory() {
        assertEquals(tester.getByCategory(1), Optional.empty(), "getByCategory(1) must be Optional.empty()");
    }

    @Test
    void save() {
        assertNull(tester.save(new Product()), "save must be an instance of Product");
    }

    @Test
    void delete() {
        assertFalse(tester.delete(1), "delete must be false");
    }

}
