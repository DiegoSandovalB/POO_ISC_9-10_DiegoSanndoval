/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva._3_mod_acceso;

/**
 *
 * @author yeyos
 */
public class EVA_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona();
        per1.setNombre("Diego");
        per1.setEdad(18);
        per1.setId("00112233");
        
        System.out.println("Nombre: " + per1.getNombre() + "\n" + "Edad: " + per1.getEdad());
    }
    
}
class Persona//declaración 
{ //implementacón
    //ATRIBUTOS DE LAM CALSE
    String id;
    String nombre;
    int edad;
    //comportamiento
public String getId(){
   return id;    
    }
public String getNombre(){
   return nombre;    
    }        
public int getEdad(){
   return edad;    
    }        
public void setId(String valor){
    id = valor;
    }
public void setNombre(String valor){
    nombre = valor;
    }
public void setEdad(int valor){
    edad = valor;
    }
}
    
