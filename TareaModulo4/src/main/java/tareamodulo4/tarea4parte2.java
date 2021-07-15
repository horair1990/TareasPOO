/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo4;

import mipaquete.Alemania;//Importamos la libreria mipaquete para poder llamar la clase de Alemania, Honduras e Inglaterra
import mipaquete.Honduras;
import mipaquete.Inglaterra;

/**
 *
 * @author Horair
 */
public class tarea4parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Alemania  alem = new Alemania(); //Creamos los objetos de las tres clases para luego ser utilizadas
          Inglaterra ing = new Inglaterra();
          Honduras hond = new Honduras();
          
          //Imprimimos los datos de las clases abstructuradas
          System.out.println("Equipo: "+alem.getEquipo());
          System.out.println("Capitan: "+alem.getCapitan()+"\n");
          System.out.println("Equipo: "+ing.getEquipo());
          System.out.println("Capitan: "+ing.getCapitan()+"\n");
          System.out.println("Equipo: "+hond.getEquipo());
          System.out.println("Capitan: "+hond.getCapitan()+"\n");
          
    }
    
}
