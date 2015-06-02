
package modelo;


public class BuscarUsuario 
{
    public Login buscarUser(Login l)
    {    
        ListadoUsuario lista = new ListadoUsuario();
        Login objLogin = new Login();
        for(Login lo: lista.listado)
        {
            if (lo.getUsuario().equals(l.getUsuario()) && lo.getClave().equals(l.getClave())) 
            {
                return objLogin = lo;
            }
        }
        return null;
    }
    
}
