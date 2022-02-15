public class SessionCliente implements SessionEstado {
    public SessionCliente() {};
    private static SessionCliente instance = new SessionCliente();
    public static SessionCliente getInstance() {
        return instance;
    }

    @Override
    public String loginCliente(Session session) {
        return "Uma sessão Cliente já está em andamento.";
    }

    @Override
    public String loginAdm(Session session) {
        return "É preciso terminar a sessão atual para iniciar uma nova.";
    }

    @Override
    public String logOut(Session session) {
        return "A sessão foi encerrada.";
    }

    @Override
    public String getEstado() {
        return "Sessão atual: Cliente.";
    }
}