package com.panthera.market.persistence.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClienteTest {

    Cliente tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new Cliente();
    }

    @Test
    void InstanceClienteDefaultValues() {
        // Assert
        assertNull(tester.getId(), "getId must be null");
        assertNull(tester.getNombre(), "getNombre must be null");
        assertNull(tester.getApellidos(), "getApellidos must be null");
        assertNull(tester.getCelular(), "getCelular must be null");
        assertNull(tester.getDireccion(), "getDireccion must be null");
        assertNull(tester.getCorreoElectronico(), "getCorreoElectronico must be null");
        assertNull(tester.getCompras(), "getCompras must be null");
    }

    @Test
    void getAndSetId() {
        // Arrange
        Cliente tester = new Cliente();
        final int id = 100;

        //Act
        tester.setId(id);
        final int getId = tester.getId();

        // Assert
        assertEquals(id, getId, "setId must be 100");
    }

    @Test
    void getAndSetNombre() {
        // Arrange
        final String nombre = "My name";

        //Act
        tester.setNombre(nombre);
        final String getNombre = tester.getNombre();

        // Assert
        assertEquals(nombre, getNombre, "setNombre must be My name");
    }

    @Test
    void getAndSetApellidos() {
        // Arrange
        final String apellidos = "My lastname";

        //Act
        tester.setApellidos(apellidos);
        final String getApellidos = tester.getApellidos();

        // Assert
        assertEquals(apellidos, getApellidos, "setApellidos must be My lastname");
    }

    @Test
    void getAndSetCelular() {
        // Arrange
        final Long celular = 1234_5678_9012_3456L;

        //Act
        tester.setCelular(celular);
        final Long getCelular = tester.getCelular();

        // Assert
        assertEquals(celular, getCelular, "setApellidos must be 1234_5678_9012_3456L");
    }

    @Test
    void getAndSetDireccion() {
        // Arrange
        final String direccion = "My address";

        //Act
        tester.setDireccion(direccion);
        final String getDireccion = tester.getDireccion();

        // Assert
        assertEquals(direccion, getDireccion, "setDireccion must be My address");
    }

    @Test
    void getAndSetCorreoElectronico() {
        // Arrange
        final String correoElectronico = "myemail@email.com";

        //Act
        tester.setCorreoElectronico(correoElectronico);
        final String getCorreoElectronico = tester.getCorreoElectronico();

        // Assert
        assertEquals(correoElectronico, getCorreoElectronico, "setCorreoElectronico must be myemail@email.com");
    }

    @Test
    void getAndSetCompras() {
        // Arrange
        final List<Compra> compras = new ArrayList<>();

        //Act
        tester.setCompras(compras);
        final List<Compra> getCompras = tester.getCompras();

        // Assert
        assertEquals(compras, getCompras, "setCompras must be []");
    }
}
