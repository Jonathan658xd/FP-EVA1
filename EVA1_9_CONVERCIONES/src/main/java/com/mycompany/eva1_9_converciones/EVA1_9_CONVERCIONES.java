/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_converciones;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_9_CONVERCIONES {

    public static void main(String[] args) {
        double far, cent, kel;
        Scanner captu = new Scanner(System.in);
        System.out.println("Temperaturas en grados farenheit");
        far = captu.nextDouble();
        cent = (far - 32) / 1.8;
        System.out.println("grados centigrados = " + cent);
        //CONVERTIR AHORA DE CENTIGRADOS A FARENHEIT
        //Kelvin
       System.out.println("Temperaturas en grados centigrados");
       cent = captu.nextDouble();
       far = (cent - 32) * 5 / 9;
       System.out.println("grados farenheit = " + far);
       
       System.out.println("temperaturas en grados  farenheit");
       far = captu.nextDouble();
       kel = ((far - 32) * 5 / 9) + 273.1;
       System.out.println("grados kelvin = " + kel);
       
    }
}
