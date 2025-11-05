
package model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Cita {
    
    private String nombreCliente;
    private String nombreMascota;
    private String veterinario;
    private LocalDate fecha;
    private LocalTime hora;
    private String motivo;
    private boolean atendida;

    public Cita() {
    }

    public Cita(String nombreCliente, String nombreMascota, String veterinario, LocalDate fecha, LocalTime hora, String motivo, boolean atendida) {
        this.nombreCliente = nombreCliente;
        this.nombreMascota = nombreMascota;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.atendida = atendida;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }
    
    
    
}
