package model;

/**
 * Modelado de clase Recepcionista que hereda de empleado, identifica si un recepcionista se maneja en más de un idioma y si sabe primeros auxilios.
 */
public class Recepcionista extends Empleado {
	private String idiomas;
	private Boolean primerosAuxilios;

	public Recepcionista(String nombre, int telefono, Direccion direccion, Rut rut, String puesto, String turno, String idiomas, boolean primerosAuxilios) {
		super(nombre, telefono, direccion, rut, puesto, turno);
		this.idiomas = idiomas;
		this.primerosAuxilios = primerosAuxilios;

	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public Boolean getPrimerosAuxilios() {
		return primerosAuxilios;
	}

	public void setPrimerosAuxilios(Boolean primerosAuxilios) {
		this.primerosAuxilios = primerosAuxilios;
	}

	@Override
	public String mostrarResumen() {
		String auxilio = primerosAuxilios ? "Sí" : "No";
		return super.mostrarResumen() + ", Idiomas='" + idiomas + "', tiene conocimientos sobre primeros auxilios='" + auxilio + "'";
	}
}
