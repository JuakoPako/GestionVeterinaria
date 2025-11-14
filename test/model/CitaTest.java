package model;

import org.junit.Test;
import static org.junit.Assert.*;


public class CitaTest {

    public CitaTest() {
    }

    @Test
    public void testGetNombreMascota() {
        System.out.println("getNombreMascota");
        Cita instance = new Cita();
        String result = instance.getNombreMascota();
        assertTrue("El valor por defecto de nombreMascota debe ser null o vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetNombreMascota() {
        System.out.println("setNombreMascota");
        String nombreMascota = "Miguel";
        Cita instance = new Cita();
        instance.setNombreMascota(nombreMascota);
        String result = instance.getNombreMascota();
        assertEquals("El getter debe devolver el valor establecido por el setter", nombreMascota, result);
    }

    @Test
    public void testGetVeterinario() {
        System.out.println("getVeterinario");
        Cita instance = new Cita();
        String result = instance.getVeterinario();
        assertTrue("El valor por defecto de veterinario debe ser null o cadena vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetVeterinario() {
        System.out.println("setVeterinario");
        String veterinario = "Dr Perez";
        Cita instance = new Cita();
        instance.setVeterinario(veterinario);
        assertEquals("El getter debe devolver el veterinario establecido por el setter", veterinario, instance.getVeterinario());
    }

    @Test
    public void testGetDia() {
        System.out.println("getDia");
        Cita instance = new Cita();
        String result = instance.getDia();
        assertTrue("El valor por defecto de dia debe ser null o cadena vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetDia() {
        System.out.println("setDia");
        String fecha = "2025-11-13";
        Cita instance = new Cita();
        instance.setDia(fecha);
        assertEquals("El getter debe devolver la fecha establecida por el setter", fecha, instance.getDia());
    }

    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Cita instance = new Cita();
        String result = instance.getHora();
        assertTrue("El valor por defecto de hora debe ser null o cadena vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "09:30";
        Cita instance = new Cita();
        instance.setHora(hora);
        assertEquals("El getter debe devolver la hora establecida por el setter", hora, instance.getHora());
    }

    @Test
    public void testGetMotivo() {
        System.out.println("getMotivo");
        Cita instance = new Cita();
        String result = instance.getMotivo();
        assertTrue("El valor por defecto de motivo debe ser null o cadena vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetMotivo() {
        System.out.println("setMotivo");
        String motivo = "Control anual";
        Cita instance = new Cita();
        instance.setMotivo(motivo);
        assertEquals("El getter debe devolver el motivo establecido por el setter", motivo, instance.getMotivo());
    }
}
