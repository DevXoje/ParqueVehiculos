package app.Vehiculos;

import app.Moldes.VehiculoTerrestre;

/**
 * Autobus Vehiculoterrestes implementado, con caracteristicas propias 
 * @author      Xoje Vilches
 * @version     1.0
 * @since       2020-05-05
 *
 */
public class Coche extends VehiculoTerrestre {

	private int numAirbags;
	private boolean tieneTechoSolar, tieneRadio;
	
	public Coche() {
		this.numAirbags = 0;
		this.tieneTechoSolar = false;
		this.tieneRadio = false;
	}


	public Coche(String matricula, String marca, String modelo, String color, float kilometros, int numPuertas,
			int numPlazas, int numAirbags, boolean tieneTechoSolar, boolean tieneRadio) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
		this.numAirbags = numAirbags;
		this.tieneTechoSolar = tieneTechoSolar;
		this.tieneRadio = tieneRadio;
	}	

	@Override
	public String acelerar() {
		return "Pisar pedal derecho";

	}
	
	@Override
	public String circula() {
		return "Por la derecha y hasta 120 km/h";
	}

	@Override
	public String frenar() {
		return "Pisar pedal izquierdo";

	}

	
	/** 
	 * @return int
	 */
	public int getNumAirbags() {
		return numAirbags;
	}

	/** 
	 * @return boolean
	 */
	public boolean isTieneRadio() {
		return tieneRadio;
	}

	/** 
	 * @return boolean
	 */
	public boolean isTieneTechoSolar() {
		return tieneTechoSolar;
	}

	
	/** 
	 * @param numAirbags
	 */
	public void setNumAirbags(int numAirbags) {
		this.numAirbags = numAirbags;
	}

	
	/** 
	 * @param tieneRadio
	 */
	public void setTieneRadio(boolean tieneRadio) {
		this.tieneRadio = tieneRadio;
	}

	
	/** 
	 * @param tieneTechoSolar
	 */
	public void setTieneTechoSolar(boolean tieneTechoSolar) {
		this.tieneTechoSolar = tieneTechoSolar;
	}

	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() +"\nATRIBUTOS POR SER COCHE"
				+"\nNumero de Airbags:" + numAirbags 
				+ "\nTener Radio: "+ tieneRadio 
				+ "\nTiene TechoSolar: "+ tieneTechoSolar+"\n";
	}

	/**
	 * Este metodo le reasigna el color al coche y le estable los km a 0
	 * 
	 * @param color Color que se establecera al coche
	 * @return String reporte de cambios
	 */
	public String tunear(String color) {
		String output = "";
		boolean cambiarColor, cambiarKilometros;

		cambiarColor = this.getColor() != color;
		cambiarKilometros = this.getKilometros() == 0;

		if (cambiarColor) {
			String colorAntiguo = this.getColor();
			this.setColor(color);
			output += "Le se ha cambiado el color de " + colorAntiguo + " a " + this.getColor() + "\n";
		}
		if (cambiarKilometros) {
			float kmAntiguo = this.getKilometros();
			this.setKilometros(0);
			output += "Le se ha cambiado establecido el kilometraje a " + this.getKilometros() + " teniendolo antes a "
					+ kmAntiguo + "\n";
		}
		if (!this.tieneTechoSolar) {
			output += "Le se ha añadido techo solar\n";
		}

		return output;
	}

	

}