
 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_figuras;

/**
 *
 * @author yeyos
 */
public class EVA2_16_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Circulo circulo1 = new Circulo(23.00);
        Triangulo triangulo1 = new Triangulo(2.00,7.0);
        Rectangulo rectangulo1 = new Rectangulo(5.787978950, 2.13901);
        
        //System.out.println("Area: " + triangulo1.calcualarArea());
        imprimirArea(circulo1);
        imprimirArea(triangulo1);
        imprimirArea(rectangulo1);
        
        //claseObjetos(triangulo1);
    }
        public static void imprimirArea(Figura f){
        System.out.println("Area: " + f.calcualarArea());
       /* if(f instanceof Triangulo){
            System.out.println("Trianuglo");
        }else
                System.out.println("Otras");*/
       if (f instanceof Triangulo){
           System.out.println(f.getClass());   
       Triangulo triangulo1 = (Triangulo)f; // convertir una figura en tiangulo
       }
    }
        public static void claseObjetos(Object o){
            System.out.println(o.getClass());
        }
}

class Figura{
    public double calcualarArea(){
        return -1;
    }
    
}
class  Triangulo extends Figura{  
    private double altura;
    private double base; 

    public Triangulo() {
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcualarArea() {
        return (base* altura)/2;
    }
   
    
}   
class Circulo extends Figura{

   private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   
       @Override
    public double calcualarArea() {
        return (radio*radio*Math.PI);
        
    }
    
    
}   
class  Rectangulo extends Figura{
        private double altura;
    private double base; 

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcualarArea() {
        return (base* altura);
    }
    
    
}   