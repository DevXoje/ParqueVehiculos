package app.Vehiculos;

import app.Moldes.VehiculoMaritimo;

/**
 * Yate VehiculoMaritimo implementado, con caracteristicas propias 
 * @author      Xoje Vilches
 * @version     1.0
 * @since       2020-05-05
 *
 */
public class Yate extends VehiculoMaritimo {


	private float metrosEslora;
	private int numMotores;
	private boolean tieneCocina;
	
	public Yate() {
		super();
		this.tieneCocina = false;
		this.numMotores = 0;
		this.metrosEslora = 0;
	}
	
	public Yate(String matricula, String marca, String modelo, String color, float kilometros, int numPuertas,int numPlazas,boolean tieneCocina, int numMotores, float metrosEslora) {
		super(matricula, marca, modelo, color, kilometros, numPuertas, numPlazas);
		this.tieneCocina = tieneCocina;
		this.numMotores = numMotores;
		this.metrosEslora = metrosEslora;
	}
	
	@Override
	public String acelerar() {
		
		return "Pisar el pedal derecho y mover la palanca hacia adelante";
	}
	@Override
	public String arrancar() {

		return zarpar()+" y meter la llave en el contacto";
	}
	/**
     * Este metodo muestra un texto representando la accion de zarpar del yate
     * 
     * @return String texto reprepesentando la accion de zarpar
     */
	public String atracar() {
		return frenar()+", quitar la llave del contacto y atar el amarre en el puerto";
	}
	@Override
	public String frenar() {
		return "Pisar el pedal izquierdo, mover la palanca hacia atras";
	}
	/**
	 * @return La variable metrosEslora devuelve 
	 */
	public float getMetrosEslora() {
		return metrosEslora;
	}
	/**
	 * @return La variable numMotores devuelve 
	 */
	public int getNumMotores() {
		return numMotores;
	}
	/**
	 * @return La variable tieneCocina devuelve 
	 */
	public boolean isTieneCocina() {
		return tieneCocina;
	}
	/**
	 * @param metrosEslora El parametro metrosEslora para almacenarlo en 
	 */
	public void setMetrosEslora(float metrosEslora) {
		this.metrosEslora = metrosEslora;
	}
	/**
	 * @param numMotores El parametro numMotores para almacenarlo en 
	 */
	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}
	/**
	 * @param tieneCocina El parametro tieneCocina para almacenarlo en 
	 */
	public void setTieneCocina(boolean tieneCocina) {
		this.tieneCocina = tieneCocina;
	}
	@Override
	public String toString() {
		return super.toString()+"ATRIBUTOS POR SER YATE"
				+"\nTener cocina: " + tieneCocina 
				+ "\nNumero de Motores: " + numMotores 
				+ "\nMetros de eslora: " + metrosEslora
				+ "\nMETODOS POR SER YATE"
				+"\nAtracar: "+atracar()
				+"\nZarpar: "+zarpar();
	}
	/**
     * Este metodo muestra un texto representando la accion de zarpar del yate
     * 
     * @return String texto reprepesentando la accion de zarpar
     */
	public String zarpar() {
		return "Quitar el amarre e ir al timon ";
	}
	
	
}