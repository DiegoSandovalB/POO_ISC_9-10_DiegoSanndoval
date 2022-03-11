/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author yeyos
 */
public class EVA1_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner inputC = new Scanner(System.in);
        System.out.println("Intorduce los grados centigrados: ");
        double Celsius = inputC.nextDouble();
        double Fahrenheit = FormulasTemp.ConvertirCelsiusAFahrenheit(Celsius);
        double Kelvin = FormulasTemp.ConvertitCelsiusAKelvin(Celsius);
        System.out.println(Celsius + "°C es igual a: \n" + Fahrenheit + "°F \n" + Kelvin + "°K");
        Scanner inputF = new Scanner(System.in);
        System.out.println("Intorduce los grados fahrenheit: ");
        double Far = inputF.nextDouble();
        double Cel = FormulasTemp.ConvertirFahrenheitACelsius(Far);
        double Kel = FormulasTemp.ConvertirFahrenheitAKelvin(Far);
        System.out.println(Far + "°F es igual a: \n" + Cel + "°C \n" + Kel + "°K");
        Scanner inputK = new Scanner(System.in);
        System.out.println("Intorduce los grados Kelvin: ");
        double Ke= inputK.nextDouble();
        double Fa = FormulasTemp.ConvertirKelvinAFahrenheit(Ke);
        double Ce = FormulasTemp.ConvertirKelvinACelsius(Ke);
        System.out.println(Ke + "°K es igual a: \n" + Fa + "°F \n" + Ce + "°C");
    }
    
}

class FormulasTemp{
    
    public static double ConvertirCelsiusAFahrenheit(double temperaturaC){
       double F;
       F = 1.8 * temperaturaC + 32;
       return F;
    }
    public static double ConvertitCelsiusAKelvin (double temperaturaC){
        double K;
        K = temperaturaC + 273;
        return K;
    }
    public static double ConvertirFahrenheitACelsius (double temperaturaF){
        double C;
        C = (temperaturaF - 32) * (5.0/9.0);
        return C;
    }
    public static double ConvertirFahrenheitAKelvin (double temperaturaF){
        double K;
        K = (temperaturaF - 32) * (5.0/9.0) + 273;
        return K;
    }
    public static double ConvertirKelvinACelsius (double temperaturaK){
        double C;
        C = temperaturaK - 273;
        return C;
    }
    public static double ConvertirKelvinAFahrenheit (double temperaturaK){ 
        double F;
        F = (temperaturaK - 273) * (5.0/9.0) + 32;
        return F;
    }
}
