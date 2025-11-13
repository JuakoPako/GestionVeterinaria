/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package app;

import java.util.ArrayList;
import model.Cita;
import model.Cliente;
import model.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Franco
 */
public class GestorMainTest {
    
    public GestorMainTest() {
    }

    @Test
    public void testAgregarCita() {
        System.out.println("agregarCita");
        Cita cita = null;
        GestorMain instance = new GestorMain();
        instance.agregarCita(cita);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEliminarCita() {
        System.out.println("eliminarCita");
        Cita cita = null;
        GestorMain instance = new GestorMain();
        instance.eliminarCita(cita);
        fail("The test case is a prototype.");
    }

    @Test
    public void testModificarCita() {
        System.out.println("modificarCita");
        int index = 0;
        Cita nuevaCita = null;
        GestorMain instance = new GestorMain();
        instance.modificarCita(index, nuevaCita);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaCitas() {
        System.out.println("getListaCitas");
        GestorMain instance = new GestorMain();
        ArrayList<Cita> expResult = null;
        ArrayList<Cita> result = instance.getListaCitas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAgregarCliente() {
        System.out.println("agregarCliente");
        Cliente cliente = null;
        GestorMain instance = new GestorMain();
        instance.agregarCliente(cliente);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaClientes() {
        System.out.println("getListaClientes");
        GestorMain instance = new GestorMain();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getListaClientes();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAgregarMascotas() {
        System.out.println("agregarMascotas");
        Mascota mascota = null;
        GestorMain instance = new GestorMain();
        instance.agregarMascotas(mascota);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaMascotas() {
        System.out.println("getListaMascotas");
        GestorMain instance = new GestorMain();
        ArrayList<Mascota> expResult = null;
        ArrayList<Mascota> result = instance.getListaMascotas();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
