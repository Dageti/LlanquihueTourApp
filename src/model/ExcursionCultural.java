package model;

public class ExcursionCultural extends ServicioTuristico {
	protected String lugarHistorico;

	public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
		super(nombre, duracionHoras);
		this.lugarHistorico = lugarHistorico;
	}

	@Override
	public String toString() {
		return "ExcursionCultural{" +
				"lugarHistorico='" + lugarHistorico + '\'' +
				", nombre='" + nombre + '\'' +
				", duracionHoras=" + duracionHoras +
				'}';
	}
}
