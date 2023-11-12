package Login;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testLoginValido() {
        Login login = new Login();
        assertTrue(login.realizarLogin("usuarioCorreto", "senhaCorreta"), "Login válido esperado");
    }

    @Test
    public void testNomeCorretoSenhaErrada() {
        Login login = new Login();
        assertFalse(login.realizarLogin("usuarioCorreto", "senhaErrada"), "Login inválido esperado");
    }

    @Test
    public void testNomeErradoSenhaCorreta() {
        Login login = new Login();
        assertFalse(login.realizarLogin("usuarioErrado", "senhaCorreta"), "Login inválido esperado");
    }

    @Test
    public void testNomeSenhaErrados() {
        Login login = new Login();
        assertFalse(login.realizarLogin("usuarioErrado", "senhaErrada"), "Login inválido esperado");
    }
}
