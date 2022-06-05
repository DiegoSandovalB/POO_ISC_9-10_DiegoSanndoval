/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_mejorar_captura_de_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_13_MEJORAR_CAPTURA_DE_EDAD {

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
            if(iedad < 0)          
                throw new Exception("El valor = " + iedad + "no es valido"); 
                System.out.println("La edad capturada es: " + iedad);
            System.out.println("Tu edad: "  + iedad);
            datosErroneo = false;
             }catch(InputMismatchException e){
                System.out.println (input.next() + " El dato introducido no es correcto");
            }catch(Exception e){
                System.out.println (input.next() + " Edad no valida"); 
            }
                    
        }while(datosErroneo);   
    }
    
}
