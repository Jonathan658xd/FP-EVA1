/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_meses;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_19_MESES {

    public static void main(String[] args) {
        int meses;
         Scanner captu = new Scanner(System.in);
        System.out.println("Numero corespodiente al dia (1 - 12)");
        meses = captu.nextInt();
          if(meses == 1){
            System.out.println("Enero");
        }else if(meses == 2){ 
            System.out.println("Febrero");
        }else if(meses == 3){ 
            System.out.println("Marzo");
        }else if(meses == 4){ 
            System.out.println("Abrl");
        }else if(meses == 5){ 
            System.out.println("Mayo");
        }else if(meses == 6){ 
            System.out.println("Jumio");
        }else if(meses == 7){ 
            System.out.println("Julio");
        }else if(meses == 8){ 
            System.out.println("Agosto");
        }else if(meses == 9){ 
            System.out.println("Septiembre");
        }else if(meses == 10){ 
            System.out.println("Octubre");
        }else if(meses == 11){ 
            System.out.println("Noviembre");          
        }else if(meses == 12){ 
            System.out.println("Diciembre");          
        }else{
            System.out.println("Numero no valido (deben ser del 1 al 12)");
        }    
          
    }
}
