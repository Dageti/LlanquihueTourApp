package ui;

import javax.swing.JOptionPane;

import data.GestorEntidades;
import model.Vehiculo;
import model.ServicioTuristico;

public class VentanaGrafica {
	private final GestorEntidades gestor = new GestorEntidades();
	private JTextArea areaTexto;
	private JTextField campoMarca;
	private JTextField campoPatente;
	private JTextField campoCapacidad;

	public void iniciar() {
		String opcion;
		do {
			opcion = JOptionPane.showInputDialog(null, "=== LLANQUIHUE TOUR ===\n\n" +
							"1. Ingresar nuevo Vehículo\n" +
							"2. Ingresar nuevo Servicio Turístico\n" +
							"3. Mostrar Registro Completo (en consola)\n" +
							"4. Salir\n\n" +
							"Ingrese una opción:",
					"Menú Principal", JOptionPane.PLAIN_MESSAGE);
		} if (opcion != null) {
			switch (opcion) {
				case "1":
					ingresarVehiculo();
					break;
				case "2":
					ingresarServicioTuristico();
					break;
				case "3":
					gestor.mostrarEntidades();
					break;
			}
		}
	}
}


