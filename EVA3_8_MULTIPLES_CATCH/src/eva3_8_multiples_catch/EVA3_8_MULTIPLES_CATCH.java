/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_8_MULTIPLES_CATCH {

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
        }catch(ArithmeticException a){
            System.out.println("Se produjo un error");   
        }catch(InputMismatchException e){
            System.out.println("El valor capturado es un numero entero no validocvVd");
        }
        System.out.println("Fin del programa");
    }
    
    
}
