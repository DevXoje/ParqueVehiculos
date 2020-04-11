package app;

import app.Vehiculos.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;



/**
 * Parque de creacion y gestion de Vehiculos
 * @author      Xoje Vilches
 * @version     1.0
 * @since       2020-05-05
 *
 */
public class Parque{

	static ArrayList<Vehiculo> megaConcesionario = new ArrayList<Vehiculo>();
	

	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		boolean seguir = true;
		do {
			String txtMenu = "1. Crear un coche (con o sin datos)\n2. Crear un autobús (con o sin datos)\n3. Crear una motocicleta (con o sin datos)\n4. Crear una avioneta (con o sin datos)\n5. Crear un yate (con o sin datos)\n6. Mostrar caracteristicas de todos los vehiculos del parque\n7. Salir del programa\n";
			int opc;
			try{
				opc = setNum(txtMenu);
			}catch(NullPointerException e) {
				opc=7;
			}
			Vehiculo vehiculoNuevo;

			String matriculaNueva, marcaNueva, modeloNuevo, colorNuevo;
			float kilometrosNuevos;
			int numPuertasNuevas, numPlazasNuevas;

			int numAirbagsNuevo;
			boolean tieneRadioNuevo, tieneTechoSolarNuevo;

			boolean esEscolarNuevo;
			String tipoRecorridoNuevo;

			boolean tieneMaleteroNuevo;
			float potenciaMotorNueva;

			String aeropuertoNuevo;
			float maxKgNuevo;

			boolean tieneCocinaNueva;
			int numMotoresNuevos;
			float metrosEsloraNuevos;
			
			boolean creacionCustom;
			switch (opc) {
				case 1:
					if (comprobarLimite()) {
						creacionCustom=isConCaracteristicas("Coche");
						if (creacionCustom) {
							matriculaNueva = setCadena("Introduzca la matricula");
							marcaNueva = setCadena("Introduzca la marca");
							modeloNuevo = setCadena("Introduzca el nombre del modelo");
							colorNuevo = setCadena("Introduzca el color");
							kilometrosNuevos = setNum("Introduzca los kilometros del cuentakilometros");
							numPuertasNuevas = setNum("Introduzca el numero de puertas");
							numPlazasNuevas = setNum("Introduzca el numero de plazas");
							numAirbagsNuevo = setNum("Introduzca la cantidad de airgabs");
							tieneRadioNuevo = setBooleano("¿Lo quiere con Radio?");
							tieneTechoSolarNuevo = setBooleano("¿Lo quiere con techo solar?");

							vehiculoNuevo = new Coche(matriculaNueva, marcaNueva, modeloNuevo, colorNuevo,
									kilometrosNuevos, numPuertasNuevas, numPlazasNuevas, numAirbagsNuevo,
									tieneTechoSolarNuevo, tieneRadioNuevo);
							
						} else {
							vehiculoNuevo = new Coche();
						}
						reporteCreacion(vehiculoNuevo ,creacionCustom);
						megaConcesionario.add(vehiculoNuevo);
					}

					break;
				case 2:
					if (comprobarLimite()) {
						creacionCustom=isConCaracteristicas("Autobus");
						if (creacionCustom) {
							matriculaNueva = setCadena("Introduzca la matricula");
							marcaNueva = setCadena("Introduzca la marca");
							modeloNuevo = setCadena("Introduzca el nombre del modelo");
							colorNuevo = setCadena("Introduzca el color");
							kilometrosNuevos = setNum("Introduzca los kilometros del cuentakilometros");
							numPuertasNuevas = setNum("Introduzca el numero de puertas");
							numPlazasNuevas = setNum("Introduzca el numero de plazas");
							esEscolarNuevo = setBooleano("¿Es autobus escolar?");
							tipoRecorridoNuevo = setCadena("Introzca el tipo de recorrido");

							vehiculoNuevo = new Autobus(matriculaNueva, marcaNueva, modeloNuevo, colorNuevo,
									kilometrosNuevos, numPuertasNuevas, numPlazasNuevas, esEscolarNuevo,
									tipoRecorridoNuevo);
						} else {
							vehiculoNuevo = new Autobus();
						}
						reporteCreacion(vehiculoNuevo ,creacionCustom);
						megaConcesionario.add(vehiculoNuevo);
					}

					break;
				case 3:
					if (comprobarLimite()) {
						creacionCustom=isConCaracteristicas("Motocicleta");
						if (creacionCustom) {
							matriculaNueva = setCadena("Introduzca la matricula");
							marcaNueva = setCadena("Introduzca la marca");
							modeloNuevo = setCadena("Introduzca el nombre del modelo");
							colorNuevo = setCadena("Introduzca el color");
							kilometrosNuevos = setNum("Introduzca los kilometros del cuentakilometros");
							numPuertasNuevas = setNum("Introduzca el numero de puertas");
							numPlazasNuevas = setNum("Introduzca el numero de plazas");
							potenciaMotorNueva = setNumDecimal("Introduzca la potencia del motor");
							tieneMaleteroNuevo = setBooleano("¿Quiere maletero en la moto?");

							vehiculoNuevo = new Motocicleta(matriculaNueva, marcaNueva, modeloNuevo, colorNuevo,
									kilometrosNuevos, numPuertasNuevas, numPlazasNuevas, tieneMaleteroNuevo,
									potenciaMotorNueva);
						} else {
							vehiculoNuevo = new Motocicleta();
						}
						reporteCreacion(vehiculoNuevo ,creacionCustom);
						megaConcesionario.add(vehiculoNuevo);
					}
					break;
				case 4:
					if (comprobarLimite()) {
						creacionCustom=isConCaracteristicas("Avioneta");
						if (creacionCustom) {
							matriculaNueva = setCadena("Introduzca la matricula");
							marcaNueva = setCadena("Introduzca la marca");
							modeloNuevo = setCadena("Introduzca el nombre del modelo");
							colorNuevo = setCadena("Introduzca el color");
							kilometrosNuevos = setNum("Introduzca los kilometros del cuentakilometros");
							numPuertasNuevas = setNum("Introduzca el numero de puertas");
							numPlazasNuevas = setNum("Introduzca el numero de plazas");
							aeropuertoNuevo = setCadena("Introduzca el aeropuerto del avion");
							maxKgNuevo = setNumDecimal("Introduzca el peso maximo de carga");

							vehiculoNuevo = new Avioneta(matriculaNueva, marcaNueva, modeloNuevo, colorNuevo,
									kilometrosNuevos, numPuertasNuevas, numPlazasNuevas, aeropuertoNuevo, maxKgNuevo);
						} else {
							vehiculoNuevo = new Avioneta();
						}
						reporteCreacion(vehiculoNuevo ,creacionCustom);
						megaConcesionario.add(vehiculoNuevo);
					}

					break;
				case 5:
					if (comprobarLimite()) {
						creacionCustom=isConCaracteristicas("Yate");
						if (creacionCustom) {
							matriculaNueva = setCadena("Introduzca la matricula");
							marcaNueva = setCadena("Introduzca la marca");
							modeloNuevo = setCadena("Introduzca el nombre del modelo");
							colorNuevo = setCadena("Introduzca el color");
							kilometrosNuevos = setNum("Introduzca los kilometros del cuentakilometros");
							numPuertasNuevas = setNum("Introduzca el numero de puertas");
							numPlazasNuevas = setNum("Introduzca el numero de plazas");

							tieneCocinaNueva = setBooleano("¿Quiere cocina en el Yate?");
							numMotoresNuevos = setNum("¿Cuantos motores quiere en el motor?");
							metrosEsloraNuevos = setNumDecimal("¿Cuantos metros de eslora desea?");
							vehiculoNuevo = new Yate(matriculaNueva, marcaNueva, modeloNuevo, colorNuevo,
									kilometrosNuevos, numPuertasNuevas, numPlazasNuevas, tieneCocinaNueva,
									numMotoresNuevos, metrosEsloraNuevos);
						} else {
							vehiculoNuevo = new Yate();
						}
						reporteCreacion(vehiculoNuevo ,creacionCustom);
						megaConcesionario.add(vehiculoNuevo);
					}
					break;
				case 6:
					getVehiculos(megaConcesionario);
					break;
				case 7:
					seguir = false;
					break;				

				default:
					System.out.println("Opcion no contemplada");
					break;
			}
		} while (seguir);

