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
public class Cliente 
{
 // rut, nombre, dirección, comuna y equipo
    private String rut;
    private String nombre;
    private String direccion;
    private String comuna;
    private Equipo equipo;

    public Cliente() 
    {
        rut = new String();
        nombre = new String();
        direccion = new String();
        comuna = new String();
        equipo = new Equipo();
    }

    public Cliente(String rut, String nombre, String direccion, String comuna) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.comuna = comuna;
        equipo = new Equipo();
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    
}
