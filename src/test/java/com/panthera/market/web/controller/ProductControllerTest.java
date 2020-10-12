package com.panthera.market.web.controller;


import com.panthera.market.domain.Category;
import com.panthera.market.domain.Product;
import com.panthera.market.domain.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {

    @Autowired
    private ProductService productService;

    ProductController tester;


    @BeforeEach
    void initEach() {
        // Arrange
        productService = Mockito.mock(ProductService.class);
        tester = new ProductController(productService);
    }

    @Test
    void getAll() {
        assertEquals(new ResponseEntity<>(new ArrayList<Product>(), HttpStatus.OK), tester.getAll(), "getAll must be OK");
    }

    @Test
    void getProductNotFound() {
        assertEquals(new ResponseEntity<>(HttpStatus.NOT_FOUND), tester.getProduct(1), "getProduct(1) must be NOT_FOUND");
    }

    @Test
    void getProductOk() {
        Category category = new Category();
        category.setActive(true);
        category.setCategoryId(1);
        category.setCategoryName("legumbres");
        Product product = new Product();
        product.setProductId(1);
        product.setActive(true);
        product.setCategory(category);
        product.setCategoryId(1);
        product.setName("remolacha");
        product.setStock(10);
        product.setPrice(10);
        Optional<Product> optionalProduct = Optional.of(product);
        Mockito.when(productService.getProduct(1)).thenReturn(optionalProduct);

        assertEquals(new ResponseEntity<>(product, HttpStatus.OK), tester.getProduct(1), "getProduct(1) must be Ok");
    }

    @Test
    void getByCategoryNotFound() {
        assertEquals(new ResponseEntity<>(HttpStatus.NOT_FOUND), tester.getByCategory(1), "getByCategory(1) must be NOT_FOUND");
    }

    @Test
    void getByCategoryOk() {
        Category category = new Category();
        category.setActive(true);
        category.setCategoryId(1);
        category.setCategoryName("legumbres");
        Product product = new Product();
        product.setProductId(1);
        product.setActive(true);
        product.setCategory(category);
        product.setCategoryId(1);
        product.setName("remolacha");
        product.setStock(10);
        product.setPrice(10);
        List<Product> products = new ArrayList<>();
        products.add(product);
        Optional<List<Product>> optionalProduct = Optional.of(products);
        Mockito.when(productService.getByCategory(1)).thenReturn(optionalProduct);

        assertEquals(new ResponseEntity<>(products, HttpStatus.OK), tester.getByCategory(1), "getByCategory(1) must be OK");
    }

    @Test
    void save() {
        assertEquals(new ResponseEntity<>(HttpStatus.CREATED), tester.save(new Product()), "save must be an instance of CREATED");
    }

    @Test
    void deleteNotFound() {
        assertEquals(new ResponseEntity<>(HttpStatus.NOT_FOUND), tester.delete(1), "delete must be NOT_FOUND");
    }

    @Test
    void deleteOk() {
        Mockito.when(productService.delete(1)).thenReturn(true);
        assertEquals(new ResponseEntity<>(HttpStatus.OK), tester.delete(1), "delete must be OK");
    }

}
