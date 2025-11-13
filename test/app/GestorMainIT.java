package app;

import java.util.ArrayList;
import model.Cita;
import model.Cliente;
import model.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

public class GestorMainIT {

    public GestorMainIT() {}

    @Test
    public void testAgregarCita() {
        System.out.println("agregarCita");
        GestorMain instance = new GestorMain();

        Cita cita = new Cita("Chocolo", "Pepe Juan", "Lunes", "14:00", "Está enfermo");

        instance.agregarCita(cita);

        assertTrue(instance.getListaCitas().contains(cita));
    }

    @Test
    public void testEliminarCita() {
        System.out.println("eliminarCita");
        GestorMain instance = new GestorMain();

        Cita cita = new Cita("Chocolo", "Pepe Juan", "Lunes", "14:00", "Está enfermo");

        instance.agregarCita(cita);
        instance.eliminarCita(cita);

        assertFalse(instance.getListaCitas().contains(cita));
    }

    @Test
    public void testModificarCita() {
        System.out.println("modificarCita");
        GestorMain instance = new GestorMain();

        Cita citaOriginal = new Cita("Chocolo", "Pepe Juan", "Lunes", "14:00", "Está enfermo");
        instance.agregarCita(citaOriginal);

        Cita nuevaCita = new Cita("Chocolo", "Pepe Juan", "Martes", "16:00", "Control general");

        instance.modificarCita(0, nuevaCita);

        assertEquals(nuevaCita, instance.getListaCitas().get(0));
    }

    @Test
    public void testGetListaCitas() {
        System.out.println("getListaCitas");
        GestorMain instance = new GestorMain();

        assertNotNull(instance.getListaCitas());
        assertTrue(instance.getListaCitas().isEmpty());
    }

    @Test
    public void testAgregarCliente() {
        System.out.println("agregarCliente");
        GestorMain instance = new GestorMain();

        Cliente cliente = new Cliente(
                "Juanito",
                "123",
                "987654321",
                "juanito@gmail.com"
        );

        instance.agregarCliente(cliente);

        assertTrue(instance.getListaClientes().contains(cliente));
    }

    @Test
    public void testGetListaClientes() {
        System.out.println("getListaClientes");
        GestorMain instance = new GestorMain();

        assertNotNull(instance.getListaClientes());
        assertTrue(instance.getListaClientes().isEmpty());
    }

    @Test
    public void testAgregarMascotas() {
        System.out.println("agregarMascotas");
        GestorMain instance = new GestorMain();

        Mascota mascota = new Mascota(
                "Chocolo",
                "01",
                "Pastor Aleman",
                "5",
                "Macho",
                "Diarrea"
        );

        instance.agregarMascotas(mascota);

        assertTrue(instance.getListaMascotas().contains(mascota));
    }

    @Test
    public void testGetListaMascotas() {
        System.out.println("getListaMascotas");
        GestorMain instance = new GestorMain();

        assertNotNull(instance.getListaMascotas());
        assertTrue(instance.getListaMascotas().isEmpty());
    }
}
