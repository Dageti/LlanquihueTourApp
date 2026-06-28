package ui;

import data.GestorDatos;
import data.GestorServicios;
import model.Empleado;
import model.ServicioTuristico;
import model.Tour;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String rutaArchivoTour = "src/resources/tours.txt";
		String rutaArchivoTrabajador = "src/resources/trabajadores.txt";
		GestorDatos gestor = new GestorDatos();
		ArrayList<Tour> tours = gestor.cargarTours(rutaArchivoTour);
		ArrayList<Empleado> trabajadores = gestor.cargarTrabajadores(rutaArchivoTrabajador);
		GestorServicios gestorServicios = new GestorServicios();
		ArrayList<ServicioTuristico> ServiciosTuristicos = gestorServicios.crearServicioTuristico();

		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("========Lanquihue Tours========");
			System.out.println("1. mostrar Tours");
			System.out.println("2. mostrar Trabajadores");
			System.out.println("3. mostrar Tours en oferta");
			System.out.println("4. mostrar servicios Turísticos (TAREA SEMANA 6!)");
			System.out.println("5. cerrar programa");
			try {
				opcion = Integer.parseInt(scanner.nextLine());
				switch (opcion) {
					case 1:
						mostrarTours(tours);
						break;
					case 2:
						mostrarTrabajadores(trabajadores);
						break;
					case 3:
						mostrarToursEnOferta(tours, 100000);
						break;
					case 4:
						mostrarServicioTuristico(ServiciosTuristicos);
						break;
					case 5:
						System.out.println("¡Hasta pronto!");
						break;
					default:
						System.out.println("Opción no válida, intente nuevamente.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Por favor ingrese un número válido");
			}
		} while (opcion != 5);
		scanner.close();
	}

	private static void mostrarServicioTuristico(ArrayList<ServicioTuristico> ServiciosTuristico) {
		System.out.println("========Servicios Turísticos========");
		if (ServiciosTuristico.isEmpty()) {
			System.out.println("No hay servicios para mostrar");
		} else {
			for (ServicioTuristico servicioTuristico : ServiciosTuristico) {
				System.out.println(servicioTuristico);
			}
		}
	}

	private static void mostrarTrabajadores(ArrayList<Empleado> trabajadores) {
		System.out.println("========Trabajadores Registrados========");
		if (trabajadores.isEmpty()) {
			System.out.println("No hay trabajadores registrados");
		} else {
			for (Empleado trabajador : trabajadores) {
				System.out.println(trabajador);
			}
		}
	}

	private static void mostrarTours(ArrayList<Tour> tours) {
		System.out.println("========Tours Registrados========");
		if (tours.isEmpty()) {
			System.out.println("No hay tours registrados");
		} else {
			for (Tour tour : tours) {
				System.out.println(tour);
			}
		}
	}

	private static void mostrarToursEnOferta(ArrayList<Tour> tours, double precioTope) {
		System.out.println("========Tours bajo los " + (int) precioTope + " pesos========");
		boolean encontrado = false;
		for (Tour tour : tours) {
			if (tour.getPrecio() < precioTope) {
				System.out.println(tour);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No hay tours disponibles por menos de " + precioTope + " pesos.");
		}
	}


}