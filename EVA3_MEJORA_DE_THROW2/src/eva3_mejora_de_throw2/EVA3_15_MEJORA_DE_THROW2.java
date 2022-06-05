/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_mejora_de_throw2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_15_MEJORA_DE_THROW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Persona persona1= new Persona();
        boolean datoErroneo =true; //
        Scanner input=new Scanner(System.in);
        int edad=0;
        do{
            try {
                System.out.println("Ingrese la edad:");
                edad=input.nextInt();
                persona1.setEdad(edad);
                datoErroneo=false;
                System.out.println("La edad es: "+persona1.getEdad());
            } catch (Exception ex) {
                System.out.println("Rango de edad invalido");
            }
        }while(datoErroneo);
               
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

    public void setNombre(String nombre) throws Exception {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if(edad>=0 && (edad<=130)){
            this.edad = edad;
        }else{
            throw new Exception("Rango de edad incorrecta");
        }
        
    }
    
}