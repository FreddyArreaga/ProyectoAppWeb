package Beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
@Named(value = "usuario")
@RequestScoped
public class Usuario {
    
    public Usuario() {
    }
    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    
    
    
}
