package app;

import model.Cita;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Tests unitarios para operaciones sobre citas usando GestorMain
 * (JUnit4)
 */
public class ActualizarCitaTest {

    private GestorMain gestor;
    private Cita c1;
    private Cita c2;

    @Before
    public void setUp() {
        gestor = new GestorMain();

        c1 = new Cita("Luna", "Dr. Soto", "2025-12-01", "09:00", "Control anual");
        c2 = new Cita("Rex", "Dra. Pérez", "2025-12-02", "10:30", "Vacunación");

        gestor.agregarCita(c1);
        gestor.agregarCita(c2);
    }

    @Test
    public void testAgregarCitasYListar() {
        ArrayList<Cita> lista = gestor.getListaCitas();
        assertNotNull("La lista de citas no debe ser null", lista);
        assertEquals("Debe tener 2 citas tras el setup", 2, lista.size());
        assertSame("La primera cita debe ser c1", c1, lista.get(0));
        assertSame("La segunda cita debe ser c2", c2, lista.get(1));
    }

    @Test
    public void testModificarCitaPorIndice() {
        // crear nueva cita para reemplazar en el índice 0
        Cita nueva = new Cita("Luna", "Dr. Ruiz", "2025-12-01", "11:00", "Control modificado");
        gestor.modificarCita(0, nueva);

        ArrayList<Cita> lista = gestor.getListaCitas();
        assertEquals("Después de modificar, la lista debe seguir teniendo 2 citas", 2, lista.size());
        Cita actual = lista.get(0);
        assertEquals("Veterinario debe ser actualizado", "Dr. Ruiz", actual.getVeterinario());
        assertEquals("Hora debe ser actualizada", "11:00", actual.getHora());
        assertEquals("Motivo debe ser actualizado", "Control modificado", actual.getMotivo());
    }

    @Test
    public void testEliminarCita() {
        // eliminar la segunda cita
        gestor.eliminarCita(c2);
        ArrayList<Cita> lista = gestor.getListaCitas();
        assertEquals("Después de eliminar, debe quedar 1 cita", 1, lista.size());
        assertSame("La única cita restante debe ser c1", c1, lista.get(0));
    }

    @Test
    public void testModificarConIndiceFueraDeRangoLanzaException() {
        try {
            Cita nueva = new Cita("X", "Y", "2026-01-01", "08:00", "Prueba");
            gestor.modificarCita(10, nueva); // índice inválido
            fail("Se esperaba IndexOutOfBoundsException para índice fuera de rango");
        } catch (IndexOutOfBoundsException ex) {
            // OK: comportamiento esperado (la implementación usa lista.set(index, ...))
        }
    }

    @Test
    public void testEliminarCitaNoExistenteNoCambiaLista() {
        Cita fantasma = new Cita("Ghost", "Nadie", "2026-01-01", "00:00", "Nada");
        gestor.eliminarCita(fantasma); // si no existe, la lista no cambia
        assertEquals("Eliminar cita inexistente no debe afectar el tamaño", 2, gestor.getListaCitas().size());
    }
}

