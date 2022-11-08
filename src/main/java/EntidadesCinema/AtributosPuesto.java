/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesCinema;



/**
 *
 * @author User
 */
public class AtributosPuesto {
    
    private String ubicacion;
    private AtributosEspectadores espetador;

    public AtributosPuesto() {
    }

    public AtributosPuesto( String ubicacion,AtributosEspectadores espetador) {
      
        this.ubicacion = ubicacion;
          this.espetador = espetador;
    }

    public AtributosEspectadores getEspetador() {
        return espetador;
    }

    public void setEspetador(AtributosEspectadores espetador) {
        this.espetador = espetador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
//// ACA MODIFICA EL soString para que muestre como dice el ejercicio La Matriz del Cinema
    @Override
    public String toString() {
        return  '['+"U: "+ ubicacion +" E: "+  espetador +  ']';
    }
    
    
}
