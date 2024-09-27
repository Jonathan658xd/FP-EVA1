/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_else_anidado;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_18_ELSE_ANIDADO {

    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Numero corespodiente al dia (1 - 7)");
        dia = captu.nextInt();
        if(dia == 1){
            System.out.println("Lunes");
        }else if(dia == 2){ 
            System.out.println("martes");
        }else if(dia == 3){ 
            System.out.println("miercoles");
        }else if(dia == 4){ 
            System.out.println("Jueves");
        }else if(dia == 5){ 
            System.out.println("Viernes");
        }else if(dia == 6){ 
            System.out.println("Sabado");
        }else if(dia == 7){ 
            System.out.println("Domingo");
        }else{    
          System.out.println("Numero no valido (deben ser del 1 al 7)");
        }
    }
}
