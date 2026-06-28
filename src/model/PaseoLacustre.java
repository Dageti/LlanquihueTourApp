package model;

public class PaseoLacustre extends ServicioTuristico {
	protected String tipoDeEmbarcacion;

	public PaseoLacustre(String nombre, double duracionHoras, String tipoDeEmbarcacion) {
		super(nombre, duracionHoras);
		this.tipoDeEmbarcacion = tipoDeEmbarcacion;
	}

	@Override
	public String toString() {
		return "PaseoLacustre{" +
				"tipoDeEmbarcacion='" + tipoDeEmbarcacion + '\'' +
				", nombre='" + nombre + '\'' +
				", duracionHoras=" + duracionHoras +
				'}';
	}
}
