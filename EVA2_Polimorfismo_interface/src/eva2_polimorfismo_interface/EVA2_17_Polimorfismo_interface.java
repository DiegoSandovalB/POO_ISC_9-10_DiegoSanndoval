/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_polimorfismo_interface;

/**
 *
 * @author yeyos
 */
public class EVA2_17_Polimorfismo_interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prueba prueba1 = new Prueba();
        prueba1.mostrarMensaje("hola mundo");
        prueba1.otroMetodo();
        mostrar(prueba1);
    }
    public static void mostrar(Mensaje m){
        m.mostrarMensaje("hola mundo 3");
    }
}
