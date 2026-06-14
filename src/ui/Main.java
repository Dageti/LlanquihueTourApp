package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String rutaArchivo = "src/resources/tours.txt";
		GestorDatos gestor = new GestorDatos();
		ArrayList<Tour> tours = gestor.cargarTours(rutaArchivo);

		System.out.println("========Tours Disponibles========");
		if (tours.isEmpty()) {
			System.out.println("No hay tours registrados");
		} else {
			for (Tour tour : tours) {
				System.out.println(tour);
			}
		}
		int precioTope = 100000;
		System.out.println("========Tours bajo los 100 mil pesos========");
		boolean encontrado = false;
		for (Tour tour : tours) {
			if (tour.getPrecio() < precioTope) {
				System.out.println(tour);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Por el momento no hay tours disponibles con este criterio.");
		}
	}
}
