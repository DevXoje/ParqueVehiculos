package app;

/**
 * Datos basicos de cualquier Vehiculo
 * @author      Xoje Vilches
 * @version     1.0
 * @since       2020-05-05
 *
 */
public abstract class Vehiculo {

    public static final int maxVehiculos = 5;
    public static int numVehiculos;
    /**
     * Para usar una matricula aleatoria por defecto
     * 
     * @return matricula generada con Math.Random
     */
    private static String matAleatoria() {
        int numRandom;
        int max = 9, min = 0;
        String matricula = "";
        int range = (max - min) + 1;

        for (int i = 0; i < 5; i++) {
            numRandom = (int) (Math.random() * range) + min;
            matricula += numRandom;
        }
        return matricula;
    }
    private float kilometros;
    private String matricula, marca, modelo, color;

    private int numPuertas, numPlazas;

    public Vehiculo() {
        this.matricula = matAleatoria();
        this.marca = "SEAT";
        this.modelo = "Altea";
        this.color = "Blanco";
        this.kilometros = 0;
        this.numPuertas = 3;
        this.numPlazas = 5;
        numVehiculos++;
    }

    public Vehiculo(String matricula, String marca, String modelo, String color, float kilometros, int numPuertas,
            int numPlazas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometros = kilometros;
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
        numVehiculos++;
    }

    /**
     * Este metodo muestra un texto representando la accion de acelerar del vehiculo
     * 
     * @return String texto reprepesentando la accion de arrancar
     */
    abstract public String acelerar();

    
    /**
     * Este metodo muestra un texto representando la accion de arracancar del
     * vehiculo
     * 
     * @return String texto reprepesentando la accion de arrancar
     */
    abstract public String arrancar();

    
    /** 
     * @return String
     */
    /**
     * Este metodo muestra un texto representando la accion de frenar del vehiculo
     * 
     * @return String texto reprepesentando la accion de arrancar
     */
    abstract public String frenar();

    
    /** 
     * @return String
     */
    public String getColor() {
        return color;
    }

    
    /** 
     * @return float
     */
    public float getKilometros() {
        return kilometros;
    }

    
    /** 
     * @return String
     */
    public String getMarca() {
        return marca;
    }

    
    /** 
     * @return String
     */
    public String getMatricula() {
        return matricula;
    }

    
    /** 
     * @return String
     */
    public String getModelo() {
        return modelo;
    }

    
    /** 
     * @return int
     */
    public int getNumPlazas() {
        return numPlazas;
    }

    
    /** 
     * @return int
     */
    public int getNumPuertas() {
        return numPuertas;
    }

    
    /** 
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    
    /** 
     * @param kilometros
     */
    public void setKilometros(float kilometros) {
        this.kilometros = kilometros;
    }

    
    /** 
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    /** 
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    /** 
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    /** 
     * @param numPlazas
     */
    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    
    /** 
     * @param numPuertas
     */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    
    /** 
     * @return String
     */
    public String toString() {
        String output;

        output = "\nATRIBUTOS POR SER VEHICULO\n"
        		+"\nTipo de Vehiculo: " + this.getClass().getSimpleName()
                + "\nMatricula: " + this.matricula 
                + "\nMarca: " + this.marca 
                + "\nModelo: " + this.modelo 
                + "\nColor: "+ this.color 
                + "\nCuentakilometros: " + this.kilometros+" Km" 
                + "\nNumero de puertas: " + this.numPuertas
                + "\nNumero de plazas: " + this.numPlazas+"\n" 
                + "\nMETODOS POR SER VEHICULO\n"+
                "\nSu forma de arrancar: " + this.arrancar()
                + "\nSu forma de acelerar: " + this.acelerar() 
                + "\nSu forma de frenar: " + this.frenar() + "\n";

        return output;
    }
}