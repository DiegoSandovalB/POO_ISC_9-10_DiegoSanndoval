/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Excepciones ---- Objetos
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");
        int iedad = 0 ;
       try{
            iedad =  input.nextInt();
        }catch(InputMismatchException e){ 
         //e.printStackTrace();
           System.out.println("Upps!! Fallo la captura!! ");
        }
        System.out.println("Tu edad: "  + iedad);
    }
    
}
