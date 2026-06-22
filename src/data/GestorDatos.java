package data;

import model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import util.RutInvalidoException;

/**
 * GestorDatos se encarga de leer datos desde un archivo externo en formato .txt y transformarlas en objetos tipo Tour o Empleado
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
					try {
						double precio = Double.parseDouble(partes[2].trim());
						int cantidadPersonas = Integer.parseInt(partes[3].trim());
						tours.add(new Tour(nombre, descripcion, precio, cantidadPersonas));
					} catch (NumberFormatException e) {
						System.out.println("Error: Formato de dato no valido" + linea);
					}
				}
			}
		} catch (IOException e) {
			System.err.println("Error al leer la lista de tours: " + e.getMessage());
		}
		return tours;
	}

	public ArrayList<Empleado> cargarTrabajadores(String rutaArchivoTrabajador) {
		ArrayList<Empleado> trabajadores = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivoTrabajador))) {
			String linea;

			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(";");

				if (partes.length < 9) {
					System.out.println("Error: Formato de dato no valido" + linea);
					continue;
				}

				try {
					String tipo = partes[0].trim();
					String nombre = partes[1].trim();
					int telefono = Integer.parseInt(partes[2].trim());
					String rutString = partes[3].trim();
					int numCasa = Integer.parseInt(partes[4].trim());
					String calle = partes[5].trim();
					String ciudad = partes[6].trim();
					String puesto = partes[7].trim();
					String turno = partes[8].trim();

					Direccion direccion = new Direccion(numCasa, calle, ciudad);
					Rut rut = new Rut(rutString);

					if (tipo.equals("GUIA")) {
						if (partes.length >= 10) {
							String idioma = partes[9].trim();
							trabajadores.add(new Guia(nombre, telefono, direccion, rut, puesto, turno, idioma));
						}

					} else if (tipo.equals("CHOFER")) {
						if (partes.length >= 11) {
							String tipoLicencia = partes[9].trim();
							int anosLicencia = Integer.parseInt(partes[10].trim());
							trabajadores.add(new Chofer(nombre, telefono, direccion, rut, puesto, turno, tipoLicencia, anosLicencia));
						}

					} else if (tipo.equals("COCINA")) {
						if (partes.length >= 10) {
							boolean esChef = Boolean.parseBoolean(partes[9].trim());
							trabajadores.add(new Cocina(nombre, telefono, direccion, rut, puesto, turno, esChef));
						}

					} else if (tipo.equals("RECEPCIONISTA")) {
						if (partes.length >= 11) {
							String idioma = partes[9].trim();
							boolean primerosAuxilios = Boolean.parseBoolean(partes[10].trim());
							trabajadores.add(new Recepcionista(nombre, telefono, direccion, rut, puesto, turno, idioma, primerosAuxilios));
						}
					} else {
						System.err.println("Error: Cargo no valido " + tipo);
					}

				} catch (NumberFormatException e) {
					System.err.println("Error al procesar trabajador " + e.getMessage());

				} catch (RutInvalidoException e) {
					System.err.println("Rut invalido en " + linea + " " + e.getMessage());
				}
			}
		} catch (IOException e) {
			System.err.println("Error al leer el archivo " + e.getMessage());
		}
		return trabajadores;
	}
}