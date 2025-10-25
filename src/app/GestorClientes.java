/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.ArrayList;
import model.Cliente;

public class GestorClientes {
    
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    
}
