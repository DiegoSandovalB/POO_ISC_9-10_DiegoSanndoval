/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_herencia3;

/**
 *
 * @author yeyos
 */
public class EVA2_3_HERENCIA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* Animal animal = new Animal();
        animal.Mover();
        Vertebrado verte = new Vertebrado();
        verte.tenerEsqueleto();
        Mamiferos mamifero = new Mamiferos();
        mamifero.tenerPelo();
        Primates primates = new Primates();
        primates.agarrarObjetos();*/
        Humanos humano = new Humanos();
        humano.pensar();
    }
    
}
class Humanos extends Primates{
    public Humanos(){
        System.out.println("Humanos");
    }
    public void pensar(){
        System.out.println("Pensar");
    }
}
class Primates extends Mamiferos{
    public Primates(){
        System.out.println("Primates");
    }
    public void agarrarObjetos(){
        System.out.println("Sujetar objetos");
        }
}
class Mamiferos extends Vertebrado{
    public Mamiferos(){
        super();
        System.out.println("Mamifero");
        }
        public void tenerPelo(){
        System.out.println("tiene pelo");
        }
    }
class Vertebrado extends Animal{
    public Vertebrado(){
        super();
        System.out.println("Vertebrado");
    }
    public void tenerEsqueleto(){
        System.out.println("Vertebrado: tiene esqueleto");  
    }
    
}
class Animal{
    
    public Animal(){
        System.out.println("Animal");
    }
    public void Mover(){
        System.out.println("Mover ");
    }
}