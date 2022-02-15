public class Session {

    private String usuario;
    private SessionEstado estado;

    public Session() {

    }


    public String loginCliente() {
        return estado.loginCliente(this);
    }


    public String loginAdm() {
        return estado.loginAdm(this);
    }


    public String logOut() {
        return estado.logOut(this);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String nomeDesenvolvedor) {
        this.usuario = nomeDesenvolvedor;
    }

    public SessionEstado getEstado() {
        return estado;
    }

    public void setEstado(SessionEstado estado) {
        this.estado = estado;
    }

    public Session(String usuario, SessionEstado estado) {
        this.usuario = usuario;
        this.estado = estado;
    }
}