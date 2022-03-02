/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_5_computadoras;

/**
 *
 * @author yeyos
 */
public class EVA_1_5_COMPUTADORAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora PC = new Computadora();
        PC.setMarca("Dell");
        PC.setProcesador("intel i5");
        PC.setVelocidadprocesador("2.9 GHz");
        PC.setAlmacenamiento("2 tb");
        PC.setGrafica("Nvidia 3050");
        PC.setPrecio(30000.00);
        PC.setRam(16);
        PC.imprimirDatos();
    }
    
}

class Computadora{
    private String marca;
    private String procesador;
    private String velocidadprocesador;
    private String grafica;
    private String almacenamiento;
    private double precio;
    private int ram;
    
    public String getMarca(){
       return marca; 
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public String getProcesador(){
        return procesador;
    }
    public void setProcesador(String valor){
        procesador = valor;
    }
    public String getVelocidadprocesador(){
       return velocidadprocesador; 
    }
    public void setVelocidadprocesador(String valor){
        velocidadprocesador = valor;
    }
    public String getGrafica(){
       return grafica; 
    }
    public void setGrafica(String valor){
       grafica = valor;
    }
    public String getAlmacenamiento(){
       return almacenamiento; 
    }
    public void setAlmacenamiento(String valor){
       almacenamiento = valor;
    }
    public double getPrecio(){
       return precio; 
    }
    public void setPrecio(double valor){
       precio = valor;
    }
    public double getRam(){
       return ram; 
    }
    public void setRam(int valor){
       ram = valor;
    }
    public void imprimirDatos(){
        System.out.println("Marca: "+ marca);
        System.out.println("Procesador: ");
        System.out.println("Velocidad de procesador" + velocidadprocesador);
        System.out.println("Ram: " + ram + "Gb");
        System.out.println("Grafica: " + grafica);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("Precio: $" + precio*1.16 + " incluye iva");
 }            
}

