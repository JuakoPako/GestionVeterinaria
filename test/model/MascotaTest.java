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
public class MascotaTest {
    
    public MascotaTest() {
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Mascota instance = new Mascota();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEspecie() {
        System.out.println("getEspecie");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.getEspecie();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEspecie() {
        System.out.println("setEspecie");
        String especie = "";
        Mascota instance = new Mascota();
        instance.setEspecie(especie);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRaza() {
        System.out.println("getRaza");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.getRaza();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRaza() {
        System.out.println("setRaza");
        String raza = "";
        Mascota instance = new Mascota();
        instance.setRaza(raza);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.getEdad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        String edad = "";
        Mascota instance = new Mascota();
        instance.setEdad(edad);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Mascota instance = new Mascota();
        instance.setSexo(sexo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetObservaciones() {
        System.out.println("getObservaciones");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.getObservaciones();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetObservaciones() {
        System.out.println("setObservaciones");
        String observaciones = "";
        Mascota instance = new Mascota();
        instance.setObservaciones(observaciones);
        fail("The test case is a prototype.");
    }
    
}
