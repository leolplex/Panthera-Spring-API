package com.panthera.market.persistence.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CompraTest {

    Compra tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new Compra();
    }

    @Test
    void InstanceCompraDefaultValues() {


        // Assert
        assertNull(tester.getIdCompra(), "getIdCompra must be null");
        assertNull(tester.getIdCliente(), "getIdCliente must be null");
        assertNull(tester.getFecha(), "getFecha must be null");
        assertNull(tester.getMedioPago(), "getMedioPago must be null");
        assertNull(tester.getComentario(), "getComentario must be null");
        assertNull(tester.getEstado(), "getEstado must be null");
        assertNull(tester.getCliente(), "getCliente must be null");
        assertNull(tester.getProductos(), "getProductos must be null");
    }

    @Test
    void getAndSetIdCompra() {
        // Arrange
        final int idCompra = 100;

        //Act
        tester.setIdCompra(idCompra);
        final int getIdCompra = tester.getIdCompra();

        // Assert
        assertEquals(idCompra, getIdCompra, "setIdCompra must be 100");
    }

    @Test
    void getAndSetIdCliente() {
        // Arrange
        final String idCliente = "121451236";

        //Act
        tester.setIdCliente(idCliente);
        final String getIdCliente = tester.getIdCliente();

        // Assert
        assertEquals(idCliente, getIdCliente, "setIdCliente must be 121451236");
    }

    @Test
    void getAndSetFecha() {
        // Arrange
        final LocalDateTime fecha = LocalDateTime.now();

        //Act
        tester.setFecha(fecha);
        final LocalDateTime getIdCliente = tester.getFecha();

        // Assert
        assertEquals(fecha, getIdCliente, "setFecha must be LocalDateTime.now()");
    }

    @Test
    void getAndSetMedioPago() {
        // Arrange
        final String medioPago = "Efectivo";

        //Act
        tester.setMedioPago(medioPago);
        final String getMedioPago = tester.getMedioPago();

        // Assert
        assertEquals(medioPago, getMedioPago, "setMedioPago must be Efectivo");
    }

    @Test
    void getAndSetComentario() {
        // Arrange
        final String comentario = "My comment";

        //Act
        tester.setComentario(comentario);
        final String getComentario = tester.getComentario();

        // Assert
        assertEquals(comentario, getComentario, "setComentario must be My comment");
    }


    @Test
    void getAndSetEstado() {
        // Arrange
        final String estado = "My state";

        //Act
        tester.setEstado(estado);
        final String getEstado = tester.getEstado();

        // Assert
        assertEquals(estado, getEstado, "setComentario must be My state");
    }

    @Test
    void getAndSetCliente() {
        // Arrange
        final Cliente cliente = new Cliente();

        //Act
        tester.setCliente(cliente);
        final Cliente getCliente = tester.getCliente();

        // Assert
        assertEquals(cliente, getCliente, "setComentario must be new Cliente()");
    }

    @Test
    void getAndSetProductos() {
        // Arrange
        final List<ComprasProducto> productos = new ArrayList<>();

        //Act
        tester.setProductos(productos);
        final List<ComprasProducto> getProductos = tester.getProductos();

        // Assert
        assertEquals(productos, getProductos, "setComentario must be []");
    }
}
