/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_interfaces_obj;

/**
 *
 * @author yeyos
 */
public class EVA2_18_INTERFACES_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setNombre("Ana");
        
        Mensaje mensaje = persona;
        mensaje.mostrarMensaje();
    }
    
}
interface Mensaje{
    public void mostrarMensaje();
}

class Persona implements Mensaje{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void mostrarMensaje(){
        System.out.println(nombre);
        }
}


/*Para crear calse de un objeto necesitamos asignarle una clase y hacer un objeto crear
un objeto y sobreescribir la interface, para despues  igualar la clase a la interface
en este caso (Mensaje mensaje = persona;)
*/
