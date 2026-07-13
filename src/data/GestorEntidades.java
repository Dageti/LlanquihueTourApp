package data;

import model.*;
import util.RutInvalidoException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que administra una colección polimórfica de entidades.
 * Lee los archivos .txt y los agrega como una base de información al sistema.
 */

public class GestorEntidades {
	public ArrayList<Registrable> entidades = new ArrayList<>();

	public void agregarEntidad(Registrable entidad) {
		entidades.add(entidad);
	}

	public void cargarDatosIniciales() {
		cargarToursDesdeArchivo("src/resources/tours.txt");
		cargarTrabajadoresDesdeArchivo("src/resources/trabajadores.txt");
	}

	private void cargarToursDesdeArchivo(String ruta) {
		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				if (linea.trim().isEmpty()) continue;
				String[] partes = linea.split(";");
				if (partes.length == 4) {
					try {
						String nombre = partes[0].trim();
						String descripcion = partes[1].trim();
						double precio = Double.parseDouble(partes[2].trim());
						int cantidadPersonas = Integer.parseInt(partes[3].trim());

						entidades.add(new Tour(nombre, descripcion, precio, cantidadPersonas));
					} catch (NumberFormatException e) {
						System.err.println("Error de formato en tour: " + linea);
					}
				}
			}
		} catch (IOException e) {
			System.err.println("Error al leer tours: " + e.getMessage());
		}
	}

	private void cargarTrabajadoresDesdeArchivo(String ruta) {
		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				if (linea.trim().isEmpty()) continue;
				String[] partes = linea.split(";");
				if (partes.length < 9) continue;

				try {
					String tipo = partes[0].trim().toUpperCase();
					String nombre = partes[1].trim();
					int telefono = Integer.parseInt(partes[2].trim());
					String rutString = partes[3].trim();
					int numCasa = Integer.parseInt(partes[4].trim());
					String calle = partes[5].trim();
					String ciudad = partes[6].trim();
					String puesto = partes[7].trim();
					String turno = partes[8].trim();
					Direccion dir = new Direccion(numCasa, calle, ciudad);
					Rut rut = new Rut(rutString);
					if (tipo.equals("GUIA") && partes.length >= 10) {
						entidades.add(new Guia(nombre, telefono, dir, rut, puesto, turno, partes[9].trim()));
					} else if (tipo.equals("CHOFER") && partes.length >= 11) {
						entidades.add(new Chofer(nombre, telefono, dir, rut, puesto, turno, partes[9].trim(), Integer.parseInt(partes[10].trim())));
					} else if (tipo.equals("COCINA") && partes.length >= 10) {
						entidades.add(new Cocina(nombre, telefono, dir, rut, puesto, turno, Boolean.parseBoolean(partes[9].trim())));
					} else if (tipo.equals("RECEPCIONISTA") && partes.length >= 11) {
						entidades.add(new Recepcionista(nombre, telefono, dir, rut, puesto, turno, partes[9].trim(), Boolean.parseBoolean(partes[10].trim())));
					}
				} catch (NumberFormatException | RutInvalidoException e) {
					System.err.println("Error procesando trabajador: " + linea);
				}
			}
		} catch (IOException e) {
			System.err.println("Error al leer trabajadores: " + e.getMessage());
		}
	}

	/**
	 * Recorre mediante instanceof la colección de entidades genéricas y las identifica mediante una etiqueta, aplica polimorfismo para agregar el formato correspondiente.
	 *
	 * @return String con todas las entidades para pasarlo al UI.
	 */

	public String resumenEntidades() {
		StringBuilder resumen = new StringBuilder();
		resumen.append("======== Registro General ========\n\n");

		if (entidades.isEmpty()) {
			return "No hay entidades registradas.";
		}
		for (Registrable entidad : entidades) {
			if (entidad instanceof Empleado) {
				resumen.append("[TRABAJADOR] ");
			} else if (entidad instanceof Vehiculo) {
				resumen.append("[FLOTA] ");
			} else if (entidad instanceof ServicioTuristico || entidad instanceof Tour) {
				resumen.append("[SERVICIO TURÍSTICO] ");
			}

			resumen.append(entidad.mostrarResumen()).append("\n");
		}

		return resumen.toString();
	}
}