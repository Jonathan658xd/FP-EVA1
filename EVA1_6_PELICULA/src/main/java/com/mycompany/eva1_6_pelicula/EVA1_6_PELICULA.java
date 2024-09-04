/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_6_PELICULA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String Nombre;
        String Genero;
        int Duracion;
        String Reparto;
        String Clasificacion;
        
        Scanner captu;
        captu = new Scanner(System.in);
        System.out.println("captura el nombre de la pelicula");
        Nombre = captu.nextLine();
        System.out.println("captura el genero");
        Genero = captu.nextLine();
        System.out.println("captura la duracion en segundos");
        Duracion = captu.nextInt();
        System.out.println("captura el reparto");
        Reparto = captu.nextLine();
        System.out.println("captura la clasificacion");
        Clasificacion = captu.nextLine();
        
        System.out.println("IMPRECION DE LOS DATOS");
        System.out.println("Datos capturados----------------------------");
        System.out.println("Nombre");
        System.out.println("Genero");
        System.out.println("Duracion"); 
        System.out.println("Reparto") ;       
        System.out.println ("Clasificacion");
        
        
        
        
        
        
    }
}
