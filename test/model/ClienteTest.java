/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Franco
 */
public class ClienteTest {
    
    public ClienteTest() {
    }

    @Test
    public void testGetNombreUsuario() {
        System.out.println("getNombreUsuario");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNombreUsuario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombreUsuario() {
        System.out.println("setNombreUsuario");
        String nombreUsuario = "";
        Cliente instance = new Cliente();
        instance.setNombreUsuario(nombreUsuario);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetContraseña() {
        System.out.println("getContrase\u00f1a");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getContraseña();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetContraseña() {
        System.out.println("setContrase\u00f1a");
        String contraseña = "";
        Cliente instance = new Cliente();
        instance.setContraseña(contraseña);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Cliente instance = new Cliente();
        instance.setTelefono(telefono);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Cliente instance = new Cliente();
        instance.setCorreo(correo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVerificarDatos() {
        System.out.println("verificarDatos");
        Cliente instance = new Cliente();
        instance.verificarDatos();
        fail("The test case is a prototype.");
    }
    
}
