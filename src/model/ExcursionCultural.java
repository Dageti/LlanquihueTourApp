package model;

public class ExcursionCultural extends ServicioTuristico implements Registrable {
	protected String lugarHistorico;

	public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
		super(nombre, duracionHoras);
		this.lugarHistorico = lugarHistorico;
	}

	@Override
	public String mostrarResumen() {
		super.mostrarResumen();
		return " Lugar histórico: " + lugarHistorico;
	}
}
