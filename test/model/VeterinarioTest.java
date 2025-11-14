package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class VeterinarioTest {

    public VeterinarioTest() {
    }

    @Test
    public void testGetNombreVeterinario() {
        System.out.println("getNombreVeterinario");
        Veterinario instance = new Veterinario();
        String result = instance.getNombreVeterinario();
        assertTrue("El valor por defecto del nombre del veterinario debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetNombreVeterinario() {
        System.out.println("setNombreVeterinario");
        String nombreVeterinario = "Dr. Felipe Muñoz";
        Veterinario instance = new Veterinario();
        instance.setNombreVeterinario(nombreVeterinario);
        assertEquals("El getter debe devolver el nombre establecido por el setter",
                nombreVeterinario, instance.getNombreVeterinario());
    }

    @Test
    public void testGetEspecialidad() {
        System.out.println("getEspecialidad");
        Veterinario instance = new Veterinario();
        String result = instance.getEspecialidad();
        assertTrue("El valor por defecto de la especialidad debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetEspecialidad() {
        System.out.println("setEspecialidad");
        String especialidad = "Cirugía";
        Veterinario instance = new Veterinario();
        instance.setEspecialidad(especialidad);
        assertEquals("El getter debe devolver la especialidad establecida por el setter",
                especialidad, instance.getEspecialidad());
    }

    @Test
    public void testGetTelefonoVeterinario() {
        System.out.println("getTelefonoVeterinario");
        Veterinario instance = new Veterinario();
        String result = instance.getTelefonoVeterinario();
        assertTrue("El valor por defecto del telefono del veterinario debe ser null o una cadena string vacía",
                result == null || result.equals(""));
    }

    @Test
    public void testSetTelefonoVeterinario() {
        System.out.println("setTelefonoVeterinario");
        String telefonoVeterinario = "+56977659842";
        Veterinario instance = new Veterinario();
        instance.setTelefonoVeterinario(telefonoVeterinario);
        assertEquals("El getter debe devolver el teléfono establecido por el setter",
                telefonoVeterinario, instance.getTelefonoVeterinario());
    }

    @Test
    public void testGetHorasDisponiblesPorDefecto() {
        System.out.println("getHorasDisponibles - por defecto");
        Veterinario instance = new Veterinario();
        List<String> result = instance.getHorasDisponibles();
        assertTrue("Las horas disponibles deben ser por defecto null o una cadena string vacía",
                result == null || result.isEmpty());
    }

    @Test
    public void testSetYGetHorasDisponibles() {
        System.out.println("setHorasDisponibles y getHorasDisponibles");
        List<String> horas = new ArrayList<>(Arrays.asList("09:00", "12:00", "15:00", "17:00"));
        Veterinario oVeterinario = new Veterinario();
        oVeterinario.setHorasDisponibles(horas);

        List<String> obtenido = oVeterinario.getHorasDisponibles();
        assertNotNull("Las Horas disponibles no debe devolver null después de set", obtenido);
        assertEquals("La lista debe mantener el tamaño que se le establecido", 4, obtenido.size());
        assertEquals("09:00", obtenido.get(0));
        assertEquals("12:00", obtenido.get(1));
        assertEquals("15:00", obtenido.get(2));
        assertEquals("17:00", obtenido.get(3));

        obtenido.add("12:00");
        assertTrue("La lista devuelta contiene el nuevo elemento añadido localmente", obtenido.contains("12:00"));
    }

    @Test
    public void testToStringContieneCampos() {
        System.out.println("toString");
        Veterinario v = new Veterinario("Dr. Ruiz", "Atencion General", "+56900000000");
        String s = v.toString();
        assertNotNull("toString no debe devolver un  null", s);
        assertTrue("toString debe contener el nombre del veterinario", s.contains("Dr. Ruiz") || s.toLowerCase().contains("nombre"));
        assertTrue("toString debe contener la especialidad", s.contains("Atencion General") || s.toLowerCase().contains("especialidad"));
    }
}
