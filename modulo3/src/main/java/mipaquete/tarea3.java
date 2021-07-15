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
public class tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mecanico mecan = new mecanico();
        mecan.getnombre("Horair");
        mecan.getapellido("Ponce");
        mecan.getedad(20);
        mecan.gettelefono(9651564);

        System.out.println("Ocupacion Mecanico");
        System.out.println("Nombre: " + mecan.getnombre() );
        System.out.println("apellido: " + mecan.getapellido() );
        System.out.println("Edad: " + mecan.getedad() );
        System.out.println("Telefono: " + mecan.gettelefono() );
    }
    
}
