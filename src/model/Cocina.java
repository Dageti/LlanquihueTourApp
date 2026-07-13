package model;

/**
 * Modelado de clase Cocina que hereda de empleado, identifica si una persona que trabaja en cocina es chef o ayudante de cocina mediante un booleano.
 */
public class Cocina extends Empleado {
	private boolean esChef;

	public Cocina(String nombre, int telefono, Direccion direccion, Rut rut, String puesto, String turno, boolean esChef) {
		super(nombre, telefono, direccion, rut, puesto, turno);
		this.esChef = esChef;
	}

	public boolean isEsChef() {
		return esChef;
	}

	public void setEsChef(boolean esChef) {
		this.esChef = esChef;
	}

	@Override
	public String mostrarResumen() {
		String rol = esChef ? "Chef" : "Ayudante de cocina";
		return super.mostrarResumen() + ", Rol Cocina='" + rol + "'";
	}
}
