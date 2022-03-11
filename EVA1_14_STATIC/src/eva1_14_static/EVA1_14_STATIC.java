/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_static;

/**
 *
 * @author yeyos
 */
public class EVA1_14_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*FormulasMatematicas misFormulas = new FormulasMatematicas();
        double area = misFormulas.CalcularAreCirculo(0);
        System.out.println("área del círculo: " + area);*/
        
        double area = FormulasMatematicas.CalcularAreaCirculo(10);
        System.out.println("área del círculo: " + area);
        double areaT = FormulasMatematicas.CalcularAreaTriangulo(5.0, 3.0);
        System.out.println("área del triangulo: " + areaT);
        FormulasMatematicas miObj = new FormulasMatematicas();
        miObj.ImprimirMensaje();
    }
    
}

class FormulasMatematicas{
    public static double CalcularAreaCirculo(double radio){
        double area;
        area = 3.1416 * radio * radio;
        return area;
      
    }
    public static double CalcularAreaTriangulo(double base, double altura){
        double areaT;
        areaT = base * altura/2.0;
        return areaT;
    }
    public void ImprimirMensaje(){
        System.out.print("Hola");
    }
}