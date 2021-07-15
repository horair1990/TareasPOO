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
public class Triangulo extends Formas{ //Creamos la clase Triangulo que extiende de la clase Formas
    double Angulo;//Creamos el atributo de Angulo
    
    
   public Triangulo(){
        Setdibujar("Triangulo");//Utilizamos el metodo Setdibujar de la clase Formas, donde establecemos el nombre de la forma
    }
   
   //Creamos el metodo area, donde podemos calcular el radio de un triangulo
   public double area(double base, double altura){//recibimos como parametro la variable base y altura
       double area; //creamos la variable area para almacenar el resultado
       area=base*altura/2;
       return area;//retornamos el valor de la variable area
   }
    
    
    
}
