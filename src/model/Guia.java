package model;

/**
 * Modelado de clase Guia que hereda de empleado, identifica si un guía se maneja en más de un idioma.
 */
public class Guia extends Empleado {
	private String idioma;

	public Guia(String nombre, int telefono, Direccion direccion, Rut rut, String puesto, String turno, String idioma) {
		super(nombre, telefono, direccion, rut, puesto, turno);
		this.idioma = idioma;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public String mostrarResumen() {
		return super.mostrarResumen() + ", Idioma='" + idioma + "'";
	}
}
