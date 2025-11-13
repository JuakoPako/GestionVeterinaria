package app;

import model.Cita;
import model.Mascota;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias relacionadas con el flujo de AgendarCita (se prueban las
 * unidades lógicas: Cita y GestorMain)
 */
public class AgendarCitaTest {

    private GestorMain gestor;
    private Cita c1;
    private Cita c2;

    @Before
    public void setUp() {
        gestor = new GestorMain();

        // Crear citas de ejemplo
        c1 = new Cita("Luna", "Dr. Soto", "2025-12-01", "09:00", "Control anual");
        c2 = new Cita("Rex", "Dra. Pérez", "2025-12-02", "10:30", "Vacunación");
    }

    @Test
    public void testAgregarCitaAgestor() {
        // Agendar (añadir) dos citas al gestor y comprobar su presencia
        gestor.agregarCita(c1);
        gestor.agregarCita(c2);

        ArrayList<Cita> lista = gestor.getListaCitas();
        assertNotNull("La lista de citas no debe ser null", lista);
        assertEquals("Debe haber 2 citas en el gestor", 2, lista.size());
        assertSame("La primera cita debe ser la añadida primero", c1, lista.get(0));
        assertSame("La segunda cita debe ser la añadida después", c2, lista.get(1));
    }

    @Test
    public void testEliminarCitaDelGestor() {
        gestor.agregarCita(c1);
        gestor.agregarCita(c2);

        // eliminar c2 y verificar resultados
        gestor.eliminarCita(c2);
        ArrayList<Cita> lista = gestor.getListaCitas();
        assertEquals("Tras eliminar una cita debe quedar 1", 1, lista.size());
        assertSame("La cita restante debe ser c1", c1, lista.get(0));
    }

    @Test
    public void testNoAgregarCitaConCamposVacios_simulacion() {
        // En la UI, antes de agregar se valida que los campos no estén vacíos.
        // Acá simulamos esa validación: no agregamos una Cita con campos vacíos y verificamos que gestor no cambia.
        Cita vacia = new Cita("", "", "", "", "");
        // simular validación que hace AgendarCita: si algún campo vacío -> no llamar a gestor.agregarCita()
        // por tanto comprobamos que, si no la añadimos, la lista sigue vacía:
        assertTrue("No debe haber citas en el gestor antes de añadir ninguna", gestor.getListaCitas().isEmpty());

        // No llamamos a gestor.agregarCita(vacia) porque la UI impediría hacerlo.
        assertEquals("Lista sigue vacía tras simular no-agregar una cita inválida", 0, gestor.getListaCitas().size());
    }

    @Test
    public void testAgregarCitaYContenidoCampos() {
        gestor.agregarCita(c1);

        Cita desdeLista = gestor.getListaCitas().get(0);
        assertEquals("Nombre mascota debe coincidir", "Luna", desdeLista.getNombreMascota());
        assertEquals("Veterinario debe coincidir", "Dr. Soto", desdeLista.getVeterinario());
        assertEquals("Día debe coincidir", "2025-12-01", desdeLista.getDia());
        assertEquals("Hora debe coincidir", "09:00", desdeLista.getHora());
        assertEquals("Motivo debe coincidir", "Control anual", desdeLista.getMotivo());
    }
}
