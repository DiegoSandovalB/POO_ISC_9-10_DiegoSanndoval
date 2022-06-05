/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_try_catch_0;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_6_TRY_CATCH_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int entero =  input.nextInt();
        System.out.println("Ingresa un segundo numero entero");
        int entero2 =  input.nextInt();
        
        //System.out.println("Division: " + entero/entero2);
        
        try{
          System.out.println("Division: " + entero/entero2);  
        }catch(ArithmeticException a){
            System.out.println("Se produjo un error");   
        }
        System.out.println("Fin del programa");
    }
    
    
    
}
