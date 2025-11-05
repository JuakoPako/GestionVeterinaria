/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.ArrayList;
import model.Cita;
import model.Cliente;
import model.Mascota;

public class GestorMain {
    
    private ArrayList<Cita> listaCitas = new ArrayList<>();
    
    public void agregarCita(Cita cita) {
        listaCitas.add(cita);
    }
    
    public void eliminarCita(Cita cita) {
        listaCitas.remove(cita);
    }
    
    public void modificarCita(int index, Cita nuevaCita) {
        listaCitas.set(index, nuevaCita);
    }
    
    public ArrayList<Cita> getListaCitas() {
        return listaCitas;
    }
    
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
        private ArrayList<Mascota> listaMascotas = new ArrayList<>();

    public void agregarMascotas(Mascota mascota){
        listaMascotas.add(mascota);
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }
}
