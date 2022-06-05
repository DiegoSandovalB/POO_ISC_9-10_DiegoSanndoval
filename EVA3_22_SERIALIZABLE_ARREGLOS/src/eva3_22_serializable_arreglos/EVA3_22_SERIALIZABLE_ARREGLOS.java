/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_22_serializable_arreglos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class EVA3_22_SERIALIZABLE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Persona>miListaPerso = new ArrayList();
        miListaPerso.add(new Persona("Diego","Sandoval"));
        miListaPerso.add(new Persona("Pablo","Sandoval"));
        miListaPerso.add(new Persona("Atalo","Sandoval"));
        miListaPerso.add(new Persona("Pavel","Sandoval"));
        miListaPerso.add(new Persona("Lenin","Sandoval"));
    
        escribirObj(miListaPerso);
    
    }
      public static void escribirObj(Object obj){
            try {
            FileOutputStream abrirArch = new FileOutputStream("C:/ARCHIVOS PRACTICAS JAVA/prueeba1.txt");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch); 
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }    //leer objeto
    public static void leerObj(Object obj){
        try {
            FileInputStream abrirArch = new FileInputStream("C:/ARCHIVOS PRACTICAS JAVA/prueeba1.txt");
            ObjectInputStream leerObj = new ObjectInputStream(abrirArch);   
            ArrayList <Persona> miArrayList = (ArrayList<Persona>)leerObj.readObject();
            for(int i=0; i< miArrayList.size(); i++){
            Persona persona = miArrayList.get(i);
            System.out.println("Nombre" + persona.getNombre()+ " " + persona.getApellido());
            }
            leerObj.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
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