		despedida();
	}

	

	/**
	 * Este metodo muestra un texto al usuario, recoje su mensaje del usuario y lo
	 * convierte a int
	 * 
	 * @param output Este mensaje se le mostrara al usuario
	 * @return int valor capturado del usuario
	 */
	private static int setNum(String output) {
		String input = setCadena(output);
		int num;
		try {
			num = Integer.parseInt(input);
		} catch (Exception e) {
			num = setNum("Numero no valido.\nIntentelo de nuevo");
		}
		if (num < 1) {
			num = setNum("Numeros negativos no validos.\nIntentelo de nuevo");
		}
		return num;
	}

	/**
	 * Este metodo muestra un texto al usuario, recoje su mensaje del usuario
	 * 
	 * @param output Este mensaje se le mostrara al usuario
	 * @return String valor capturado del usuario
	 */
	private static String setCadena(String output) {

		String cadena;
		do {
			cadena = JOptionPane.showInputDialog(null, output, "Datos", JOptionPane.QUESTION_MESSAGE);

			if (cadena.equals("")) {
				JOptionPane.showMessageDialog(null, "No has introducido nada");
			}
		} while (cadena.equals(""));
		return cadena;
	}

	/**
	 * Este metodo muestra un texto al usuario, recoje su mensaje del usuario y lo
	 * convierte a float
	 * 
	 * @param output Este mensaje se le mostrara al usuario
	 * @return float valor capturado del usuario
	 */
	private static float setNumDecimal(String output) {
		String input = setCadena(output);
		float num;
		try {
			num = Integer.parseInt(input);
		} catch (Exception e) {
			num = setNumDecimal("Numero no valido.\nIntentelo de nuevo");
		}
		if (num < 1) {
			num = setNumDecimal("Numeros negativos no validos.\nIntentelo de nuevo");
		}
		return num;
	}

	/**
	 * Este metodo muestra un texto al usuario, recoje opcion boolean
	 * 
	 * @param output Este mensaje se le mostrara al usuario
	 * @return boolean opcion elegida por el usuario
	 */
	private static boolean setBooleano(String output) {
		int intput = JOptionPane.showConfirmDialog(null, output, "SI O NO", JOptionPane.YES_NO_OPTION);
		boolean ser = false;
		switch (intput) {
			case JOptionPane.YES_OPTION:
				ser = true;
				break;
			case JOptionPane.NO_OPTION:
				ser = false;
				break;
			default:
				System.out.println("Opcion no contemplada");
				break;
		}
		return ser;
	}

	/**
	 * Este metodo muestra un texto especifico al usuario, recoje opcion boolean
	 * 
	 * @return boolean opcion elegida por el usuario
	 */	
	private static boolean isConCaracteristicas(String nombreVehiculo) {
		boolean ser = setBooleano(
				"¿Desea el diseñar el vehiculo: "+nombreVehiculo+" paso a paso?");
	
		return ser;
	}

	/**
	 * Este metodo muestra las caracteristicas de los vehiculos de dentro de una
	 * coleccion
	 * 
	 * @param concesionario Coleccion de vehiculos
	 */
	private static void getVehiculos(ArrayList<Vehiculo> concesionario) {
		if(concesionario.isEmpty()) {
			JOptionPane.showMessageDialog(null,"El concesionario esta vacio","Vacio",JOptionPane.ERROR_MESSAGE);
		}else {
			for (Vehiculo vehiculoOutput : concesionario) {
				JOptionPane.showMessageDialog(null, vehiculoOutput, vehiculoOutput.getClass().getSimpleName(),
						JOptionPane.INFORMATION_MESSAGE);
			}
		}	
	}

	/**
	 * Este metodo muestra un texto al usuario, recoje opcion boolean
	 * 
	 * @return boolean comprueba si se revasa el limite de vehiculos
	 */
	private static boolean comprobarLimite() {

		if (Vehiculo.numVehiculos < Vehiculo.maxVehiculos) {
			JOptionPane.showMessageDialog(null,"Capacidad Total: "+Vehiculo.maxVehiculos
			+"\nVehiculos Antes de la Nueva Creacion: "+Vehiculo.numVehiculos);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "No se pueden crear más coches, límite alcanzado");
			return false;
		}
	}
	/**
	 * Emite un notificacion basica para informar al usuario de la creacion del vehiculo
	 */
	private static void reporteCreacion(Vehiculo v, boolean con) {
		String tipoCreacion=(con)?"personalizados":"por defecto";
		JOptionPane.showMessageDialog(null, "El "+v.getClass().getSimpleName()+" ha sido creado con lo atriburos "+tipoCreacion+".\nY posteriormente añadido al parque");
	}
	/**
	 * Emite el mensaje de despedida del Paque
	 */
	private static void despedida() {
		JOptionPane.showMessageDialog(null, "Gracias por usar nuestro Parque.\n\nCierre del programa ...");
	}

}