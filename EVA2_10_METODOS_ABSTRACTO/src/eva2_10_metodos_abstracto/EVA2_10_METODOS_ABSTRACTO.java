/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_metodos_abstracto;

/**
 *
 * @author yeyos
 */
public class EVA2_10_METODOS_ABSTRACTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
 
}

class ImplementaAbstracto extends ClaseAbstracta{
    
    @Override
    public void metodoAbstracto(){
        
    }
}
 abstract class ClaseAbstracta{
    public void metodoImplementado(){
        System.out.println("Metodo implementado");
}
   public abstract  void metodoAbstracto();
}