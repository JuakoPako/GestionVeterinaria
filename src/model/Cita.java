
package model;




public class Cita {
    private int idCita;
    private int idMascota;
    private int idCliente;
    private String veterinario;
    private String dia;
    private String hora;
    private String motivo;

    public Cita() {
    }

    public Cita(int idCita, int idMascota, int idCliente, String veterinario, String dia, String hora, String motivo) {
        this.idCita = idCita;
        this.idMascota = idMascota;
        this.idCliente = idCliente;
        this.veterinario = veterinario;
        this.dia = dia;
        this.hora = hora;
        this.motivo = motivo;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public void setDia(String dia) {
        this.dia = dia;
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
