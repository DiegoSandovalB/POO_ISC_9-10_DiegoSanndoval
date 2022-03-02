/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_7_memoria;

/**
 *
 * @author yeyos
 */
public class EVA_1_7_MEMORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor =5;
        String code = "hola";
        Prueba obj = new Prueba ();
        
        System.out.println("Valor= " + valor);
        System.out.println("Cadena= " + code);
        System.out.println("Obj= " + obj);
    }
}

class Prueba{
   public void saludar(){
       System.out.println("hola mundo");
   }
}