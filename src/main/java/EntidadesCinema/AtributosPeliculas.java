/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesCinema;

/**
 *
 * @author User
 */
public class AtributosPeliculas {
    private String titulo;
    private String director;
    private double duracion;
    private int edad;

    public AtributosPeliculas() {
    }

    public AtributosPeliculas(String titulo, String director, double duracion, int edad) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edad = edad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "AtributosPelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edad=" + edad + '}';
    }
    
    
}
