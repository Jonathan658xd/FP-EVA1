/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_operaciones;

/**
 *
 * @author ae478
 */
public class EVA1_7_OPERACIONES {

    public static void main(String[] args) {
      //OPERACIONES ARITMETICAS
      int x = 10; //declaracion y asignacion
      int y = 5;
      //declaracion de multiples variables del mismo tipo
      int suma, resta, divi, multi, pot, raix;
      //SUMA Y RESTA
      suma = x + y; //0perador de suma +
      System.out.println("suma de x + y: ");
      System.out.println(suma);
        
      resta = x - y;//operador de diferencia -
      System.out.println("Rwesta de x - y");
      System.out.println(resta);
      
      //MULTIPLICACION
      multi = x * y;//operador de multiplicacion *
      System.out.println("Multiplicacion de x * y:");
      System.out.println(multi);
      
      divi = x / y;
      System.out.println("Divicion de x / y");
      System.out.println(divi);
      //cambiamos los valores de x y
      x = 7;
      y = 3;
      divi = x / y;
      System.out.println("Divicion x(7) / y(3)");
      System.out.println(divi);
      
      double va11 = 11;
      double va12 = 3;
      double diviD;
      
      diviD = va11 / va12;
      System.out.println("Divicion entre decimales");
      System.out.println(diviD);
      
      
        
                
    }
}
