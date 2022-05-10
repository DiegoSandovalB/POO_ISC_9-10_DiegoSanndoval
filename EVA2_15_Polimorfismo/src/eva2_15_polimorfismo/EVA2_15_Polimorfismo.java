/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author yeyos
 */
public class EVA2_15_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 20);
        Estudiante estudiante = new Estudiante("1223344", "maria", 20);
        Docente docente = new Docente("231141241", "Pedro", 50);
        
        Persona persoEstu = estudiante;
    }
    
}    

  