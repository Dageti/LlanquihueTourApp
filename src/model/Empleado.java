package model;

/**
 * La clase Empleado hereda de Persona y permite saber el puesto y el turno del empleado.
 */
public class Empleado extends Persona {
	private String puesto;
	private String turno;

	/**
	 * Constructor de la clase Empleado
	 *
	 * @param nombre    Parametro heredado de Persona
	 * @param telefono  Parametro heredado de Persona
	 * @param direccion Parametro heredado de Persona
	 * @param rut       Parametro heredado de Persona
	 * @param puesto    Puesto en la empresa de la Persona
	 * @param turno     Turno que cubre la Persona
	 */
	public Empleado(String nombre, int telefono, Direccion direccion, Rut rut, String puesto, String turno) {
		super(nombre, telefono, direccion, rut);
		this.puesto = puesto;
		this.turno = turno;
	}

	/**
	 * Métodos Getter y Setters
	 */

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return super.toString() +
				" Puesto='" + puesto + '\'' +
				", Turno='" + turno + '\''
				;
	}
}
