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
public class CitaTest {
    
    public CitaTest() {
    }

    @Test
    public void testGetNombreMascota() {
        System.out.println("getNombreMascota");
        Cita instance = new Cita();
        String expResult = "";
        String result = instance.getNombreMascota();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombreMascota() {
        System.out.println("setNombreMascota");
        String nombreMascota = "";
        Cita instance = new Cita();
        instance.setNombreMascota(nombreMascota);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetVeterinario() {
        System.out.println("getVeterinario");
        Cita instance = new Cita();
        String expResult = "";
        String result = instance.getVeterinario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetVeterinario() {
        System.out.println("setVeterinario");
        String veterinario = "";
        Cita instance = new Cita();
        instance.setVeterinario(veterinario);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDia() {
        System.out.println("getDia");
        Cita instance = new Cita();
        String expResult = "";
        String result = instance.getDia();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetDia() {
        System.out.println("setDia");
        String fecha = "";
        Cita instance = new Cita();
        instance.setDia(fecha);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Cita instance = new Cita();
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        Cita instance = new Cita();
        instance.setHora(hora);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMotivo() {
        System.out.println("getMotivo");
        Cita instance = new Cita();
        String expResult = "";
        String result = instance.getMotivo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMotivo() {
        System.out.println("setMotivo");
        String motivo = "";
        Cita instance = new Cita();
        instance.setMotivo(motivo);
        fail("The test case is a prototype.");
    }
    
}
