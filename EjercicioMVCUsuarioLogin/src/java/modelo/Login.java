/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Ricardo
 */
public class Login {
    
    private String usuario;
    private String clave;

    public Login() 
    {
        usuario = new String();
        clave = new String();
    }

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Login{" + "usuario=" + usuario + ", clave=" + clave + '}';
    }
    
    
    
}
