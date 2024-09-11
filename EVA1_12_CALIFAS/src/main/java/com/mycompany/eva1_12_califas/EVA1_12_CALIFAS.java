/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿cual es la calificacion?");
        califa = captu.nextInt();
        if(califa >= 70){
            System.out.println("ACREDITaS");
        }else{
        
            System.out.println("NA");}
    }
}
