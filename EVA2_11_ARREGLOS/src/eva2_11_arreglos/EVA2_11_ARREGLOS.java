/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arreglos;

/**
 *
 * @author yeyos
 */
public class EVA2_11_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        */
        
        int[] arreglo = new int[10];
        //como las usamos?
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        arreglo[9] = 1000; //Ultima posición
        System.out.println("El valor de arreglo[0]= " + arreglo[0]);
        //arreglo[10] = 200; <--- Aqui nos pasamos del arreglo
        String[] arreCade = new String [10];
        arreCade[5] = "hola mundo";
        double[] arreDoble = new double[1000000000];
        arreDoble [999999999 ] = 0.2;
    }
    
}
