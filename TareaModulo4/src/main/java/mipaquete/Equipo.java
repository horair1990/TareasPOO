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
//Creamos una clase abstracta con la palabra reservada abstract
public abstract class Equipo {
    
    //Creamos los metodos abstractos de getEquipo y getCapitan para luego ser utilizados en otras clases
    //Con estos metodos obtenemos el retorno del nombre del equipo y el nombre del capitan
    abstract String getEquipo();
    
    abstract String getCapitan();
    
    
    
    
}
