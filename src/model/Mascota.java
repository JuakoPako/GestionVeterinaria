/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Mascota {
    
    private String nombre;
    private String id;
    private String raza;
    private String edad;
    private String sexo;
    private String observaciones;

    public Mascota() {
    }

    public Mascota(String nombre, String id, String raza, String edad, String sexo, String observaciones) {
        this.nombre = nombre;
        this.id = id;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return id;
    }

    public void setEspecie(String especie) {
        this.id = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
