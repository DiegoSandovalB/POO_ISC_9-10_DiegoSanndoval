/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_clase_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_9_CLASE_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int entero =  input.nextInt();
        System.out.println("Ingresa un segundo numero entero");
        int entero2 =  input.nextInt(); 
        System.out.println("Division: " + entero/entero2);   
        }catch(Exception e){
            System.out.println("Division invalida");
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }
    
}
