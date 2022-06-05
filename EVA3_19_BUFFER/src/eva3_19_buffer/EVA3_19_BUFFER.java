    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_19_buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class EVA3_19_BUFFER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*1*/ Path ruta = Paths.get("C:/ARCHIVOS PRACTICAS JAVA/HOla.txt");
       /*2*/ InputStream abrirArchivo;
       /*3*/ InputStreamReader leerArchivo;
       /*4*/ BufferedReader leerTexto;
       
        try {
            abrirArchivo = Files.newInputStream(ruta);
            leerArchivo = new InputStreamReader(abrirArchivo);
            leerTexto = new BufferedReader(leerArchivo);
            String linea = leerTexto.readLine();
            while(linea != null){
                System.out.println(linea);
                linea= leerTexto.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
/*
1.- Definimos la ruta
2.- Abrimos el archivo
3.- Leemos el archivo
4.- Convertimos bytes a caracteres
*/