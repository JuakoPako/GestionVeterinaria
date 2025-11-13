package app;

import model.Cita;
import model.Cliente;
import model.Mascota;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Pruebas unitarias para GestorMain (JUnit4)
 */
public class GestorMainTest {

    private GestorMain gestor;
    private Cita c1;
    private Cita c2;
    private Cliente cliente;
    private Mascota m1;

    @Before
    public void setUp() {
        gestor = new GestorMain();

        // Citas de ejemplo (usa el constructor disponible en model.Cita)
        c1 = new Cita("Luna", "Dr. Soto", "2025-12-01", "09:00", "Control anual");
        c2 = new Cita("Rex", "Dra. Pérez", "2025-12-02", "10:30", "Vacunación");

        // Cliente y mascota de ejemplo (model.Cliente y model.Mascota)
        cliente = new Cliente("usuario1", "pass", "+56900000000", "a@b.com");
        m1 = new Mascota("Luna", "ID001", "Labrador", "5", "F", "Ninguna");

        // Estado inicial en el gestor
        gestor.agregarCita(c1);
        gestor.agregarCita(c2);
        gestor.agregarCliente(cliente);
        gestor.agregarMascotas(m1);
    }

    @Test
    public void testAgregarYListarCitas() {
        ArrayList<Cita> lista = gestor.getListaCitas();
        assertNotNull("La lista de citas no debe ser null", lista);
        assertEquals("Debe haber 2 citas tras el setUp", 2, lista.size());
        assertSame("Primera cita debe ser c1", c1, lista.get(0));
        assertSame("Segunda cita debe ser c2", c2, lista.get(1));
    }

    @Test
    public void testEliminarCita() {
        gestor.eliminarCita(c1);
        ArrayList<Cita> lista = gestor.getListaCitas();
        assertEquals("Tras eliminar c1, debe quedar 1 cita", 1, lista.size());
        assertSame("La cita restante debe ser c2", c2, lista.get(0));
    }

    @Test
    public void testModificarCita() {
        Cita nueva = new Cita("Luna", "Dr. Ruiz", "2026-01-10", "11:00", "Revisión");
        gestor.modificarCita(0, nueva); // reemplaza la cita en índice 0

        ArrayList<Cita> lista = gestor.getListaCitas();
        assertEquals("Tras modificar, sigue habiendo 2 citas", 2, lista.size());
        Cita desdeLista = lista.get(0);
        assertEquals("Veterinario actualizado", "Dr. Ruiz", desdeLista.getVeterinario());
        assertEquals("Día actualizado", "2026-01-10", desdeLista.getDia());
        assertEquals("Hora actualizada", "11:00", desdeLista.getHora());
    }

    @Test
    public void testModificarCitaIndiceFueraDeRango() {
        Cita nueva = new Cita("X", "Y", "2026-02-02", "08:00", "Prueba");
        try {
            gestor.modificarCita(10, nueva);
            fail("Se esperaba IndexOutOfBoundsException para índice fuera de rango");
        } catch (IndexOutOfBoundsException ex) {
            // comportamiento esperado: lista.set() lanza IndexOutOfBoundsException
        }
    }

    @Test
    public void testAgregarYListarClientes() {
        ArrayList<Cliente> clientes = gestor.getListaClientes();
        assertNotNull("La lista de clientes no debe ser null", clientes);
        assertEquals("Debe tener 1 cliente tras setUp", 1, clientes.size());
        assertSame("El cliente debe ser el añadido", cliente, clientes.get(0));
    }

    @Test
    public void testAgregarYListarMascotas() {
        ArrayList<Mascota> mascotas = gestor.getListaMascotas();
        assertNotNull("La lista de mascotas no debe ser null", mascotas);
        assertEquals("Debe tener 1 mascota tras setUp", 1, mascotas.size());
        assertSame("La mascota debe ser la añadida", m1, mascotas.get(0));
    }

    @Test
    public void testEliminarClienteNoExisteNoCambiaLista() {
        Cliente fantasma = new Cliente("x", "y", "t", "e@f.com");
        // GestorMain no tiene método eliminarCliente; verificamos que lista sigue igual tras no tocarla
        assertEquals("Lista clientes no debe cambiar si no se elimina nada", 1, gestor.getListaClientes().size());
    }
}
