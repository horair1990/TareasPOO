/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo4;
import mipaquete.Futbolista;//importamos la libreria mipaquete para poder llamar la clase Futbolista
import java.util.Scanner; //Importamos la libreria Scanner para poder ingresar datos al sistema
/**
 *
 * @author Horair
 */
public class tarea4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Futbolista futbolista = new Futbolista(); //Creamos un objeto de la clase Futbolista
        Scanner entrada = new Scanner(System.in); // Funcion para poder ingresar datos al sistema
        //Creacion de tres variables
        int edad;
        String nomb;
        String equipo;
        
        //Pedimos datos al usuario
        System.out.println("Ingrese el nombre del futbolista: ");
        nomb = entrada.nextLine();
        
        System.out.println("Ingrese el equipo del futbolista: ");
        equipo = entrada.nextLine();
        
         System.out.println("Ingrese la edad del futbolista: ");
        edad = entrada.nextInt();
        
        
        //Mandamos como parametros las variables que declaramos en la clase que contiene el metodo main
        futbolista.setEdad(edad);
        futbolista.setNombre(nomb);
        futbolista.setEquipoActual(equipo);
        
    
        //Mandamos a imprimir los datos ingresados por el usuario mediante la clase y su funcionamiento con encapsulamiento
       System.out.println("El nombre del futbolista es: "+futbolista.getNombre());
       System.out.println("El equipo del futbolista es: "+futbolista.getEquipoActual());
       System.out.println("La edad del futbolista es: "+futbolista.getEdad());
                
        
    }
    
}
