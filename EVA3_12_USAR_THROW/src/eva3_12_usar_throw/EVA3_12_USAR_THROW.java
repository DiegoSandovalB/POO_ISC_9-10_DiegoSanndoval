/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_usar_throw;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class EVA3_12_USAR_THROW {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad(Valor entero positivo): ");
        int valor =input.nextInt();
        System.out.println("La edad capturada es: " + valor);  
        if(valor < 0)          
                throw new Exception("El valor = " + valor + "no es valido"); 
                System.out.println("La edad capturada es: " + valor);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    
}
