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
public class Futbolista {
    
    //Declaramos 3 variables de tipo privado para el funcionamiento del encapsulamiento
    private Integer edad;
    private String nombre; 
    private String equipoActual;
    
    //Metodos con parametros para recibir datos y establecerlos en las variables privadas
    public void setEdad(int _edad){
        this.edad = _edad;
    }
    
     public void setEquipoActual(String _equipo){
        this.equipoActual = _equipo;
    }
    
     public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    
     
     //Metodos para retornar el valor de la variable privada
    public String getNombre(){
        return nombre;
    }
        
    public String getEquipoActual(){
        return equipoActual;
    } 
    
     public int getEdad(){
        return edad;
    }
    
    
    
}
