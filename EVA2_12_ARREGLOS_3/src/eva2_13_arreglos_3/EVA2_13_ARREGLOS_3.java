/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_arreglos_3;

import java.util.Scanner;

/**
 *
 * @author yeyos
 */
public class EVA2_13_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona[] arregloPer = new Persona[10];
        Scanner input = new Scanner (System.in);
        for (int i = 0; i < 10; i++) {
            arregloPer[i] = new Persona();
            System.out.println("¿Cual es tu nombre?");
            arregloPer[i].setNombre(input.nextLine());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre: " + arregloPer[i].getNombre());
        }
    }
    
}
class Persona{
private String nombre;

 public Persona() {
}

 public Persona(String nombre) {
this.nombre = nombre;
}

 public String getNombre() {
return nombre;
}

 public void setNombre(String nombre) {
this.nombre = nombre;
}
}

