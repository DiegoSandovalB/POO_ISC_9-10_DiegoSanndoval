/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clase_persona;

/**
 *
 * @author yeyos
 */
public class EVA1_2_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        //implementación
        System.out.println("hola mundo");
        //como crear un objeto en java
        //instanción: crear un objeto
        //dar memoria
        //decalarar              construir
        Persona estudiante = new Persona(); // declaro un identioficador (objeto) tipo Persona
        estudiante.edad = 18;
        estudiante.id = "21550307";
        estudiante.nombre = "Diego Sandoval";
      
        Persona estudiante2 = new Persona();
        estudiante2.edad = 19 ;
        estudiante2.id = "00112233";
        estudiante2.nombre = "Juan Perez";
        
        Persona estudiante3 = new Persona();
        estudiante2.edad = 19 ;
        estudiante2.id = "00112233";
        estudiante2.nombre = "Juan Perez";
        
        System.out.println(estudiante.nombre);
        System.out.println(estudiante2.nombre);
        
        estudiante2.imprimirDatos();
        System.out.println(estudiante2.calcularAñodenacimiento());
    }
}

//una calse es un tipo de dato abstracto
class Persona//declaración 
{ //implementacón
    //ATRIBUTOS DE LAM CALSE
    String id;
    String nombre;
    int edad;
    //comportamiento
    //metodo imprimir datos
    void imprimirDatos(){
     System.out.println("El nombre es: " + nombre);
     System.out.println("Su id es: " + id);
     System.out.println("Su edad es: " + edad);
 
    }
    
    int calcularAñodenacimiento(){
        int añosc= 2022-edad;
        return añosc;
    
    }
}
        
    

