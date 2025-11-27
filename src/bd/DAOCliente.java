package bd;

import java.sql.SQLException;
import model.Cliente;

public class DAOCliente {

    private Conexion oConexion;

    public DAOCliente() throws SQLException {
        oConexion = new Conexion(
                "localhost",
                "clinicaveterinaria",
                "root",
                ""
        );
    }

    public void crearCliente(Cliente oCliente) throws SQLException {
        String sql = "INSERT INTO cliente VALUES (null, '"
                + oCliente.getNombreUsuario() + "', '"
                + oCliente.getContraseña() + "', '"
                + oCliente.getTelefono() + "', '"
                + oCliente.getCorreo() + "');";

        oConexion.ejecutar(sql);
        System.out.println(sql);
    }

    public Cliente buscarCliente(String usuario, String pass) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE nombre_cliente = '"
                + usuario + "' AND pass_cliente = '" + pass + "';";

        oConexion.rs = oConexion.ejecutarSelect(sql);

        if (oConexion.rs.next()) {
            Cliente oCliente = new Cliente();

            
            oCliente.setId(oConexion.rs.getInt("id_cliente"));

            oCliente.setNombreUsuario(oConexion.rs.getString("nombre_cliente"));
            oCliente.setContraseña(oConexion.rs.getString("pass_cliente"));
            oCliente.setTelefono(oConexion.rs.getString("telefono_cliente"));
            oCliente.setCorreo(oConexion.rs.getString("correo_cliente"));

            return oCliente;
        }

        return null;
    }
}
