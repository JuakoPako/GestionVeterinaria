/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.SQLException;
import model.Cliente;

/**
 *
 * @author A
 *
 * @author Zemekis
 */
public class DAOCliente {

    private Conexion oConexion;


    /*
     constructor de DAO
     Genera la conexion entregando los datos
     */
    public DAOCliente() throws SQLException {
        oConexion = new Conexion(
                "localhost",
                "clinicaveterinaria",
                "root",
                ""//pass
        );
    }

    public void crearCliente(Cliente oCliente) throws SQLException {
        String sql = "INSERT INTO cliente VALUES (null, '"
                + oCliente.getNombreUsuario() + "', '"
                + oCliente.getContraseña() + "', '"
                + oCliente.getTelefono() + "', '"
                + oCliente.getCorreo() + "', null);";

        oConexion.ejecutar(sql);
        System.out.println(sql);
    }
    
    

}
