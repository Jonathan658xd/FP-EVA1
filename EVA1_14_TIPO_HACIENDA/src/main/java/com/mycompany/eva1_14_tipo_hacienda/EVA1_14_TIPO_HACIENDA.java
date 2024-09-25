/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_14_TIPO_HACIENDA {

    public static void main(String[] args) {
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura el tipo de persona F:E");
        tipo = captu.nextLine().charAt(0);
        System.out.println("El caracter " + tipo);
        if(tipo == 'F')
        System.out.println("Persona fisica");
    else
        System.out.println("persona moral");
    }
}
