/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_rango;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_17_RANGO {

    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cual es tu calificacion?");
        califa = captu.nextInt();
        captu.nextLine();
        if(califa >= 0 || califa <= 100){
            System.out.println("Calificacion Valida");
        }else{
            System.out.println("Calificacion No Valida");
        }
    }
}
