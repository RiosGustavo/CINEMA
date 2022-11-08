/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesCinema;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AtributosCine {
    private AtributosPuesto sala [][];
    private AtributosPeliculas pelicula;
    private ArrayList<AtributosEspectadores> espectador = new ArrayList();
    private double precio;
    


    public AtributosCine() {
    }

    public AtributosCine(AtributosPeliculas pelicula, ArrayList<AtributosEspectadores> espectador, double precio, AtributosPuesto[][] sala) {
        this.pelicula = pelicula;
        this.espectador = espectador;
        this.precio = precio;
        this.sala = sala;
    }

    public AtributosPuesto[][] getSala() {
        return sala;
    }

    public void setSala(AtributosPuesto[][] sala) {
        this.sala = sala;
    }

  

    public AtributosPeliculas getPelicula() {
        return pelicula;
    }

    public ArrayList<AtributosEspectadores> getEspectador() {
        return espectador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPelicula(AtributosPeliculas pelicula) {
        this.pelicula = pelicula;
    }

    public void setEspectador(ArrayList<AtributosEspectadores> espectador) {
        this.espectador = espectador;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "AtributosCine{" + "sala=" + sala + ", pelicula=" + pelicula + ", espectador=" + espectador + ", precio=" + precio + '}';
    }

    
    
}
