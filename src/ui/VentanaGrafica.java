package ui;

import data.GestorEntidades;
import model.ServicioTuristico;
import model.Vehiculo;

import javax.swing.*;
import java.awt.*;

/**
 * Clase encargada del UI, delega la lógica a GestorEntidades.
 */

public class VentanaGrafica {

	private GestorEntidades gestor = new GestorEntidades();
	private JFrame ventana;
	private JTextArea areaTexto;

	public void iniciar() {
		gestor.cargarDatosIniciales();

		ventana = new JFrame("Llanquihue Tour - Panel de Administración");
		ventana.setSize(650, 450);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(new BorderLayout(10, 10));


		JPanel panelBotones = new JPanel();

		JButton btnVehiculo = new JButton("Agregar Vehículo");
		JButton btnServicio = new JButton("Agregar Servicio");
		JButton btnMostrar = new JButton("Mostrar Registro Completo");
		JButton btnSalir = new JButton("Salir");

		panelBotones.add(btnVehiculo);
		panelBotones.add(btnServicio);
		panelBotones.add(btnMostrar);
		panelBotones.add(btnSalir);

		areaTexto = new JTextArea();
		areaTexto.setEditable(false);
		areaTexto.setFont(new Font("Arial", Font.PLAIN, 13));
		JScrollPane scrollPane = new JScrollPane(areaTexto);

		scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		btnVehiculo.addActionListener(e -> agregarVehiculo());
		btnServicio.addActionListener(e -> agregarServicio());
		btnMostrar.addActionListener(e -> areaTexto.setText(gestor.resumenEntidades()));
		btnSalir.addActionListener(e -> System.exit(0));


		ventana.add(panelBotones, BorderLayout.NORTH);
		ventana.add(scrollPane, BorderLayout.CENTER);

		areaTexto.setText("==================== Sistema de gestión Llanquihue Tour! ===================\n\n" +
				"Selecciona una opción en el menú superior para comenzar.");

		ventana.setVisible(true);
	}

	private void agregarVehiculo() {
		try {
			String marca = JOptionPane.showInputDialog(ventana, "Ingrese la marca del vehículo:");
			if (marca == null) return;

			String patente = JOptionPane.showInputDialog(ventana, "Ingrese la patente:");
			if (patente == null) return;

			String capacidadStr = JOptionPane.showInputDialog(ventana, "Ingrese la capacidad del vehiculo en Kg: ");
			if (capacidadStr == null) return;

			double capacidad = Double.parseDouble(capacidadStr);

			gestor.agregarEntidad(new Vehiculo(marca, patente, capacidad));

			JOptionPane.showMessageDialog(ventana, "¡Vehículo agregado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);

			areaTexto.setText(gestor.resumenEntidades());

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(ventana, "Error: La capacidad debe ser un número válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(ventana, "Error inesperado al ingresar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void agregarServicio() {
		try {
			String nombre = JOptionPane.showInputDialog(ventana, "Ingrese el nombre del Servicio Turístico:");
			if (nombre == null) return;

			String duracionStr = JOptionPane.showInputDialog(ventana, "Ingrese la duración (en horas):");
			if (duracionStr == null) return;

			double duracion = Double.parseDouble(duracionStr);

			gestor.agregarEntidad(new ServicioTuristico(nombre, duracion));

			JOptionPane.showMessageDialog(ventana, "¡Servicio agregado correctamente!", "Éxito", JOptionPane.INFORMATION_MESSAGE);

			areaTexto.setText(gestor.resumenEntidades());

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(ventana, "Error: La duración debe ser un número válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(ventana, "Error inesperado al ingresar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}