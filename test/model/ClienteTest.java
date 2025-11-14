package model;

import org.junit.Test;
import static org.junit.Assert.*;


public class ClienteTest {

    public ClienteTest() {
    }

    @Test
    public void testGetNombreUsuario() {
        System.out.println("getNombreUsuario");
        Cliente instance = new Cliente();
        String result = instance.getNombreUsuario();
        assertTrue("El valor por defecto del usuario debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetNombreUsuario() {
        System.out.println("setNombreUsuario");
        String nombreUsuario = "franco";
        Cliente instance = new Cliente();
        instance.setNombreUsuario(nombreUsuario);
        assertEquals("El getter debe devolver el nombre de usuario establecido por el setter",
                nombreUsuario, instance.getNombreUsuario());
    }

    @Test
    public void testGetContraseña() {
        System.out.println("getContraseña");
        Cliente instance = new Cliente();
        String result = instance.getContraseña();
        assertTrue("El valor por defecto de la contraseña debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetContraseña() {
        System.out.println("setContraseña");
        String contraseña = "secreto jiji";
        Cliente instance = new Cliente();
        instance.setContraseña(contraseña);
        assertEquals("El getter debe devolver la contraseña establecida por el setter",
                contraseña, instance.getContraseña());
    }

    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        String result = instance.getTelefono();
        assertTrue("El valor por defecto del telefono debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "+56900000000";
        Cliente instance = new Cliente();
        instance.setTelefono(telefono);
        assertEquals("El getter debe devolver el teléfono establecido por el setter",
                telefono, instance.getTelefono());
    }

    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Cliente instance = new Cliente();
        String result = instance.getCorreo();
        assertTrue("El valor por defecto del correo debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "x@y.com";
        Cliente instance = new Cliente();
        instance.setCorreo(correo);
        assertEquals("El getter debe devolver el correo establecido por el setter",
                correo, instance.getCorreo());
    }
}
