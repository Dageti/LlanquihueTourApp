package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Bucle para leer el archivo "tours.txt" para poblar la lista, en caso de tener formato válido se agrega a la lista, si no, arroja error
 * Al final del bucle devuelve la lista poblada
 */
public class GestorDatos {
	public ArrayList<Tour> cargarTours(String rutaArchivo) {
		ArrayList<Tour> tours = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
			String linea;

			while ((linea = br.readLine()) != null) {
				if (linea.trim().isEmpty()) {
					continue;
				}
				String[] partes = linea.split(";");
				if (partes.length == 4) {
					String nombre = partes[0].trim();
					String descripcion = partes[1].trim();
					double precio = Double.parseDouble(partes[2].trim());
					int cantidadPersonas = Integer.parseInt(partes[3].trim());

					Tour tour = new Tour(nombre, descripcion, precio, cantidadPersonas);
					tours.add(tour);
				}
			}
		} catch (IOException e) {
			System.err.println("Error al leer la lista de tours: " + e.getMessage());
		}
		return tours;
	}
}