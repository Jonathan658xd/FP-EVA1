/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_pantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA1_15_PANTALLA_INICIO {

    public static void main(String[] args) {
        
        final  String USUARIO = "Admin";
        final  String PASSWORD = "Admin";
        //final PI = 3.1416;
        
        String usu, pwd;
        Scanner captu = new Scanner(System.in);
        System.out.println("Usuario:");
        usu = captu.nextLine();
        System.out.println("Password:");
        pwd = captu.nextLine();
        //COMO VALIDAMOS EL ACCESO
        if(usu.equals(USUARIO) && pwd.equals(PASSWORD)){
        System.out.println("ACCESO CONSEDIDO:");
        }else{
        System.out.println("ACCESO DENEGADO:");
                
        }
    }
}
