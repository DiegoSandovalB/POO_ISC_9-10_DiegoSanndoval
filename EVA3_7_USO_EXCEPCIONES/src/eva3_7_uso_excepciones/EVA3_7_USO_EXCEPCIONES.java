/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_uso_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_7_USO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datosErroneo = true; // suponer que el usuario siempre se equvoca
         Scanner input = new Scanner(System.in);
        do{
            try{
           
            System.out.println("Ingresa tu edad(numero entero)");
            int iedad =  input.nextInt();
            System.out.println("Tu edad: "  + iedad);
            datosErroneo = false;
            }catch(InputMismatchException e){
                System.out.println (input.next() + "El dato introducido no es correcto");
            }
        }while(datosErroneo);    
    }
    
}
