public class SessionAdm implements SessionEstado {


    public SessionAdm() {};
    private static SessionAdm instance = new SessionAdm();
    public static SessionAdm getInstance() {
        return instance;
    }

    @Override
    public String loginCliente(Session session) {
        return "É preciso terminar a sessão atual para iniciar uma nova.";
    }

    @Override
    public String loginAdm(Session Site) {
        return "Uma sessão ADM já está em andamento.";
    }

    @Override
    public String logOut(Session Site) {
        return "A sessão foi encerrada.";
    }

    @Override
    public String getEstado() {
        return "Sessão atual: ADM.";
    }
}
