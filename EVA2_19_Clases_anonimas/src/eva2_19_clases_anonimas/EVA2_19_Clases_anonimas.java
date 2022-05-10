/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_clases_anonimas;

/**
 *
 * @author yeyos
 */
public class EVA2_19_Clases_anonimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mensaje mensaje = new Mensaje(){
            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo");
            }
        };
    }
    
}
interface Mensaje{
    public void mostrarMensaje();
}



/*
Se puede crear una calse temporal que solo se usara cuando se este utilizando la interface

*/