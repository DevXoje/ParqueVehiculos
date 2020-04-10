package app.Moldes;
import app.Acciones.Maritimo;
import app.Vehiculo;
/**
 * VehiculoAero hace de molde para Clases que quieran ser Vehiculo y Maritimas
 * @author      Xoje Vilches
 * @version     1.0
 * @since       2020-05-05
 *
 */
public abstract class VehiculoMaritimo extends Vehiculo implements Maritimo {
	public VehiculoMaritimo() {
		super();
	}
	
	public VehiculoMaritimo(String matricula, String marca, String modelo, String color, float kilometros,
			int numPuertas, int numPlazas) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
	}	
	/**
     * Este metodo muestra un texto representando la accion de navegar del vehiculo maritimo
     * 
     * @return String texto reprepesentando la accion de navegar
     */
	public String navegar(){
		return "Lejos de la playa y en el puerto\n";
	}	
	
	public String toString(){
		return super.toString()+"Forma de Navegacion: "+this.navegar()+"\n";
	}}