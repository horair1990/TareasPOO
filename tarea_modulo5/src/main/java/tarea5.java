
import mipaquete.Circulo;//Importamos de la libreria mipaquete la clase Circulo
import mipaquete.Cuadrado;//Importamos de la libreria mipaquete la clase Cuadrado
import mipaquete.Linea;//Importamos de la libreria mipaquete la clase Linea
import mipaquete.Triangulo;//Importamos de la libreria mipaquete la clase Triangulo

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Horair
 */
public class tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo(); //Creamos el objeto de circulo para luego poder utilizarlo con sus metodos heredados
        Cuadrado cuadrado = new Cuadrado();//Creamos el objeto de cuadrado para luego poder utilizarlo con sus metodos heredados
        Linea linea = new Linea();//Creamos el objeto de linea para luego poder utilizarlo con sus metodos heredados
        Triangulo triangulo = new Triangulo();//Creamos el objeto de triangulo para luego poder utilizarlo con sus metodos heredados
        
        System.out.println("------Formas------");
        circulo.imprimirInformacion(); //Llamamos la clase circulo con su metodo heredado imprimirInformacion
        System.out.println("Radio del circulo "+circulo.radio(50.24)+"\n");//El metodo radio recibe como parametros un numero establecido, donde este devolvera el resultado
        cuadrado.imprimirInformacion();//Llamamos la clase cuadrado con su metodo heredado imprimirInformacion
        System.out.println("Area de un cuadrado "+cuadrado.area(12)+"\n");//El metodo area recibe como parametros un numero establecido, donde este devolvera el resultado
        linea.imprimirInformacion();//Llamamos la clase linea con su metodo heredado imprimirInformacion
        System.out.println();
        triangulo.imprimirInformacion();//Llamamos la clase triangulo con su metodo heredado imprimirInformacion
        System.out.println("Area del Triangulo: "+triangulo.area(4, 3));//El metodo area recibe como parametros dos numero establecido, donde este devolvera el resultado
    }
    
}
