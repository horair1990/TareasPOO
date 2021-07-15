/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipaquete;

/**
 *
 * @author Horair
 */
public class Recursos {
     public void mensaje(){
        System.out.println("Programación Orientada a Objetos 2021");
    }
     
     public void estudiante_edad(int edad){
        if(edad>=21){
            System.out.println("Mayor de edad");
        }else {
            System.out.println("Menor de edad");
        }
    }
     
     public void multiplicacion(int n1, int n2){
         int multiplicacion = n1*n2;
         System.out.println("La multiplicacion de "+n1+" * "+n2+" es: "+multiplicacion);
     }
     
     public void lista_numeros(int n1){
        for(int i = 1; i<=n1;i++){
            System.out.println(i);
        }
     }
     
}
