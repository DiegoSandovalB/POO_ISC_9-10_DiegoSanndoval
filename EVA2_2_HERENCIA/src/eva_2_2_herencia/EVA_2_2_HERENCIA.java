/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_2_herencia;

/**
 *
 * @author yeyos
 */
public class EVA_2_2_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Direccion dire = new Direccion("Revolución", 3442, "Revo", "0043", "Chihuahua", "Chiuahua", "2813918203");
        Estudiante Estu1 = new Estudiante("3443242", "Diego", 20, dire);
        Estu1.ImprimirDatos();
    }
    
}
class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;
    private String telefono;

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
        this.telefono = "";
    }
    
    
    
    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void ImprimirDireccion(){
        System.out.println("Calle: " + calle +  "#" + numero + "Colonia: " + colonia 
                  + cp + " en" + ciudad + "," + estado + "\n Telefono: " + telefono);
    }

}

class Estudiante extends Persona{
    
    private String NoDeCtrl;
    private Direccion direccion;  
           
    
    public Estudiante() {
        super();
        this.NoDeCtrl = "";  
        direccion = new Direccion();
    }

    public Estudiante(String NoDeCtrl, String nombre, int edad, Direccion direccion) {
        super(nombre, edad);
        this.NoDeCtrl = NoDeCtrl;
        this.direccion = direccion;
    }

    public String getNoDeCtrl() {
        return NoDeCtrl;
    }

    public void setNoDeCtrl(String NoDeCtrl) {
        this.NoDeCtrl = NoDeCtrl;
    }
    
    @Override
    public void ImprimirDatos(){
        super.ImprimirDatos();
        System.out.println("Numero de control: " + NoDeCtrl);
        direccion.ImprimirDireccion();
    }
    
}

class Persona{
    
    private String nombre;
    private int edad;
    
    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void ImprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
