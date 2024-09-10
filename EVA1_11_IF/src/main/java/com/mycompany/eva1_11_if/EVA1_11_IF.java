/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_11_IF {

    public static void main(String[] args) {
        //CONDICIONAL
        //LOGICA BOLEANA --> OPERACIONES DE VERDADERO O FALSO
        //SOLICITAR LA EDAD DE AÑOS
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura la edad");
        edad = captu.nextInt();
        //DETERMINA SI ES UN ADULTO O NO
        //LAS OPERACIONES LOGICAS SOLO GENERAN COMO
        //RESULTADO VERDADERO O FALSO
        //SI SON VARIAS INSTRUCCIONES, HAY QUE
        //AGRUPALAS CON LLAVES {}
        if(edad >= 18){//BLOQUE PARA EL VERDADERO
        System.out.println("ES UN ADULTO");
        }else{//bloque para el falso (OPCIONAL)
            System.out.println("MENOR DE EDAD!!");           
        }
                
    }
}
