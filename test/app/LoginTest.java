package app;

import model.Cliente;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la lógica de validación de login. Se prueban los
 * mismos casos que maneja Login.lblEntrarMouseClicked pero sin abrir la UI ni
 * mostrar JOptionPane.
 *
 * Basado en: Login (compara contra gestor.getListaClientes()), GestorMain
 * (mantiene listaClientes, agregarCliente/getListaClientes), Cliente
 * (nombreUsuario / contrasena).
 */
public class LoginTest {

    private GestorMain gestor;

    @Before
    public void setUp() {
        gestor = new GestorMain();
    }

    // Helper que replica la lógica de comprobación de credenciales en Login.lblEntrarMouseClicked
    private boolean comprobarCredenciales(String usuario, String password, GestorMain gestorLocal) {
        if (usuario == null || password == null) {
            return false;
        }
        for (Cliente cliente : gestorLocal.getListaClientes()) {
            if (cliente.getNombreUsuario().equals(usuario) && cliente.getContraseña().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testLoginCorrectoConClienteExistente() {
        Cliente c = new Cliente("usuario1", "secret", "+56900000000", "a@b.com");
        gestor.agregarCliente(c);

        boolean resultado = comprobarCredenciales("usuario1", "secret", gestor);
        assertTrue("Credenciales válidas deben resultar en login exitoso", resultado);
    }

    @Test
    public void testLoginFallaConContraseñaIncorrecta() {
        Cliente c = new Cliente("usuario1", "secret", "+56900000000", "a@b.com");
        gestor.agregarCliente(c);

        boolean resultado = comprobarCredenciales("usuario1", "wrongpass", gestor);
        assertFalse("Contraseña incorrecta no debe permitir login", resultado);
    }

    @Test
    public void testLoginFallaConUsuarioInexistente() {
        Cliente c = new Cliente("usuario1", "secret", "+56900000000", "a@b.com");
        gestor.agregarCliente(c);

        boolean resultado = comprobarCredenciales("otro", "secret", gestor);
        assertFalse("Usuario inexistente no debe permitir login", resultado);
    }

    @Test
    public void testLoginFallaConCamposVacios() {
        Cliente c = new Cliente("usuario1", "secret", "+56900000000", "a@b.com");
        gestor.agregarCliente(c);

        assertFalse("Usuario vacío debe fallar", comprobarCredenciales("", "secret", gestor));
        assertFalse("Contraseña vacía debe fallar", comprobarCredenciales("usuario1", "", gestor));
        assertFalse("Ambos vacíos deben fallar", comprobarCredenciales("", "", gestor));
    }

    @Test
    public void testLoginConMultiplesClientesSeleccionaElCorrecto() {
        Cliente c1 = new Cliente("userA", "passA", "t1", "a@a.com");
        Cliente c2 = new Cliente("userB", "passB", "t2", "b@b.com");
        gestor.agregarCliente(c1);
        gestor.agregarCliente(c2);

        assertTrue("Debe permitir login para userB con passB", comprobarCredenciales("userB", "passB", gestor));
        assertFalse("No debe permitir login para userB con passA", comprobarCredenciales("userB", "passA", gestor));
    }
}
