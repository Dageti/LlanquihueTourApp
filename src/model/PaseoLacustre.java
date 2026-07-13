package model;

public class PaseoLacustre extends ServicioTuristico {
	protected String tipoDeEmbarcacion;

	public PaseoLacustre(String nombre, double duracionHoras, String tipoDeEmbarcacion) {
		super(nombre, duracionHoras);
		this.tipoDeEmbarcacion = tipoDeEmbarcacion;
	}

	@Override
	public String mostrarResumen() {
		return super.mostrarResumen() + ", Tipo de embarcación: " + tipoDeEmbarcacion;
	}
}
