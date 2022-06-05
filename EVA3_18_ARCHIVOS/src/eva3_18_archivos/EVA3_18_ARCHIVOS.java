/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class EVA3_18_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            FileInputStream archivo = new FileInputStream("C:/ARCHIVOS PRACTICAS JAVA/HOla.txt");
            int leer = archivo.read();
            do{
            System.out.print((char)leer);
            leer = archivo.read();
            }while(leer != -1);
           
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
    
        }
    }
}


/*
Apuntes:
Existen diferentes tipos de stream
en esta practica usaremos FileInputStream
*/