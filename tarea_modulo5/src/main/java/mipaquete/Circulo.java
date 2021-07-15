/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipaquete; //Se le declara un paquete

/**
 *
 * @author Horair
 */
public class Circulo extends Formas { //Creamos la clase Circulo que extiende de la clase Formas
    double radio; //Creamos una variable de tipo double para almacenar el resultado del radio
    //Creamos una clase para la clase circulo y en ella establecemos o usamos los metodos que utilizamos en la clase Formas
    public Circulo(){
        Setdibujar("Circulo");//Utilizamos el metodo Setdibujar de la clase Formas, donde establecemos el nombre de la forma
    }
    
    //Creamos el metodo radio, donde podemos calcular el radio de un circulo
    public double radio(double area){//recibimos como parametro la variable area
        radio = area/3.1416;
        return radio;//retorna el valor de radio
    }

    
    



    
    
    
    
}
