import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SessionTest {


    Session session;
    @BeforeEach
    public void setUp() {
        session = new Session();

    }

    @Test
    public void testeSessionVazia() {
        session.setEstado(SessionVazia
                .getInstance());
        assertEquals("Não há nenhuma sessão para encerrar.", session.logOut());
    }


    @Test
    public void testeSessionCliente() {
        session.setEstado(SessionCliente
                .getInstance());
        assertEquals("Uma sessão Cliente já está em andamento.", session.loginCliente());
    }

    @Test
    public void testeSessionAdm() {
        session.setEstado(SessionAdm
                .getInstance());
        assertEquals("Uma sessão ADM já está em andamento.", session.loginAdm());
    }
}