/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_arreglos_2;

import java.util.Scanner;

/**
 *
 * @author yeyos
 */
public class EVA2_12_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arregloEdad = new int[32];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 32; i++) {
            System.out.println("¿Cual es tu edad?");
            arregloEdad[i] = input.nextInt();
        }
        for (int i = 0; i < 32; i++) {
            System.out.println("[" + arregloEdad[i] + "]");   
        }
    }
    
}
