package app;

import model.Mascota;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Tests unitarios que reflejan la lógica de ActualizarMascotas - Buscar por ID
 * usando getEspecie() - Actualizar campos de la mascota y reemplazar en la
 * lista del GestorMain
 */
public class ActualizarMascotasTest {

    private GestorMain gestor;
    private Mascota m1;
    private Mascota m2;

    @Before
    public void setUp() {
        gestor = new GestorMain();

        // En el proyecto actual getEspecie() devuelve el campo id, así lo usamos aquí.
        m1 = new Mascota("Luna", "ID001", "Labrador", "5", "F", "Ninguna");
        m2 = new Mascota("Rex", "ID002", "Poodle", "3", "M", "Vacunado");

        gestor.agregarMascotas(m1);
        gestor.agregarMascotas(m2);
    }

    @Test
    public void testBuscarPorIdEncuentraMascotaYRellenaCampos() {
        String idBuscada = "ID001";

        // Simular la búsqueda (igual que lblBuscarMouseClicked)
        Mascota encontrada = null;
        for (Mascota m : gestor.getListaMascotas()) {
            if (idBuscada.equals(String.valueOf(m.getEspecie()))) {
                encontrada = m;
                break;
            }
        }

        assertNotNull("Debe encontrar la mascota por ID", encontrada);
        assertEquals("Luna", encontrada.getNombre());
        assertEquals("Labrador", encontrada.getRaza());
        assertEquals("5", encontrada.getEdad());
        assertEquals("F", encontrada.getSexo());
        assertEquals("Ninguna", encontrada.getObservaciones());
    }

    @Test
    public void testGuardarActualizaLaMascotaYReemplazaEnLista() {
        String idBuscada = "ID002";

        // Buscar la mascota (lo que hace lblBuscar)
        Mascota encontrada = null;
        for (Mascota m : gestor.getListaMascotas()) {
            if (idBuscada.equals(String.valueOf(m.getEspecie()))) {
                encontrada = m;
                break;
            }
        }
        assertNotNull(encontrada);

        // Simular edición en la UI: cambiar algunos campos del objeto current
        encontrada.setNombre("Rexito");
        encontrada.setRaza("Caniche");
        encontrada.setEdad("4");
        encontrada.setSexo("M");
        encontrada.setObservaciones("Cambiado");

        // Simular la lógica de guardar: buscar el índice por especie (ID) y reemplazar
        boolean actualizado = false;
        ArrayList<Mascota> lista = gestor.getListaMascotas();
        for (int i = 0; i < lista.size(); i++) {
            Mascota m = lista.get(i);
            if (String.valueOf(m.getEspecie()).equals(String.valueOf(encontrada.getEspecie()))) {
                lista.set(i, encontrada);
                actualizado = true;
                break;
            }
        }

        assertTrue("La mascota debe haber sido actualizada en la lista", actualizado);

        // Verificar que el objeto en la lista está actualizado
        Mascota desdeLista = gestor.getListaMascotas().get(1); // m2 estaba en índice 1
        assertEquals("Rexito", desdeLista.getNombre());
        assertEquals("Caniche", desdeLista.getRaza());
        assertEquals("4", desdeLista.getEdad());
        assertEquals("Cambiado", desdeLista.getObservaciones());
    }

    @Test
    public void testBuscarIdInexistenteNoEncuentraYNoModificaLista() {
        String idInexistente = "NO_EXISTE";

        Mascota encontrada = null;
        for (Mascota m : gestor.getListaMascotas()) {
            if (idInexistente.equals(String.valueOf(m.getEspecie()))) {
                encontrada = m;
                break;
            }
        }

        assertNull("No debe encontrar ninguna mascota con ID inexistente", encontrada);
        // Asegurarnos que la lista no se modificó
        assertEquals("La lista debe seguir teniendo 2 elementos", 2, gestor.getListaMascotas().size());
    }
}
