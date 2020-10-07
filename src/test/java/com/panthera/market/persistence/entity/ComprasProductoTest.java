package com.panthera.market.persistence.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ComprasProductoTest {
    ComprasProducto tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new ComprasProducto();
    }


    @Test
    void InstanceComprasProductoDefaultValues() {
        // Assert
        assertNull(tester.getId(), "getId must be null");
        assertNull(tester.getCantidad(), "getCantidad must be null");
        assertNull(tester.getTotal(), "getTotal must be null");
        assertNull(tester.getEstado(), "getEstado must be null");
        assertNull(tester.getCompra(), "getCompra must be null");
        assertNull(tester.getProducto(), "getProducto must be null");
    }

    @Test
    void getAndSetId() {
        // Arrange
        ComprasProducto tester = new ComprasProducto();
        final ComprasProductoPK id = new ComprasProductoPK();

        //Act
        tester.setId(id);
        final ComprasProductoPK getId = tester.getId();

        // Assert
        assertEquals(id, getId, "setId must be new ComprasProductoPK()");
    }

    @Test
    void getAndSetCantidad() {
        // Arrange
        final int cantidad = 150;

        //Act
        tester.setCantidad(cantidad);
        final int getCantidad = tester.getCantidad();

        // Assert
        assertEquals(cantidad, getCantidad, "setCantidad must be 150");
    }

    @Test
    void getAndSetTotal() {
        // Arrange
        final double total = 150.30;

        //Act
        tester.setTotal(total);
        final double getTotal = tester.getTotal();

        // Assert
        assertEquals(total, getTotal, "setTotal must be 150.30");
    }

    @Test
    void getAndSetEstado() {
        // Arrange
        final boolean estado = true;

        //Act
        tester.setEstado(estado);
        final boolean getEstado = tester.getEstado();

        // Assert
        assertEquals(estado, getEstado, "setEstado must be true");
    }

    @Test
    void getAndSetCompra() {
        // Arrange
        final Compra compra = new Compra();

        //Act
        tester.setCompra(compra);
        final Compra getCompra = tester.getCompra();

        // Assert
        assertEquals(compra, getCompra, "setCompra must be new Compra()");
    }

    @Test
    void getAndSetProducto() {
        // Arrange
        final Producto producto = new Producto();

        //Act
        tester.setProducto(producto);
        final Producto getProducto = tester.getProducto();

        // Assert
        assertEquals(producto, getProducto, "setProducto must be new Compra()");
    }
}
