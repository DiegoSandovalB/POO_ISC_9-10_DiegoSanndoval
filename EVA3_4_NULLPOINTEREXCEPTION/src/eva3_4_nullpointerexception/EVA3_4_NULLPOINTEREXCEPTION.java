/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_nullpointerexception;

/**
 *
 * @author hp
 */
public class EVA3_4_NULLPOINTEREXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona persona = new Persona("Juan");
        Persona persona = null;
        imprimir(persona);
        System.out.println("Fin de main");
    }
    
    public static void imprimir(Persona perso){
        masComplicado(perso);
        System.out.println("Fin de imprimir");
    }
    public static void masComplicado(Persona perso){
         System.out.println("Nombre: " + perso.getNombe());
         System.out.println("Fin de mas complicado");
    }
}

class Persona{
    private String nombe;

    public Persona() {
    }

    public Persona(String nombe) {
        this.nombe = nombe;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }
    
}