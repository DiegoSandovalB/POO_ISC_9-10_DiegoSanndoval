/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_sobrecarga;

/**
 *
 * @author yeyos
 */
public class EVA1_18_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HOlA MUNDO!!");
        Prueba obj = new Prueba();
        System.out.println(obj);
        System.out.println(100);
        System.out.println("Calcular el area de un rectangulo de 15 x 20 :" + calcularArea(20,15));
        System.out.println("Calcular el area de un trianguilo :" + calcularArea(20.0,15.0,1));
        System.out.println("Calcular el area de un circulo :" + calcularArea(100));
        System.out.println("Calcular el area de un circulo :" + calcularArea(100.00));
        
    }
   public static double calcularArea(double base, double altura){
       return base * altura; 
   } 
   public static double calcularArea(double largo, double ancho, int esTriangulo){
       return (largo * ancho)/2; 
   } 
   public static double calcularArea(int esTriangulo, double largo, double ancho){
       return (largo * ancho)/2; 
   } 
   public static double calcularArea(double radio){
       System.out.println("double");
       return Math.PI * Math.pow(radio, 2); 
   } 
   public static double calcularArea(int radio){
       System.out.println("entero");
       return Math.PI * Math.pow(radio, 2); 
   } 
}

class Prueba{
    
}