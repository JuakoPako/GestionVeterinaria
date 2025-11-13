/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Franco
 */
public class VeterinarioTest {
    
    public VeterinarioTest() {
    }

    @Test
    public void testGetNombreVeterinario() {
        System.out.println("getNombreVeterinario");
        Veterinario instance = new Veterinario();
        String expResult = "";
        String result = instance.getNombreVeterinario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombreVeterinario() {
        System.out.println("setNombreVeterinario");
        String nombreVeterinario = "";
        Veterinario instance = new Veterinario();
        instance.setNombreVeterinario(nombreVeterinario);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEspecialidad() {
        System.out.println("getEspecialidad");
        Veterinario instance = new Veterinario();
        String expResult = "";
        String result = instance.getEspecialidad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEspecialidad() {
        System.out.println("setEspecialidad");
        String especialidad = "";
        Veterinario instance = new Veterinario();
        instance.setEspecialidad(especialidad);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTelefonoVeterinario() {
        System.out.println("getTelefonoVeterinario");
        Veterinario instance = new Veterinario();
        String expResult = "";
        String result = instance.getTelefonoVeterinario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTelefonoVeterinario() {
        System.out.println("setTelefonoVeterinario");
        String telefonoVeterinario = "";
        Veterinario instance = new Veterinario();
        instance.setTelefonoVeterinario(telefonoVeterinario);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHorasDisponibles() {
        System.out.println("getHorasDisponibles");
        Veterinario instance = new Veterinario();
        List<String> expResult = null;
        List<String> result = instance.getHorasDisponibles();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHorasDisponibles() {
        System.out.println("setHorasDisponibles");
        List<String> horasDisponibles = null;
        Veterinario instance = new Veterinario();
        instance.setHorasDisponibles(horasDisponibles);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Veterinario instance = new Veterinario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
