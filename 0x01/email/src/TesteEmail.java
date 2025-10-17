import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteEmail {

    @Test
    public void testar_email_com_arroba() {
        Pessoa pessoa = new Pessoa();
        assertTrue(pessoa.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    public void testar_email_sem_arroba() {
        Pessoa pessoa = new Pessoa();
        assertFalse(pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    public void testar_email_mais_50_caracteres() {
        Pessoa pessoa = new Pessoa();
        String email = "email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br";
        assertEquals(false, pessoa.emailValid(email));
    }
}