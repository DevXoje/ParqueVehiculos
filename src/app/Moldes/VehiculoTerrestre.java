package app.Moldes;
import app.Acciones.Terrestre;
import app.Vehiculo;
/**
 * VehiculoTerreste
 */
public abstract class VehiculoTerrestre extends Vehiculo implements Terrestre{

	
	
	/** 
	 * @return String
	 */
	@Override
	public String arrancar() {
		return "Llave en el contacto y "+acelerar();
	}
	
	/**
     * Este metodo muestra un texto representando la accion de aparcar del vehiculo terreste
     * 
     * @return String texto reprepesentando la accion de aparcar
     */
	public String aparcar(){
		return "Vehiculo ha sido estacionado en aparcamiento";
	}
	
	/** 
	 * @return String
	 */
	public String toString(){
		return super.toString()+"\t\tMETODOS POR SER VEHICULO\nArrancar: "+this.arrancar()+"\nCircular: "+this.circula()+"\nAparcar: "+this.aparcar()+"\n\t\tMETODOS POR SER TERRESTRE\nForma de Circulacion: "+this.circula()+"\nForma de Aparcar: "+aparcar()+"\n";
	}

	public VehiculoTerrestre(String matricula, String marca, String modelo, String color, float kilometros,
			int numPuertas, int numPlazas) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
	}

	public VehiculoTerrestre() {
		super();
	}}