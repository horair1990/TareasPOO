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

// En la clase de Inglaterra añadimos la palabra reservada extends para heredar los metodos de la clase Equipo
public class Inglaterra extends Equipo{

    //Utilizamos los metodos abstractos de la clase abstracta Equipo y retornamos el nombre del equipo y del capitan
    @Override
    public String getEquipo() {
        return "Inglaterra";
    }

    @Override
    public String getCapitan() {
        return "Harry Kane";
    }
    
    
}
