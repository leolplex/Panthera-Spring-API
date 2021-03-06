package com.panthera.market.persistence;


import com.panthera.market.domain.Product;

import com.panthera.market.persistence.crud.ProductoCrudRepository;
import com.panthera.market.persistence.mapper.ProductMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;


class ProductoRepositoryTest {
    ProductoRepository tester;

    @BeforeEach
    void initEach() {

        ProductoCrudRepository productoCrudRepository = Mockito.mock(ProductoCrudRepository.class);
        ProductMapper mapper = Mockito.mock(ProductMapper.class);
        tester = new ProductoRepository(productoCrudRepository, mapper);
    }

    @Test
    void TestGetAllMethod() {
        // Act
        List<Product> getAll = tester.getAll();

        // Assert
        assertEquals(new ArrayList<>(), getAll, "getAll must be []");
    }

    @Test
    void TestGetByCategoryMethod() {
        // Act
        Optional<List<Product>> getByCategory = tester.getByCategory(10);

        // Assert
        assertEquals(Optional.of(new ArrayList<Product>()), getByCategory, "getByCategory must be []");
    }

    @Test
    void TestGetScarseProductsMethod() {
        // Act
        Optional<List<Product>> getScarseProducts = tester.getScarseProducts(10);

        // Assert
        assertEquals(Optional.empty(), getScarseProducts, "getScarseProducts must be Optional.empty()");
    }

    @Test
    void TestGetProductMethod() {
        // Act
        Optional<Product> getProduct = tester.getProduct(10);

        // Assert
        assertEquals(Optional.empty(), getProduct, "getProduct must be Optional.empty()");
    }

    @Test
    void TestSaveMethod() {
        // Act
        Product save = tester.save(mock(Product.class));

        // Assert
        assertNull(save, "save must be null");
    }

    @Test
    void TestDeleteMethod() {
        // Act
        tester.delete(15);

        // Act & Assert
        assertEquals(tester.getProduct(15), Optional.empty(), "tester.productoCrudRepository must  be tester.productoCrudRepository");
    }


}
