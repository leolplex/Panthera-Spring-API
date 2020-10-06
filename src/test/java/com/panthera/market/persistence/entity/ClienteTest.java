package com.panthera.market.persistence.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClienteTest {

    @Test
    void InstanceClienteDefaultValues() {
        // Arrange & Act
        Cliente tester = new Cliente();

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
        assertEquals(getId, id, "setId must be 100");
    }

    @Test
    void getAndSetNombre() {
        // Arrange
        Cliente tester = new Cliente();
        final String nombre = "My name";

        //Act
        tester.setNombre(nombre);
        final String getNombre = tester.getNombre();

        // Assert
        assertEquals(getNombre, nombre, "setNombre must be My name");
    }

    @Test
    void getAndSetApellidos() {
        // Arrange
        Cliente tester = new Cliente();
        final String apellidos = "My lastname";

        //Act
        tester.setApellidos(apellidos);
        final String getApellidos = tester.getApellidos();

        // Assert
        assertEquals(getApellidos, apellidos, "setApellidos must be My lastname");
    }

    @Test
    void getAndSetCelular() {
        // Arrange
        Cliente tester = new Cliente();
        final Long celular = 1234_5678_9012_3456L;

        //Act
        tester.setCelular(celular);
        final Long getCelular = tester.getCelular();

        // Assert
        assertEquals(getCelular, celular, "setApellidos must be 1234_5678_9012_3456L");
    }

    @Test
    void getAndSetDireccion() {
        // Arrange
        Cliente tester = new Cliente();
        final String direccion = "My address";

        //Act
        tester.setDireccion(direccion);
        final String getDireccion = tester.getDireccion();

        // Assert
        assertEquals(getDireccion, direccion, "setDireccion must be My address");
    }

    @Test
    void getAndSetCorreoElectronico() {
        // Arrange
        Cliente tester = new Cliente();
        final String correoElectronico = "myemail@email.com";

        //Act
        tester.setCorreoElectronico(correoElectronico);
        final String getCorreoElectronico = tester.getCorreoElectronico();

        // Assert
        assertEquals(getCorreoElectronico, correoElectronico, "setCorreoElectronico must be myemail@email.com");
    }

    @Test
    void getAndSetCompras() {
        // Arrange
        Cliente tester = new Cliente();
        final List<Compra> compras = new ArrayList<>();

        //Act
        tester.setCompras(compras);
        final List<Compra> getCompras = tester.getCompras();

        // Assert
        assertEquals(getCompras, compras, "setCompras must be []");
    }
}
