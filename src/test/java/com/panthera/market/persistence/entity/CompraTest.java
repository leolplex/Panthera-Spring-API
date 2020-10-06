package com.panthera.market.persistence.entity;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CompraTest {

    @Test
    void InstanceCompraDefaultValues() {
        // Arrange & Act
        Compra tester = new Compra();

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
        Compra tester = new Compra();
        final int idCompra = 100;

        //Act
        tester.setIdCompra(idCompra);
        final int getIdCompra = tester.getIdCompra();

        // Assert
        assertEquals(getIdCompra, idCompra, "setIdCompra must be 100");
    }

    @Test
    void getAndSetIdCliente() {
        // Arrange
        Compra tester = new Compra();
        final String idCliente = "121451236";

        //Act
        tester.setIdCliente(idCliente);
        final String getIdCliente = tester.getIdCliente();

        // Assert
        assertEquals(getIdCliente, idCliente, "setIdCliente must be 121451236");
    }

    @Test
    void getAndSetFecha() {
        // Arrange
        Compra tester = new Compra();
        final LocalDateTime fecha = LocalDateTime.now();

        //Act
        tester.setFecha(fecha);
        final LocalDateTime getIdCliente = tester.getFecha();

        // Assert
        assertEquals(getIdCliente, fecha, "setFecha must be LocalDateTime.now()");
    }

    @Test
    void getAndSetMedioPago() {
        // Arrange
        Compra tester = new Compra();
        final String medioPago = "Efectivo";

        //Act
        tester.setMedioPago(medioPago);
        final String getMedioPago = tester.getMedioPago();

        // Assert
        assertEquals(getMedioPago, medioPago, "setMedioPago must be Efectivo");
    }

    @Test
    void getAndSetComentario() {
        // Arrange
        Compra tester = new Compra();
        final String comentario = "My comment";

        //Act
        tester.setComentario(comentario);
        final String getComentario = tester.getComentario();

        // Assert
        assertEquals(getComentario, comentario, "setComentario must be My comment");
    }


    @Test
    void getAndSetEstado() {
        // Arrange
        Compra tester = new Compra();
        final String estado = "My state";

        //Act
        tester.setEstado(estado);
        final String getEstado = tester.getEstado();

        // Assert
        assertEquals(getEstado, estado, "setComentario must be My state");
    }

    @Test
    void getAndSetCliente() {
        // Arrange
        Compra tester = new Compra();
        final Cliente cliente = new Cliente();

        //Act
        tester.setCliente(cliente);
        final Cliente getCliente = tester.getCliente();

        // Assert
        assertEquals(getCliente, cliente, "setComentario must be new Cliente()");
    }

    @Test
    void getAndSetProductos() {
        // Arrange
        Compra tester = new Compra();
        final List<ComprasProducto> productos = new ArrayList<>();

        //Act
        tester.setProductos(productos);
        final List<ComprasProducto> getProductos = tester.getProductos();

        // Assert
        assertEquals(getProductos, productos, "setComentario must be []");
    }
}
