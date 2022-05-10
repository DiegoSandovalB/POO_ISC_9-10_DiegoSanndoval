/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_polimorfismo_interface;

/**
 *
 * @author yeyos
 */
public class Prueba implements Mensaje {

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void otroMetodo(){
        System.out.println("Metodo adicional");
    }
    public static void mostrar(Mensaje m){
        m.mostrarMensaje("Hola mundo");
    }
}


