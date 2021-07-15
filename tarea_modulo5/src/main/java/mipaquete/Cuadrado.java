/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipaquete;//Se le declara un paquete

/**
 *
 * @author Horair
 */
public class Cuadrado extends Formas { //Creamos la clase Cuadrado que extiende de la clase Formas
    double area; //Creamos una variable de tipo double para almacenar el resultado del area
     
    public Cuadrado(){
        Setdibujar("Cuadrado");//Utilizamos el metodo Setdibujar de la clase Formas, donde establecemos el nombre de la forma
    }
    
    //Creamos el metodo area, donde podemos calcular el area de un cuadrado
    public double area(double lado){//recibimos como parametro la variable lado
    area = lado*lado*lado*lado;
    return area;//retorna el valor de area
    }

    
    
    
}
