/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_vehiculos;

/**
 *
 * @author yeyos
 */
public class EVA2_4_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motocicletas moto1 = new Motocicletas("Deportiva", "Ducati", "X-03", "Gasolina", 2020, 2, 6, 2, 12.4);
        moto1.imprimirDatos();
        Camion camion1 = new Camion(4, 35, "international", "3192083AB", "disel", 2017, 2, 12, 8, 100);
        camion1.imprimirDatos();
    }
    
}
class Camion extends Camioneta{
    int númeroDeEjes;

    public Camion() {
    }
    
    public Camion(int númeroDeEjes, int capacidadDeCarga, String marca, String modelo, String tipoCombustible, int año, int pasajeros, int cilindraje, int numeroLLantas, double capacidadMotor) {
        super(capacidadDeCarga, marca, modelo, tipoCombustible, año, pasajeros, cilindraje, numeroLLantas, capacidadMotor);
        this.númeroDeEjes = númeroDeEjes;
        System.out.println("Número de ejes: " + this.númeroDeEjes);
    }

    public int getNúmeroDeEjes() {
        return númeroDeEjes;
    }

    public void setNúmeroDeEjes(int númeroDeEjes) {
        this.númeroDeEjes = númeroDeEjes;
    }
    
    
}
class Camioneta extends vehiculo{
    int capacidadDeCarga;

    public Camioneta() {
    }
    
    public Camioneta(int capacidadDeCarga, String marca, String modelo, String tipoCombustible, int año, int pasajeros, int cilindraje, int numeroLLantas, double capacidadMotor) {
        super(marca, modelo, tipoCombustible, año, pasajeros, cilindraje, numeroLLantas, capacidadMotor);
        this.capacidadDeCarga = capacidadDeCarga;
        System.out.println("Capacidad de carga: " + capacidadDeCarga + "Toneladas");
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }
    
    
}
class Automoviles extends vehiculo{
    private String tipoDeVehiculo;
    private String equipamiento;
    private String transmisión;

    public Automoviles() {
    }
    
    
    public Automoviles(String tipoDeVehiculo, String equipamiento, String transmisión, String marca, String modelo, String tipoCombustible, int año, int pasajeros, int cilindraje, int numeroLLantas, double capacidadMotor) {
        super(marca, modelo, tipoCombustible, año, pasajeros, cilindraje, numeroLLantas, capacidadMotor);
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.equipamiento = equipamiento;
        this.transmisión = transmisión;
        System.out.println("Tipo der vehiculo: " + tipoDeVehiculo);
        System.out.println("Equipamiento: " + equipamiento);
        System.out.println("Transmisión: " + transmisión);
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getTransmisión() {
        return transmisión;
    }

    public void setTransmisión(String transmisión) {
        this.transmisión = transmisión;
    }
    
    
}
class Motocicletas extends vehiculo{
    private String tiposDeMotos;

    public Motocicletas() {
        super();
    }

    public Motocicletas(String tiposDeMotos, String marca, String modelo, String tipoCombustible, int año, int pasajeros, int cilindraje, int numeroLLantas, double capacidadMotor) {
        super(marca, modelo, tipoCombustible, año, pasajeros, cilindraje, numeroLLantas, capacidadMotor);
        this.tiposDeMotos = tiposDeMotos;
        System.out.println("Tipo de moto: " + tiposDeMotos);
    }

    public String getTiposDeMotos() {
        return tiposDeMotos;
    }

    public void setTiposDeMotos(String tiposDeMotos) {
        this.tiposDeMotos = tiposDeMotos;
    }
}
class vehiculo{
   private String marca;
   private  String modelo;
   private String tipoCombustible;
   private int año;
   private int pasajeros;
   private  int cilindraje;
   private int numeroLLantas;
   private double capacidadMotor;

    public vehiculo() {
    }
    
    

    public vehiculo(String marca, String modelo, String tipoCombustible, int año, int pasajeros, int cilindraje, int numeroLLantas, double capacidadMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.año = año;
        this.pasajeros = pasajeros;
        this.cilindraje = cilindraje;
        this.numeroLLantas = numeroLLantas;
        this.capacidadMotor = capacidadMotor;
    }

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

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getNumeroLLantas() {
        return numeroLLantas;
    }

    public void setNumeroLLantas(int numeroLLantas) {
        this.numeroLLantas = numeroLLantas;
    }

    public double getCapacidadMotor() {
        return capacidadMotor;
    }

    public void setCapacidadMotor(double capacidadMotor) {
        this.capacidadMotor = capacidadMotor;
    }
    
    public void imprimirDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Pasajeros: " + pasajeros);
        System.out.println("Tipo de combutible: " + tipoCombustible);
        System.out.println("Numero de llantas: " + numeroLLantas);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Capacidad de motor: " + capacidadMotor + " L");
    }
}