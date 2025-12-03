package bd;

import app.Sesion;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cita;

public class DAOCita {

    private Conexion oConexion;

    public DAOCita() throws SQLException {
        oConexion = new Conexion("localhost", "clinicaveterinaria", "root", "");
    }


    public void crearCita(Cita oCita) throws SQLException {
        String sql = "INSERT INTO cita VALUES (null, '"
                + oCita.getVeterinario() + "', '"
                + oCita.getDia() + "', '"
                + oCita.getHora() + "', '"
                + oCita.getMotivo() + "', "
                + oCita.getIdMascota() + ", "
                + oCita.getIdCliente() + ");";
        oConexion.ejecutar(sql);
        System.out.println(sql);
    }

    public void actualizarCita(Cita oCita) throws SQLException {
        String sql = "UPDATE cita SET "
                + "vet_cita = '" + oCita.getVeterinario() + "', "
                + "dia_cita = '" + oCita.getDia() + "', "
                + "hora_cita = '" + oCita.getHora() + "', "
                + "motivo_cita = '" + oCita.getMotivo() + "' "
                + "WHERE id_cita = " + oCita.getIdCita();

        oConexion.ejecutar(sql);
        System.out.println(sql);
    }

    public ArrayList<Cita> getListaCitas() throws SQLException {
        ArrayList<Cita> lista = new ArrayList<>();

            String sql = "SELECT cita.id_cita, cita.vet_cita, cita.dia_cita, cita.hora_cita, cita.motivo_cita, "
                    + "cita.FK_mascota, cita.FK_cliente, mascota.nombre_mascota "
                    + "FROM cita "
                    + "JOIN mascota ON cita.FK_mascota = mascota.id_mascota "
                    + "WHERE cita.FK_cliente = "+Sesion.clienteActual.getId()+";";

            oConexion.rs = oConexion.ejecutarSelect(sql);

            while (oConexion.rs.next()) {
                Cita c = new Cita();
                c.setIdCita(oConexion.rs.getInt(1));
                c.setVeterinario(oConexion.rs.getString(2));
                c.setDia(oConexion.rs.getString(3));
                c.setHora(oConexion.rs.getString(4));
                c.setMotivo(oConexion.rs.getString(5));
                c.setIdMascota(oConexion.rs.getInt(6));
                c.setIdCliente(oConexion.rs.getInt(7));
                c.setNombreMascota(oConexion.rs.getString(8));
                lista.add(c);
            }
            oConexion.rs.close();

        return lista;
    }
    
    
        public void borrarCita(int id) throws SQLException {
        String sql = "delete from cita where id_cita=" + id + "";
        oConexion.ejecutar(sql);
        System.out.println(sql);

    }
        
}
