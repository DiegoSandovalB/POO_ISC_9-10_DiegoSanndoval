/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_stack_overflow;

/**
 *
 * @author yeyos
 */
public class EVA3_1_STACK_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static int c= 0;
    public static void main(String[] args) {
        
        int x= 10;
        terminarStack();
        
    }
    public static void terminarStack(){
    terminarStack();
    c = c+ 1;
        System.out.println(c);
}
}
       

       