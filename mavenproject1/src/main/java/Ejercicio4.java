/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Horair
 */


import java.util.Scanner;

public class Ejercicio4 {
 
     public static void main(String [] args){
         Scanner lector = new Scanner (System.in);
         String[] ciudades = new String[20];
         
        
         
         for (int i = 0; i <20; i++) {
             
             System.out.println("Ingrese "+(i+1)+" ciudad: ");
            ciudades[i] = lector.nextLine();
         }
          System.out.println();
          System.out.println();

           for (int i = 0; i <20; i++) {
             System.out.println(ciudades[i]);
          
         }
    }

}
