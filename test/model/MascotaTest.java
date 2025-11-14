package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class MascotaTest {

    public MascotaTest() {
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Mascota instance = new Mascota();
        String result = instance.getNombre();
        assertTrue("El valor por defecto del nombre de la mascota debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Pelusa";
        Mascota instance = new Mascota();
        instance.setNombre(nombre);
        assertEquals("El getter debe devolver el nombre establecido por el setter", nombre, instance.getNombre());
    }

    @Test
    public void testGetEspecie() {
        System.out.println("getEspecie");
        Mascota instance = new Mascota();
        String result = instance.getEspecie();
        assertTrue("El valor por defecto de la especie de la mascota debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetEspecie() {
        System.out.println("setEspecie");
        String especie = "Perro";
        Mascota instance = new Mascota();
        instance.setEspecie(especie);
        assertEquals("El getter debe devolver la especie de la mascota establecida por el setter", especie, instance.getEspecie());
    }

    @Test
    public void testGetRaza() {
        System.out.println("getRaza");
        Mascota instance = new Mascota();
        String result = instance.getRaza();
        assertTrue("El valor por defecto de la raza debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetRaza() {
        System.out.println("setRaza");
        String raza = "Caniche";
        Mascota instance = new Mascota();
        instance.setRaza(raza);
        assertEquals("El getter debe devolver la raza establecida por el setter", raza, instance.getRaza());
    }

    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Mascota instance = new Mascota();
        String result = instance.getEdad();
        assertTrue("El valor por defecto de la edad debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        String edad = "5";
        Mascota instance = new Mascota();
        instance.setEdad(edad);
        assertEquals("El getter debe devolver la edad establecida por el setter", edad, instance.getEdad());
    }

    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Mascota instance = new Mascota();
        String result = instance.getSexo();
        assertTrue("El valor por defecto del sexo de la mascota debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "Macho";
        Mascota instance = new Mascota();
        instance.setSexo(sexo);
        assertEquals("El getter debe devolver el sexo establecido por el setter", sexo, instance.getSexo());
    }

    @Test
    public void testGetObservaciones() {
        System.out.println("getObservaciones");
        Mascota instance = new Mascota();
        String result = instance.getObservaciones();
        assertTrue("El valor por defecto de las observaciones debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetObservaciones() {
        System.out.println("setObservaciones");
        String observaciones = "Vomitos";
        Mascota instance = new Mascota();
        instance.setObservaciones(observaciones);
        assertEquals("El getter debe devolver las observaciones establecidas por el setter",
                observaciones, instance.getObservaciones());
    }

}
