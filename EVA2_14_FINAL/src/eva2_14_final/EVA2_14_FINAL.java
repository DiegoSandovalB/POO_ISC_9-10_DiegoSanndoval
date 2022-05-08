/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_final;

/**
 *
 * @author yeyos
 */
public class EVA2_14_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class EstudiantePosgrado extends Estudiante{
    
}
final class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
    }

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public Estudiante(String noControl, String nombre) {
        super(nombre);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    
}

class Persona{
private String nombre;

 public Persona() {
}

 public Persona(String nombre) {
this.nombre = nombre;
}

 public String getNombre() {
return nombre;
}

 public void setNombre(String nombre) {
this.nombre = nombre;
}
}
