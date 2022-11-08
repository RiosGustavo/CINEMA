/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioCinema;

import EntidadesCinema.AtributosCine;
import EntidadesCinema.AtributosEspectadores;
import EntidadesCinema.AtributosPeliculas;
import EntidadesCinema.AtributosPuesto;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class MetodosCinema {

    AtributosCine cinema = new AtributosCine();

    ArrayList<AtributosEspectadores> espectadores = new ArrayList();

    ArrayList<AtributosPeliculas> peliculas = new ArrayList();

    Random aleatorio = new Random();

    /// creamos las peliculas para motrar conla inf necesaria
    public void crearPeliculas() {
        peliculas.add(new AtributosPeliculas("Cenicienta", "cmilo", 128, 12));
        peliculas.add(new AtributosPeliculas("Terminator", "camenron", 328, 19));
        peliculas.add(new AtributosPeliculas("Titanic", "camenron", 228, 15));
        peliculas.add(new AtributosPeliculas("Avenger", "stlisd", 180, 19));
        peliculas.add(new AtributosPeliculas("Sherck", "dinesy", 240, 12));
        cinema.setPelicula(peliculas.get(aleatorio.nextInt(5)));

    }

    public void crearEspectadores() {

        /// creamos vectorres para ingresar los alumnos aletoriamente y no por consola 
        String[] nombre = {"juan", "pedro", "santiago", "esteban", "mateo", "judas", "bartolome", "jesus", "tomas",
            "andres", "guatavo", "valentina", "ston", "liliana", "natalia", "felipe", "pablo", "franci", "jose", "miguel", "francy", "eloisa", "carmen",
            "viviana", "sandra", "andrea", "samuel", "jacobo", "leonardo", "diana", "luisa", "juan", "pedro", "santiago", "esteban", "mateo", "judas", "bartolome", "jesus", "tomas",
            "tomas", "alberto", "carmen", "firulay", "rigoberto", "andres", "mauricio", "sifgifreo"};

        int[] edad = {18, 24, 30, 7, 12, 22, 15, 13, 16, 35, 60, 41, 23, 14, 16, 23, 48, 50, 12, 41, 6, 22, 23, 25, 14, 29, 14, 45, 33, 35, 42, 48, 49, 41, 33, 17, 49, 41, 33, 17, 18, 19, 12, 25, 26, 24, 19, 20};

        double[] dinero = {200, 50, 700, 40, 100, 600, 700, 800, 900, 1000, 220, 550, 420, 260, 500, 78, 120, 800, 900, 750, 220, 550, 420, 260, 500, 78, 120, 800, 900, 750, 800, 500, 600, 700, 100, 200, 300, 900, 800, 1400, 450, 650, 730, 55, 78, 630, 470, 554};

        int contador = 0;

        System.out.println("***************************");

        do {
            AtributosEspectadores Espectador = new AtributosEspectadores();
//             int num = (int) (Math.random() * (15 - (70 + 1)) + (70 + 1));

            Espectador.setNombre(nombre[aleatorio.nextInt(48)]);
            Espectador.setEdad(edad[aleatorio.nextInt(48)]);
            Espectador.setDinero(dinero[aleatorio.nextInt(48)]);

            // Espectador.setEdad((int) (Math.random() * (15 - (70 + 1)) + (70 + 1)));
            //  Espectador.setDinero((int) (Math.random() * (50 - (1000 + 1)) + (1000 + 1)));
            espectadores.add(Espectador);

            contador++;

        } while (contador < 48);

    }

    //// aca colocamos todo lo que hay que ir mostrando
    public void mostrar() {

        System.out.println(" La pelicula en exibicion en este momento Es: " + cinema.getPelicula());
    }

    public void mostrarEspectadores() {
        System.out.println("El listado de Espectadores Es: ");
        System.out.println("***************************");

        for (AtributosEspectadores espectadore : espectadores) {
            System.out.println("" + espectadore.toString());
        }
        System.out.println("************************");

    }

    public void IngresadosSala() {
       
       

        for (AtributosEspectadores ingre : espectadores) {

            if (ingre.getEdad() >= cinema.getPelicula().getEdad() && ingre.getDinero() >= cinema.getPrecio()) {

                cinema.getEspectador().add(ingre);

                
            }

        }

    }

    public void verSalaCineConEspectadores() {

        System.out.println("Sala durante  la Función: ");
        for (AtributosEspectadores aux : cinema.getEspectador()) {
            System.out.println("" + aux);

        }

    }

    public void puestoAleatorio() {
        int i;
        int j;

        for (AtributosEspectadores Espectador : cinema.getEspectador()) {
            do {

                i = aleatorio.nextInt(8);
                j = aleatorio.nextInt(6);
                if (cinema.getSala()[i][j].getEspetador() == null) {
                    cinema.getSala()[i][j].setEspetador(Espectador);
                }

            } while (cinema.getSala()[i][j].getEspetador() == null);

        }

    }

    public AtributosCine crearSalaCine() {
        AtributosPuesto p[][] = new AtributosPuesto[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Integer fila = 8 - i;
                String col = fila.toString();
                switch (j) {
                    case 0:
                        col = col.concat("A");
                        break;
                    case 1:
                        col = col.concat("B");
                        break;
                    case 2:
                        col = col.concat("c");
                        break;
                    case 3:
                        col = col.concat("D");
                        break;

                    case 4:
                        col = col.concat("D");
                        break;

                    case 5:
                        col = col.concat("E");
                        break;

                    case 6:
                        col = col.concat("F");
                        break;

                }
                p[i][j] = new AtributosPuesto(col, null);

            }

        }
        cinema.setSala(p);
        return cinema;

    }

    public void verSalaCine() {
        System.out.println("Sala durante  la Función: ");
       
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cinema.getSala()[i][j]+" ");

            }
            System.out.println("");
        }
        System.out.println("");
    }

}
