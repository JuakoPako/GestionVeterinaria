/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.ArrayList;
import model.Mascota;
public class GestorMascotas {
    private ArrayList<Mascota> listaMascotas = new ArrayList<>();

    public void agregarMascotas(Mascota mascota){
        listaMascotas.add(mascota);
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }
        
}
