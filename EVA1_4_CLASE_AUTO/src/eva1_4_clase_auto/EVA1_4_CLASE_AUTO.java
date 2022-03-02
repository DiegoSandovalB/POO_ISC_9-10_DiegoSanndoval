/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_clase_auto;

/**
 *
 * @author yeyos
 */
public class EVA1_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Automovil auto1 = new Automovil();
        auto1.setMarca("Ford");
        auto1.setModelo("Raptor");
        auto1.setAño(2022);
        auto1.setTipo("Pick up");
        auto1.setPrecio(1790800.00);
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Año: " + auto1.getAño());
        System.out.println("Tipo de vehiculo: " + auto1.getTipo());
        System.out.println("Precio: $" + auto1.getPrecio() );
        
        Automovil auto2 = new Automovil();
        auto2.setMarca("Chevrolet");
        auto2.setModelo("Trail boss");
        auto2.setAño(2022);
        auto2.setTipo("Pick up");
        auto2.setPrecio(1890000.00);
        auto2.imprimirDatos();
    
   }
    
}

class Automovil{
    private String marca;
    private String modelo;
    private String tipo;
    private int año;
    private String color;
    private double precio;
    //Comportamiento
    //metodo set/get
    
   public void setMarca(String valor){
       marca = valor; 
   }
   public String getMarca(){
       return marca;
   }
   public void setModelo(String valor){
       modelo = valor;
   }
   public String getModelo(){
       return modelo;
   }   
   public void setTipo(String valor){
       tipo = valor;
   }
   public String getTipo(){
       return tipo;
   }
   public void setAño (int valor){
       año = valor;
   }
   public int getAño(){
       return año;
   }
   public void setColor(String valor){
       color = valor;
   }
   public String getColor(){
       return color;
   }
  public void setPrecio(double valor){
      precio = valor;
  }
  public double getPrecio(){
      return precio;
  }
  public void imprimirDatos(){
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Año: " + año);
    System.out.println("Tipo de vehiculo: " + tipo);
    System.out.println("Precio: $" + precio);
  }
 }