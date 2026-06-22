package model;

public class Chofer extends Empleado {
	private String licencia;
	private int duracionLicencia;

	public Chofer(String nombre, int telefono, Direccion direccion, Rut rut, String puesto, String turno, String licencia, int duracionLicencia) {
		super(nombre, telefono, direccion, rut, puesto, turno);
		this.licencia = licencia;
		this.duracionLicencia = duracionLicencia;
	}

	public int getDuracionLicencia() {
		return duracionLicencia;
	}

	public void setDuracionLicencia(int duracionLicencia) {
		this.duracionLicencia = duracionLicencia;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	@Override
	public String toString() {
		return super.toString() + " | Licencia='" + licencia + "', Duración Licencia=" + duracionLicencia + " años";
	}
}
