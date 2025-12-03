package bd;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Mascota;

/**
 *
 * @author A
 *
 * @author Zemekis
 */
public class DAOMascota {

    private Conexion oConexion;


    /*
     constructor de DAO
     Genera la conexion entregando los datos
     */
    public DAOMascota() throws SQLException {
        oConexion = new Conexion(
                "localhost",
                "clinicaveterinaria",
                "root",
                ""//pass
        );
    }

    public void crearMascotas(Mascota oMascota) throws SQLException {
        String sql = "INSERT INTO mascota VALUES (null, '"
                + oMascota.getNombre() + "', '"
                + oMascota.getEspecie() + "', "
                + oMascota.getEdad() + ", '"
                + oMascota.getSexo() + "', '"
                + oMascota.getObservaciones() + "', "
                + oMascota.getIdCliente() + ");";

        oConexion.ejecutar(sql);
        System.out.println(sql);
    }

    public List<Mascota> getMascotas(String filtro) throws SQLException {
        ArrayList<Mascota> listaMascotas = new ArrayList<>();

        String sql = "SELECT * FROM mascota WHERE nombre_mascota LIKE  '%" + filtro + "%' or id_mascota like'%" + filtro + "%' ";
        oConexion.rs = oConexion.ejecutarSelect(sql);
        Mascota oMascota;
        while (oConexion.rs.next()) {
            oMascota = new Mascota();
            oMascota.setId(oConexion.rs.getInt(1));
            oMascota.setNombre(oConexion.rs.getString(2));
            oMascota.setEspecie(oConexion.rs.getString(3));
            oMascota.setEdad(oConexion.rs.getInt(4));
            oMascota.setSexo(oConexion.rs.getString(5));
            oMascota.setObservaciones(oConexion.rs.getString(6));
            oMascota.setIdCliente(oConexion.rs.getInt(7));

            listaMascotas.add(oMascota);
        }
        oConexion.rs.close();
        return listaMascotas;
    }

    public void actualizarMascota(Mascota oMascota) throws SQLException {
        String sql = "UPDATE mascota SET "
                + "nombre_mascota = '" + oMascota.getNombre() + "', "
                + "especie_especie = '" + oMascota.getEspecie() + "', "
                + "edad_mascota = " + oMascota.getEdad() + ", "
                + "sexo_mascota = '" + oMascota.getSexo() + "', "
                + "observaciones_mascota = '" + oMascota.getObservaciones() + "' "
                + "WHERE id_mascota = " + oMascota.getId() + ";";

        oConexion.ejecutar(sql);
        System.out.println(sql);
    }

}
