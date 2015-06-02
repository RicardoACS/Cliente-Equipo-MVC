/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class ListadoUsuario 
{
 public ArrayList<Login> listado;
 
 public ListadoUsuario()
 {
     listado = new ArrayList<>();
     cargarUsuario();
 }
 
 private void cargarUsuario()
 {
     Login a = new Login("rick","rick");
     Login b = new Login("lalo", "222");
     Login c = new Login("juana", "333");
     Login d = new Login("admin", "admin");
     Login e = new Login("pepe", "555");
     listado.add(a);
     listado.add(b);
     listado.add(c);
     listado.add(d);
     listado.add(e);
 }
 
}
