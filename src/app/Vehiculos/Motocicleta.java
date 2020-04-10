package app.Vehiculos;
import app.Moldes.VehiculoTerrestre;
/**
 * Motocicleta
 */
public class Motocicleta extends VehiculoTerrestre{
	
	private boolean tieneMaletero;
	private float potenciaMotor;

	
	@Override
	public String acelerar() {
		return "Girar hacia dentro la ca�a derecha del manillar MUY FUERTE";

	}

	
	@Override
	public String frenar() {
		return "Apretar el gatillo correspondiente a la rueda que quieras frenar";

	}

	
	/** 
	 * @return boolean
	 */
	public boolean isTieneMaletero() {
		return tieneMaletero;
	}

	
	/** 
	 * @param tieneMaletero
	 */
	public void setTieneMaletero(boolean tieneMaletero) {
		this.tieneMaletero = tieneMaletero;
	}

	
	/** 
	 * @return float
	 */
	public float getPotenciaMotor() {
		return potenciaMotor;
	}

	
	/** 
	 * @param potenciaMotor
	 */
	public void setPotenciaMotor(float potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	/**
     * Este metodo muestra un texto representando la accion de brincar de la moto
     * 
     * @return String texto reprepesentando la accion de brincar
     */
	public String brincar(){
		return "Salir volando al lanzarse por una cuesta";
	}
	
	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString()+"\t\tATRIBUTOS POR SER MOTO"
				+"\nPotencia Motor: " + potenciaMotor 
				+ "\nTiene Maletero: " + tieneMaletero 
				+ "\nMETODOS POR SER MOTO"
				+"\nLa moto puede: "+brincar()+"\n";
	}

	public Motocicleta(String matricula, String marca, String modelo, String color, float kilometros, int numPuertas,
			int numPlazas, boolean tieneMaletero, float potenciaMotor) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
		this.tieneMaletero = tieneMaletero;
		this.potenciaMotor = potenciaMotor;
	}

	public Motocicleta() {
		this.tieneMaletero = false;
		this.potenciaMotor = 0;
	}


	@Override
	public String circula() {		
		return "No puede salir a la autopista y hasta 60 km/h";
	}
	
}