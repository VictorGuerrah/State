public interface SessionEstado {

    String loginCliente(Session ambiente);

    String loginAdm(Session ambiente);

    String logOut(Session ambiente);

    String getEstado();
}