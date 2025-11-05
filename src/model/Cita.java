
package model;




public class Cita {
    private String nombreMascota;
    private String veterinario;
    private String dia;
    private String hora;
    private String motivo;

    public Cita() {
    }

    public Cita(String nombreMascota, String veterinario, String dia, String hora, String motivo) {
        this.nombreMascota = nombreMascota;
        this.veterinario = veterinario;
        this.dia = dia;
        this.hora = hora;
        this.motivo = motivo;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String fecha) {
        this.dia = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
