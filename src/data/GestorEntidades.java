package data;

import model.Empleado;
import model.Registrable;
import model.Vehiculo;
import model.ServicioTuristico;

import java.util.ArrayList;

public class GestorEntidades {
	public ArrayList<Registrable> entidades = new ArrayList<>();

	public void agregarEntidad(Registrable entidad) {
		entidades.add(entidad);
	}


	public void mostrarEntidades() {
		System.out.println("========Registro completo========");
		for (
				Registrable entidad : entidades) {
			if (entidad instanceof Empleado) {
				System.out.println("[Trabajador]");
				entidad.mostrarResumen();
			} else {
				if (entidad instanceof Vehiculo) {
					System.out.println("[Vehiculo]");
				} else if (entidad instanceof ServicioTuristico) {
					System.out.println("[Servicio]");
				}
				entidad.mostrarResumen();
				System.out.println();
			}
		}
	}

}
