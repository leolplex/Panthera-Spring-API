package com.panthera.market.domain.service;

import com.panthera.market.domain.Category;
import com.panthera.market.domain.Product;
import com.panthera.market.domain.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    @Autowired
    private ProductRepository productRepository;

    ProductService tester;

    @BeforeEach
    void initEach() {
        // Arrange
        productRepository = Mockito.mock(ProductRepository.class);
        tester = new ProductService(productRepository);
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
    void deleteFalse() {
        assertFalse(tester.delete(1), "delete must be false");
    }

    @Test
    void deleteTrue() {
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
        Mockito.when(productRepository.getProduct(1)).thenReturn(optionalProduct);

        assertTrue(tester.delete(1), "delete must be true");
    }
}
