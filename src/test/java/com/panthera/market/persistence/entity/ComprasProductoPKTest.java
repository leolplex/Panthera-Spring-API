package com.panthera.market.persistence.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ComprasProductoPKTest {
    ComprasProductoPK tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new ComprasProductoPK();
    }


    @Test
    void InstanceComprasProductoPKDefaultValues() {
        // Assert
        assertNull(tester.getIdCompra(), "getId must be null");
        assertNull(tester.getIdProducto(), "getCantidad must be null");
    }

    @Test
    void getAndSetIdCompra() {
        // Arrange
        final int idCompra = 198;

        //Act
        tester.setIdCompra(idCompra);
        final int getIdCompra = tester.getIdCompra();

        // Assert
        assertEquals(idCompra, getIdCompra, "setIdCompra must be 198");
    }

    @Test
    void getAndSetIdProducto() {
        // Arrange
        final int idProducto = 200;

        //Act
        tester.setIdProducto(idProducto);
        final int getIdProducto = tester.getIdProducto();

        // Assert
        assertEquals(idProducto, getIdProducto, "setIdProducto must be 200");
    }
}
