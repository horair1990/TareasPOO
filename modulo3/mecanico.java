/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipaquete;

/**
 *
 * @author Kevin
 */
public class mecanico {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    
    
    
    public String getnombre(){
        return nombre;
    }
    
    public String getapellido(){
        return apellido;
    }
    

    public int getedad(){
        return edad;
    }
    
    public int gettelefono(){
        return telefono;
    }
    
     public void getnombre(String nombre){
        this.nombre = nombre;
    }
     
     public void getapellido(String apellido){
        this.apellido = apellido;
    }
     
     public void getedad(int edad){
        this.edad = edad;
    }
     
     public void gettelefono(int telefono){
        this.telefono = telefono;
    }



}
