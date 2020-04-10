package app.Moldes;
import app.Acciones.Aereo;
import app.Vehiculo;
/**
 * VehiculoAero hace de molde para Clases que quieran ser Vehiculo y Aereo
 * @author      Xoje Vilches
 * @version     1.0
 * @since       2020-05-05
 *
 */
public abstract class VehiculoAereo extends Vehiculo implements Aereo{
	/**
     * Este metodo muestra un texto representando la accion de volar del vehiculo aero
     * 
     * @return String texto reprepesentando la accion de volar
     */
	public String volar(){
		return "Haciendo piruetas\n";
	}	public String toString(){
		return super.toString()+"Forma de Volar: "+this.volar()+"\n";
	}

	public VehiculoAereo() {
		super();
	}

	public VehiculoAereo(String matricula, String marca, String modelo, String color, float kilometros, int numPuertas,
			int numPlazas) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
	}}