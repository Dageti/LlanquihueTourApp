package model;

public class PaseoLacustre extends ServicioTuristico {
	protected String tipoDeEmbarcacion;

	public PaseoLacustre(String nombre, double duracionHoras, String tipoDeEmbarcacion) {
		super(nombre, duracionHoras);
		this.tipoDeEmbarcacion = tipoDeEmbarcacion;
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println(" Tipo de embarcación: " + tipoDeEmbarcacion);
	}
}
