
package model;

import java.util.ArrayList;
import java.util.List;


public class Veterinario {
    
    private String nombreVeterinario;
    private String especialidad;
    private String telefonoVeterinario;
    private List<String> horasDisponibles;

    public Veterinario() {
        this.horasDisponibles = new ArrayList<>();
    }

    public Veterinario(String nombreVeterinario, String especialidad, String telefonoVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
        this.especialidad = especialidad;
        this.telefonoVeterinario = telefonoVeterinario;
        this.horasDisponibles = new ArrayList<>();
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefonoVeterinario() {
        return telefonoVeterinario;
    }

    public void setTelefonoVeterinario(String telefonoVeterinario) {
        this.telefonoVeterinario = telefonoVeterinario;
    }

    public List<String> getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setHorasDisponibles(List<String> horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }
    
    @Override
    
    public String toString() {
        return nombreVeterinario + " ( "+ especialidad + ")";
    }
    
}
