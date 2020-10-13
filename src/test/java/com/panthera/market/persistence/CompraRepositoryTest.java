package com.panthera.market.persistence;

import com.panthera.market.domain.Purchase;
import com.panthera.market.domain.PurchaseItem;
import com.panthera.market.persistence.crud.CompraCrudRepository;
import com.panthera.market.persistence.entity.Compra;
import com.panthera.market.persistence.entity.ComprasProducto;
import com.panthera.market.persistence.entity.ComprasProductoPK;
import com.panthera.market.persistence.entity.Producto;
import com.panthera.market.persistence.mapper.PurchaseMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.system.OutputCaptureRule;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

class CompraRepositoryTest {

    CompraRepository tester;
    PurchaseMapper mapper;

    @BeforeEach
    void initEach() {

        CompraCrudRepository compraCrudRepository = Mockito.mock(CompraCrudRepository.class);
        mapper = Mockito.mock(PurchaseMapper.class);
        tester = new CompraRepository(compraCrudRepository, mapper);
    }

    @Test
    void TestGetAllMethod() {
        // Act
        List<Purchase> getAll = tester.getAll();

        // Assert
        assertEquals(new ArrayList<>(), getAll, "getAll must be []");
    }

    @Test
    void TestGetByClientMethod() {
        // Act
        Optional<List<Purchase>> getByClient = tester.getByClient("104521");

        // Assert
        assertEquals(Optional.empty(), getByClient, "getByClient must be []");
    }

    @Test
    void TestSaveExceptionMethod() {
        try {
            Purchase save = tester.save(mock(Purchase.class));
        } catch (IllegalArgumentException ex) {
            assertEquals("Compra cannot be null", ex.getMessage(), "IllegalArgumentException");
        }
    }

    @Test
    void TestSaveMethod() {

        Purchase purchase = mock(Purchase.class);

        Mockito.when(mapper.toCompra(purchase)).thenReturn(mock(Compra.class));

        Purchase save = tester.save(purchase);

        assertNull(save, "save must be null");
    }
}
