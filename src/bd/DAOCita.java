package bd;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Cita;

public class DAOCita {

    private Conexion oConexion;

    public DAOCita() throws SQLException {
        oConexion = new Conexion("localhost", "clinicaveterinaria", "root", "");
    }

    // Crear cita
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

    public ArrayList<Cita> getListaCitas() {
        ArrayList<Cita> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM cita";
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

                lista.add(c);
            }
            oConexion.rs.close();
        } catch (Exception e) {
            System.out.println("Error al obtener citas: " + e.getMessage());
        }
        return lista;
    }
    
}
