/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_copia_objetos;

/**
 *
 * @author yeyos
 */
public class EVA1_10_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prueba obj1  = new Prueba();
        System.out.println("Direccion: " + obj1);
        obj1.x = 100;
        System.out.println("Valor de x: " + obj1.x);
        //Prueba respaldo=obj1
        Prueba respaldo = new Prueba();
        obj1.x=respaldo.x; 
        System.out.println("Valor de x en respaldo = " + respaldo.x);
        respaldo.x = 0;
        System.out.println("Valor de x: " + obj1.x);   
        System.out.println("Valor de x en respaldo = " + respaldo.x);
        System.out.println("Obj1: " + obj1);   
        System.out.println("Respaldo: " + respaldo);
    }
    
}

class Prueba{
    public int x;
}