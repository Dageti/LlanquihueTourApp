package ui;

import javax.swing.JOptionPane;

import data.GestorEntidades;
import model.Vehiculo;
import model.ServicioTuristico;

public class VentanaGrafica {
	private GestorEntidades gestor = new GestorEntidades();

	public void iniciar() {
		gestor.cargarDatosIniciales();
		String opcion;
		do {
			opcion = JOptionPane.showInputDialog(null,
					"====Llanquihue Tour====\n" +
							"1.- Ingresar un Vehículo\n" +
							"2.- Ingresar un Servicio Turístico\n" +
							"3.- Mostrar registro completo\n" +
							"4.- Salir\n",
					JOptionPane.PLAIN_MESSAGE);

			if (opcion != null) {
				switch (opcion) {
					case "1":
						ingresarVehiculo();
						break;
					case "2":
						ingresarServicioTuristico();
						break;
					case "3":
						JOptionPane.showMessageDialog(null, gestor.resumenEntidades(), "Registro General", JOptionPane.INFORMATION_MESSAGE);
						break;
					case "4":
						JOptionPane.showMessageDialog(null, "¡Bye!");
						System.exit(0);
						break;
					default:
						JOptionPane.showMessageDialog(null, "¡Ingrese una opción válida!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		} while (opcion != null);
	}

	private void ingresarVehiculo() {
		try {
			String marca = JOptionPane.showInputDialog(null, "Marca: ");
			String patente = JOptionPane.showInputDialog(null, "Patente: ");
			String capacidadStr = JOptionPane.showInputDialog(null, "Ingrese cuántos Kg de capacidad tiene el vehículo: ");
			double capacidad = Double.parseDouble(capacidadStr);
			Vehiculo newVehiculo = new Vehiculo(marca, patente, capacidad);
			gestor.agregarEntidad(newVehiculo);
			JOptionPane.showMessageDialog(null, "¡Vehículo agregado correctamente!", "", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error al ingresar el vehículo", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void ingresarServicioTuristico() {
		try {
			String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del servicio: ");
			String duracionStr = JOptionPane.showInputDialog(null, "Ingrese la duración del servicio (horas): ");
			double duracion = Double.parseDouble(duracionStr);

			ServicioTuristico newServicioTuristico = new ServicioTuristico(nombre, duracion);
			gestor.agregarEntidad(newServicioTuristico);
			JOptionPane.showMessageDialog(null, "¡Servicio agregado correctamente!", "", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error al ingresar el servicio", JOptionPane.ERROR_MESSAGE);
		}
	}
}

