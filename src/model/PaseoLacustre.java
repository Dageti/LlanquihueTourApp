package model;

public class PaseoLacustre extends ServicioTuristico {
	protected String tipoDeEmbarcacion;

	public PaseoLacustre(String nombre, double duracionHoras, String tipoDeEmbarcacion) {
		super(nombre, duracionHoras);
		this.tipoDeEmbarcacion = tipoDeEmbarcacion;
	}

	@Override
	public void mostrarResumen() {
		super.mostrarResumen();
		System.out.println(" Tipo de embarcación: " + tipoDeEmbarcacion);
	}
}
