package app;

import model.Cita;
import model.Mascota;
import model.Veterinario;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Pruebas unitarias que reflejan la lógica relacionada con EditarCita.
 * Framework: JUnit4
 */
public class EditarCitaTest {

    private GestorMain gestor;
    private Cita original;
    private Cita otra;
    private Mascota mascota;

    @Before
    public void setUp() {
        gestor = new GestorMain();

        // preparar datos: una mascota (para poblar listas si la UI las usara)
        mascota = new Mascota("Luna", "ID001", "Labrador", "5", "F", "Ninguna");
        gestor.agregarMascotas(mascota);

        // citas iniciales en el gestor
        original = new Cita("Luna", "Dr. Soto", "2025-12-01", "09:00", "Control anual");
        otra = new Cita("Rex", "Dra. Pérez", "2025-12-02", "10:30", "Vacunación");
        gestor.agregarCita(original);
        gestor.agregarCita(otra);
    }

    @Test
    public void testModificarCitaPorIndiceUsandoGestor() {
        // Simular lo que hace EditarCita: construir nueva cita y llamar a gestor.modificarCita(index, cita)
        String nuevoVeterinario = "Dr. Ruiz";
        String nuevoDia = "2026-01-05";
        String nuevaHora = "11:00";
        String nuevoMotivo = "Revisión completa";
        String nuevoNombreMascota = "Luna";

        Cita modificada = new Cita(nuevoNombreMascota, nuevoVeterinario, nuevoDia, nuevaHora, nuevoMotivo);
        gestor.modificarCita(0, modificada);

        ArrayList<Cita> lista = gestor.getListaCitas();
        assertEquals("Tras modificar, la lista debe tener 2 citas", 2, lista.size());

        Cita desdeLista = lista.get(0);
        assertEquals("Nombre mascota actualizado", "Luna", desdeLista.getNombreMascota());
        assertEquals("Veterinario actualizado", "Dr. Ruiz", desdeLista.getVeterinario());
        assertEquals("Día actualizado", "2026-01-05", desdeLista.getDia());
        assertEquals("Hora actualizado", "11:00", desdeLista.getHora());
        assertEquals("Motivo actualizado", "Revisión completa", desdeLista.getMotivo());
    }

    @Test
    public void testModificarCitaIndiceFueraDeRangoLanzaException() {
        Cita nueva = new Cita("X", "Y", "2026-02-02", "08:00", "Prueba");
        try {
            gestor.modificarCita(10, nueva);
            fail("Se esperaba IndexOutOfBoundsException para índice fuera de rango");
        } catch (IndexOutOfBoundsException ex) {
            // comportamiento esperado
        }
    }

    @Test
    public void testNoModificarSiCamposEstanVacios_simulacionValidacionUI() {
        // Simulación de la validación que hace la UI: si hay campos vacíos no llamar a gestor.modificarCita(...)
        int tamañoAntes = gestor.getListaCitas().size();
        Cita antes = gestor.getListaCitas().get(0);

        String nombreMascota = ""; // campo vacío invalidante
        String veterinario = "Dr. Ruiz";
        String dia = "2026-01-01";
        String hora = "10:00";
        String motivo = "Prueba";

        boolean todosCompletos = !(nombreMascota.isEmpty() || veterinario.isEmpty() || dia.isEmpty()
                || hora.isEmpty() || motivo.isEmpty());

        if (todosCompletos) {
            Cita modificada = new Cita(nombreMascota, veterinario, dia, hora, motivo);
            gestor.modificarCita(0, modificada);
        } else {
            // UI cancela la operación; no se llama al gestor
        }

        assertEquals("La cantidad de citas no debe cambiar cuando la validación UI falla", tamañoAntes, gestor.getListaCitas().size());
        Cita despues = gestor.getListaCitas().get(0);
        assertSame("La cita original no debe haber sido reemplazada", antes, despues);
        assertEquals("Luna", despues.getNombreMascota());
        assertEquals("Dr. Soto", despues.getVeterinario());
    }

    @Test
    public void testInicializarCombosYCamposObtenerValores_simulacion() {
        // Comprobar que la lista de mascotas del gestor contiene la mascota agregada en setUp
        ArrayList<Mascota> mascotas = gestor.getListaMascotas();
        assertFalse("La lista de mascotas no debe estar vacía", mascotas.isEmpty());
        assertEquals("La primera mascota debe ser la que agregamos en setUp", "Luna", mascotas.get(0).getNombre());

        // Comprobación básica de Veterinario (toString) para asegurar consistencia
        Veterinario v = new Veterinario("Dr. Prueba", "General", "+56 9 0000 0000");
        assertEquals("Dr. Prueba ( General)", v.toString());
    }
}
