/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_22_CALIFAS {

    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce tu Calificacion");
        califa = captu.nextInt();
        if(califa > 100){
            System.out.println("No se puede sacar mas de 100");
        } else if(califa >= 90)  {  
            System.out.println("A");
        
        } else if(califa >= 80)  {  
            System.out.println("B");
        
        } else if(califa >= 70)  {  
            System.out.println("C");
        
        } else if(califa >= 60)  {  
            System.out.println("D");
        
        } else   {  
            System.out.println("F");
        
          
            
        
                
        }
            
        
    }
}
