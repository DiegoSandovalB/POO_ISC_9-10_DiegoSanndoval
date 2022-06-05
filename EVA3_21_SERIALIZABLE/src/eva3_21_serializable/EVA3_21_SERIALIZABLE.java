/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_21_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class EVA3_21_SERIALIZABLE {

    /**
     * @param args the command line 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("Diego", "Sandoval");
        escribirObj(persona1);
    }
    //guardar objetos
    public static void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("C:/ARCHIVOS PRACTICAS JAVA/prueebaa.txt");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch); 
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //leer objeto
    public static void leerObj(Object obj){
        try {
            FileInputStream abrirArch = new FileInputStream("C:/ARCHIVOS PRACTICAS JAVA/prueebaa.txt");
            ObjectInputStream leerObj = new ObjectInputStream(abrirArch);   
            Persona persona = (Persona)leerObj.readObject();
            System.out.println("Nombre" + persona.getNombre()+ " " + persona.getApellido());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
class Persona implements Serializable{
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}

/*
Hay dos tipos de archivos: binarios y de texto

*/