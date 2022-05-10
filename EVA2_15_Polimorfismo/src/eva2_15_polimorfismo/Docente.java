/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author yeyos
 */
public class Docente extends Persona {
    private String noRegitro;

    public Docente() {
    }

    public Docente(String noRegitro, String nombre, int edad) {
        super(nombre, edad);
        this.noRegitro = noRegitro;
    }

    public String getNoRegitro() {
        return noRegitro;
    }

    public void setNoRegitro(String noRegitro) {
        this.noRegitro = noRegitro;
    }
    
}
