package app.Vehiculos;
import app.Moldes.VehiculoTerrestre;
/**
 * Autobus Vehiculoterrestes implementado, con caracteristicas propias 
 * @author      Xoje Vilches
 * @version     1.0
 * @since       2020-05-05
 *
 */
public class Autobus extends VehiculoTerrestre{

	private boolean esEscolar;
	private String tipoRecorrido;

	
	public Autobus() {
		this.esEscolar = false;
		this.tipoRecorrido = "Raro";
	}

	
	public Autobus(String matricula, String marca, String modelo, String color, float kilometros, int numPuertas,
			int numPlazas, boolean esEscolar, String tipoRecorrido) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
		this.esEscolar = esEscolar;
		this.tipoRecorrido = tipoRecorrido;
	}

	
	/**
     * Este metodo muestra un texto representando la accion de abrir puertas del autobus
     * 
     * @return String texto reprepesentando la accion de abrir puertas
     */
	public String abrirPuertas(){
		return "abrir las puertas para que suban o bajen pasajeros";
	}

	@Override
	public String acelerar() {
		return "Pisar pedal derecho MUY FUERTE";

	}
	
	@Override
	public String circula() {
		return "Puede salir salir por la autopista y hasta 80 km/h";
	}

	@Override
	public String frenar() {
		return "Pisar pedal izquierdo MUY FUERTE";

	}

	/** 
	 * @return String
	 */
	public String getTipoRecorrido() {
		return tipoRecorrido;
	}

	/** 
	 * @return boolean
	 */
	public boolean isEsEscolar() {
		return esEscolar;
	}
	/** 
	 * @param esEscolar
	 */
	public void setEsEscolar(boolean esEscolar) {
		this.esEscolar = esEscolar;
	}
	
	/** 
	 * @param tipoRecorrido
	 */
	public void setTipoRecorrido(String tipoRecorrido) {
		this.tipoRecorrido = tipoRecorrido;
	}


	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString()+"\nATRIBUTOS POR SER AUTOBUS"
				+"\nAutobus Escolar: " + esEscolar 
				+ "\nTipo de Recorrido: " + tipoRecorrido 
				+ "\n\nMETODOS POR SER AUTOBUS"
				+"\nEl autobus puede: "+abrirPuertas()+"\n";
	}
	
	
}