/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_custom_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_16_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionDeCaptura {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
            System.out.println("Introduce tu edad:");
            int valor = 0;
            try{
               valor = input.nextInt();
            }catch(InputMismatchException ex){
                throw new ExcepcionDeCaptura("introdujiste una cadena de texto no un numero");
            }
    }
    
}
class ExcepcionDeCaptura extends Exception{

    public ExcepcionDeCaptura() {
    }

    public ExcepcionDeCaptura(String message) {
        super(message);
    }
    
}