/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recejeextra2;

import ServicioCinema.MetodosCinema;

/**
 *
 * @author User
 */
public class MAINCINEMA {

    public static void main(String[] args) {
        MetodosCinema sala = new MetodosCinema();
        
        sala.crearPeliculas();
        sala.mostrar();
        sala.crearEspectadores();
        sala.mostrarEspectadores();
       
       sala.crearSalaCine();
         System.out.println("espectadores en sala");
        sala.IngresadosSala();
       // sala.verSalaCineConEspectadores();
       sala.puestoAleatorio();
     //  sala.verSalaCine();
       
        
        
     
        
        System.out.println("Ubicacion "+" Espectaodor");
       sala.verSalaCine();
        
        
//        System.out.println("espectadores en sala");
    sala.verSalaCineConEspectadores();
//     
        
    }
}
