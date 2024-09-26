/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_operador_or;

import java.util.Scanner;
/**
 *
 * @author ae478
 */
public class EVA1_16_OPERADOR_OR {

    public static void main(String[] args) {
        int km, meses;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuanto Kilometraje tiene el auto");
        km = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuantos Mese tiene el veiculo");
        meses = captu.nextInt();
        captu.nextLine();
        if(km >= 5000 || meses >= 6){
       System.out.println("Cambio de aceite");
     }else{
       System.out.println("Vehiculo en buenas condiciones");    
        }        
      
       
       
    }
}
