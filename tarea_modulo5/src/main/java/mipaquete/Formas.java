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

public abstract class Formas { //Creamos la clase Formas de tipo abstracta
    
    //Atributos o propiedades
    private String color; //Creamos el atributo color de la superclase Formas
    private String dibujo;//Creamos el atributo dibujo de la superclase Formas
    
    //Creamos un constructor sin parametros
    public Formas(){
        //Constructor sin parametros
    }
    
    
    //Metodos de establecer color
    public void establecerColor(String color){
        this.color = color;
    }
    
    //Creamos el metodo de Setdibujar
    public void Setdibujar(String dibujo){
        this.dibujo = dibujo;
    }
    
    //Creamos el metodo de Getdibujar, que luego sera utilizado en otras clases para poder obtener el nombre de la figura
    public String Getdibujar(){
        return this.dibujo;
    }
    
    //Creamos el metodo imprimirInformacion, que este nos ayudara a imprimir el nombre de la figura que nosotros establezcamos
    public void imprimirInformacion(){
        System.out.println(dibujo);
    }
    
    
    
    
}
