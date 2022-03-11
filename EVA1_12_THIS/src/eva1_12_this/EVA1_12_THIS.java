/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_this;

/**
 *
 * @author yeyos
 */
public class EVA1_12_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Automovil carro1 = new Automovil();
        carro1.setAño(2022);
        System.out.println("Año: " + carro1.getAño());
    }
    
}
class Automovil{
    private String marca;
    private String modelo;
    private String tipo;
    private int año;
    private String color;
    private double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
