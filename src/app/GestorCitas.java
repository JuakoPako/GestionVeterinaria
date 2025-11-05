
package app;

import java.util.ArrayList;
import model.Cita;


public class GestorCitas {
    
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
    
}
