/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_5_ENTRADA_DATOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //DECLARAR LAS VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;
        //¿como se captura?
        //SCANNER
        //Herramienta--Clase: nos preporciona muchas herramientas
        Scanner captu;//declaramos la herramienta previamente
                      //hay que importar(hacer un import)
        captu = new Scanner(System.in);//creamos la herramienta
        
        //HAY QUE DARLE INTRUCIONES AL USUARIO QUE CAPTURAR
        System.out.println("introduce la marca del veiculo");
        //capturamos -- una asignacion
        marca = captu.nextLine();//les remplasa todo el texto hasta capturar
                                 //se preciona la tecla enter
        System.out.println("Introduce el modelo del veiculo:");
        modelo = captu.nextLine();
        System.out.println("Introduce el año:");
        year = captu.nextInt();
        System.out.println("Introduce el precio:");
        precio = captu.nextDouble();
        
       
        System.out.println("Datos capturados---------------------");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
    }
}
