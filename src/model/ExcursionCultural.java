package model;

public class ExcursionCultural extends ServicioTuristico implements Registrable {
	protected String lugarHistorico;

	public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
		super(nombre, duracionHoras);
		this.lugarHistorico = lugarHistorico;
	}

	@Override
	public void mostrarResumen() {
		super.mostrarResumen();
		System.out.println(" Lugar histórico: " + lugarHistorico);
	}
}
