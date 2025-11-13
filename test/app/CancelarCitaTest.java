package app;

import model.Cita;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Tests unitarios para la lógica de cancelación de citas (sin UI) Basados en el
 * comportamiento de CancelarCita.lblCancelarCitaMouseClicked (parsing de ID,
 * verificación de rango y eliminación desde GestorMain)
 */
public class CancelarCitaTest {

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
    public void testCancelarCitaValida() {
        // Simula que el usuario ingresa "1" en txtIdCita -> id = 0 (primer elemento)
        String input = "1";
        boolean removed = tryCancelByInput(input, gestor);

        assertTrue("La cancelación con ID válido debe eliminar la cita", removed);
        ArrayList<Cita> lista = gestor.getListaCitas();
        assertEquals("Tras cancelar debe quedar una sola cita", 1, lista.size());
        assertSame("La cita restante debe ser la originalmente en segundo lugar", c2, lista.get(0));
    }

    @Test
    public void testCancelarCitaFueraDeRango() {
        // Ingreso un ID mayor al disponible -> no se elimina nada
        String input = "5"; // id -> 4 (fuera de rango)
        boolean removed = tryCancelByInput(input, gestor);

        assertFalse("ID fuera de rango no debe eliminar ninguna cita", removed);
        assertEquals("La lista debe conservar su tamaño original", 2, gestor.getListaCitas().size());
    }

    @Test
    public void testCancelarCitaIdCeroOEnegativo() {
        // Entrada "0" -> id = -1 (invalid), entrada "-1" -> id = -2 (invalid)
        assertFalse("ID 0 no elimina", tryCancelByInput("0", gestor));
        assertFalse("ID negativo no elimina", tryCancelByInput("-1", gestor));
        assertEquals(2, gestor.getListaCitas().size());
    }

    @Test
    public void testCancelarCitaNoNumerica() {
        // Entrada no numérica -> NumberFormatException en el parsing original -> se maneja y no elimina
        String input = "abc";
        boolean removed = tryCancelByInput(input, gestor);
        assertFalse("Entrada no numérica no debe eliminar citas", removed);
        assertEquals(2, gestor.getListaCitas().size());
    }

    @Test
    public void testCancelarCitaEntradaVacia() {
        // Entrada vacía -> el handler original retorna antes de parsear
        String input = "";
        boolean removed = tryCancelByInput(input, gestor);
        assertFalse("Entrada vacía no debe eliminar citas", removed);
        assertEquals(2, gestor.getListaCitas().size());
    }

    // Helper que refleja la lógica de CancelarCita.lblCancelarCitaMouseClicked pero sin mostrar JOptionPane.
    // Devuelve true si se eliminó una cita, false en caso contrario.
    private boolean tryCancelByInput(String textoId, GestorMain gestorLocal) {
        if (textoId == null) {
            return false;
        }
        String texto = textoId.trim();
        if (texto.isEmpty()) {
            return false; // igual que el handler que muestra mensaje y retorna
        }
        try {
            int id = Integer.parseInt(texto) - 1;
            if (id >= 0 && id < gestorLocal.getListaCitas().size()) {
                Cita cita = gestorLocal.getListaCitas().get(id);
                gestorLocal.eliminarCita(cita);
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
