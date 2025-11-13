package app;

import model.Mascota;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Tests unitarios que reflejan la lógica de EliminarMascota (sin UI) Framework:
 * JUnit4
 */
public class EliminarMascotaTest {

    private GestorMain gestor;
    private Mascota m1;
    private Mascota m2;

    @Before
    public void setUp() {
        gestor = new GestorMain();

        // En el repo actual getEspecie() se usa como campo id, por eso lo rellenamos así.
        m1 = new Mascota("Luna", "ID001", "Labrador", "5", "F", "Ninguna");
        m2 = new Mascota("Rex", "ID002", "Poodle", "3", "M", "Vacunado");

        gestor.agregarMascotas(m1);
        gestor.agregarMascotas(m2);
    }

    @Test
    public void testEliminarMascotaPorIdValida() {
        // Simular entrada "ID001" -> se debe eliminar m1
        String idTexto = "ID001";

        boolean eliminado = tryEliminarPorId(idTexto, gestor);

        assertTrue("Debe eliminarse la mascota con ID válido", eliminado);
        ArrayList<Mascota> lista = gestor.getListaMascotas();
        assertEquals("Queda una mascota tras la eliminación", 1, lista.size());
        assertSame("La mascota restante debe ser m2", m2, lista.get(0));
    }

    @Test
    public void testEliminarMascotaIdInexistenteNoHaceNada() {
        String idTexto = "NO_EXISTE";

        boolean eliminado = tryEliminarPorId(idTexto, gestor);

        assertFalse("ID inexistente no debe eliminar nada", eliminado);
        assertEquals("La lista conserva su tamaño", 2, gestor.getListaMascotas().size());
    }

    @Test
    public void testEliminarMascotaConIdVaciaNoHaceNada() {
        String idTexto = "";

        boolean eliminado = tryEliminarPorId(idTexto, gestor);

        assertFalse("Entrada vacía no debe eliminar", eliminado);
        assertEquals(2, gestor.getListaMascotas().size());
    }

    @Test
    public void testEliminarMascotaSiHayCoincidadMultipleEliminaTodasLasCoincidencias() {
        // Si hubiera varias mascotas con la misma 'especie' (ID), la implementación usa removeIf
        Mascota dup = new Mascota("Duplicada", "ID002", "Mix", "1", "F", "Obs");
        gestor.agregarMascotas(dup); // ahora hay m2 y dup con ID002

        boolean eliminado = tryEliminarPorId("ID002", gestor);

        assertTrue("Debe eliminar las mascotas con ID002", eliminado);
        ArrayList<Mascota> lista = gestor.getListaMascotas();
        // Solo m1 debería quedar
        assertEquals("Debe quedar solo 1 mascota (m1)", 1, lista.size());
        assertSame("La mascota restante debe ser m1", m1, lista.get(0));
    }

    // Helper que refleja la lógica principal de eliminación sin mostrar JOptionPane.
    // Retorna true si se eliminó al menos una mascota, false en caso contrario.
    private boolean tryEliminarPorId(String idTexto, GestorMain gestorLocal) {
        if (idTexto == null) {
            return false;
        }
        String texto = idTexto.trim();
        if (texto.isEmpty()) {
            return false;
        }

        // Buscar si existe al menos una coincidencia (como hace el UI antes de confirmar)
        Mascota encontrada = null;
        for (Mascota m : gestorLocal.getListaMascotas()) {
            if (texto.equals(String.valueOf(m.getEspecie()))) {
                encontrada = m;
                break;
            }
        }

        if (encontrada == null) {
            return false;
        }

        // Simular que el usuario confirma la eliminación (YES). La implementación real usa removeIf(...)
        boolean eliminado = gestorLocal.getListaMascotas().removeIf(m -> texto.equals(String.valueOf(m.getEspecie())));
        return eliminado;
    }
}
