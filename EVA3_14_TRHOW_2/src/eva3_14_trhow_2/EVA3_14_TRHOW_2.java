/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_trhow_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_14_TRHOW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona ();
        persona.setNombre("juan");
        try{
         persona.setEdad(20);
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
        try{
            Persona persona2 = new Persona("juan", 20);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
//parrte del codigo nuevo
        public static int capturarEdad() throws Exception{
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce tu edad:");
            int valor = 0;
            try{
               valor = input.nextInt();
            }catch(InputMismatchException ex){
                ex.printStackTrace();
                throw new Exception("introdujiste una cadena de texto no un numero");
            }
               return valor;
        }
}
   
    

class Persona{
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{ 
        if((edad >=0) && (edad<= 130))
        this.edad = edad;
        else
            throw new Exception ("Rango de edad invalido");
    }
    
    
}
