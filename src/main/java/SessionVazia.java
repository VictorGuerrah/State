public class SessionVazia implements SessionEstado {
    public SessionVazia() {};
    private static SessionVazia instance = new SessionVazia();
    public static SessionVazia getInstance() {
        return instance;
    }

    @Override
    public String loginCliente(Session session) {
        return "Sessão Cliente Iniciada.";
    }

    @Override
    public String loginAdm(Session session) {
        return "Sessão ADM Iniciada.";
    }

    @Override
    public String logOut(Session session) {
        return "Não há nenhuma sessão para encerrar.";
    }

    @Override
    public String getEstado() {
        return "Nenhuma sessão iniciada.";
    }
}