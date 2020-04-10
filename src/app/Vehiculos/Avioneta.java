package app.Vehiculos;

import app.Moldes.VehiculoAereo;

/**
 * Avioneta VehiculoAereo implementado con caracteristicas propias 
 * @author      Xoje Vilches
 * @version     1.0
 * @since       2020-05-05
 *
 */
public class Avioneta extends VehiculoAereo {

	private String aeropuerto;
	private float maxKg;

	
	public Avioneta() {
		this.aeropuerto = "Raro";
		this.maxKg = 0;
	}

	
	public Avioneta(String matricula, String marca, String modelo, String color, float kilometros, int numPuertas,
			int numPlazas, String aeropuerto, float maxKg) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
		this.aeropuerto = aeropuerto;
		this.maxKg = maxKg;
	}

	
	@Override
	public String acelerar() {
		return "Dandole al boton de nitro";
	}

	@Override
	public String arrancar() {
		return "Girando a mano las aspas delanteras";
	}

	
	/**
     * Este metodo muestra un texto representando la accion de aterrrizar del avion
     * 
     * @return String texto reprepesentando la accion de aterrizar
     */
	public String aterrizar() {
		return "Flotando en el amazonas para recoger a Indiana Jones";
	}

	
	/**
     * Este metodo muestra un texto representando la accion de despegar del avion
     * 
     * @return String texto reprepesentando la accion de despegar
     */
	public String despegar() {
		return "Entre flexas e insultos nazis por recoger a Indiana Jones";
	}

	@Override
	public String frenar() {
		return "Pulsando el boton de Eject";
	}

	/** 
	 * @return String
	 */
	public String getAeropuerto() {
		return aeropuerto;
	}

	/** 
	 * @return float
	 */
	public float getMaxKg() {
		return maxKg;
	}

	
	/** 
	 * @param aeropuerto
	 */
	public void setAeropuerto(String aeropuerto) {
		this.aeropuerto = aeropuerto;
	}
	/** 
	 * @param maxKg
	 */
	public void setMaxKg(float maxKg) {
		this.maxKg = maxKg;
	}
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + "Aeropuerto: " + aeropuerto + "\nCarga Maxima: " + maxKg + " kg\nForma de despegar: "
				+ despegar() + "\nForma de aterrizar " + aterrizar() + "\n";
	}

}