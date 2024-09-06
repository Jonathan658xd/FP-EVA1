/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_10_FORMULAS {

    public static void main(String[] args) {
        double vel, tiem, dis, ace;
        Scanner captu = new Scanner(System.in);
        
        
        System.out.println("velocidad inicial: ");
        vel = captu.nextDouble();
        System.out.println("Tiempo: ");
        tiem = captu.nextDouble();
        System.out.println("Acelaracion");
        ace = captu.nextDouble();
        dis = vel * tiem + (ace * tiem * tiem) / 2;
        System.out.println("Distencia = " + dis);
        
                
        
        
        
    }
}
