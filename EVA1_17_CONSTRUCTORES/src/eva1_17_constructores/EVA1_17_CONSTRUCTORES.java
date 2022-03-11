/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_constructores;

/**
 *
 * @author yeyos
 */
public class EVA1_17_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       persona Persona1 = new persona();
        System.out.println("Nombre: " + Persona1.getNombre());
        System.out.println("Edad: " + Persona1.getEdad());
        
       persona Persona2 = new persona();
        System.out.println("Nombre: " + Persona2.getNombre());
        System.out.println("Edad: " + Persona2.getEdad());
        
      persona Persona3= new persona("Diego", 18);
        System.out.println("Nombre: " + Persona3.getNombre());
        System.out.println("Edad: " + Persona3.getEdad());  
    }
    
}
class persona{
    
   public persona(){
       System.out.println("Creando objeto");
       nombre = " Juan";
       edad= 100;
               
   }
   public persona(String nombre, int edad){
       System.out.println("Creando objeto");
       this.nombre = nombre;
       this.edad= edad;
               
   }
    
   private String nombre;
   private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}