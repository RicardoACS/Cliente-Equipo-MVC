

package modelo;

public class Equipo 
{
     //marca, modelo, clave, entrada (puede ser tarjeta o teclado)
     private String marca;
     private String modelo;
     private String clave;
     private String entrada;

    public Equipo() 
    {
        marca = new String();
        modelo = new String();
        clave = new String();
        entrada = new String();
    }

    public Equipo(String marca, String modelo, String clave, String entrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.clave = clave;
        this.entrada = entrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada){
            this.entrada = entrada;

            

        
    }
    
     
}
