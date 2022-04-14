/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_herencia_e_interfaces;

/**
 *
 * @author yeyos
 */
public class Estudiante extends Persona implements MuestraDatos{
    private String NoControl;

    public Estudiante() {
        this.NoControl = "";
    }

    
    public Estudiante(String NoControl, String nombre, int edad) {
        super(nombre, edad);
        this.NoControl = NoControl;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }
        @Override
    public void ImprimirDatos() {
            System.out.println("Nombre: " + getNombre());
            System.out.println("Edad: " + getEdad());
            System.out.println("Numero de control: " + NoControl);
    }

    

    
}
