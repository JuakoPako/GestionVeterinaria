/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.SQLException;
import model.Cita;
import model.Cliente;

/**
 *
 * @author A
 *
 * @author Zemekis
 */
public class DAOCita {

    private Conexion oConexion;


    /*
     constructor de DAO
     Genera la conexion entregando los datos
     */
    public DAOCita() throws SQLException {
        oConexion = new Conexion(
                "localhost",
                "clinicaveterinaria",
                "root",
                ""//pass
        );
    }

    public void crearCita(Cita oCita) throws SQLException {
        String sql = "INSERT INTO cita VALUES (null, '"
                + oCita.getNombreMascota() + "', '"
                + oCita.getVeterinario() + "', '"
                + oCita.getDia() + "', '"
                + oCita.getHora() + "', '"
                + oCita.getMotivo() + "');";

        oConexion.ejecutar(sql);
        System.out.println(sql);
    }
    
    

}
