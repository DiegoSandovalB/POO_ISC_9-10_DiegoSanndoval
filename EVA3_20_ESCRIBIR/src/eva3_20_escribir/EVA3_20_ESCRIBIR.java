/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_20_escribir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



/**
 *
 * @author hp
 */
public class EVA3_20_ESCRIBIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path ruta = Paths.get("C:/ARCHIVOS PRACTICAS JAVA/HOla1.txt");
        OutputStream abrirArchivo;
        OutputStreamWriter escribirArchivo;
        BufferedWriter escribirTexto;
       
       try {
            abrirArchivo = Files.newOutputStream(ruta);
            escribirArchivo = new OutputStreamWriter(abrirArchivo);
            escribirTexto = new BufferedWriter (escribirArchivo);
            escribirTexto.write("Hola");
            escribirTexto.flush();
            escribirTexto.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
    }

}
