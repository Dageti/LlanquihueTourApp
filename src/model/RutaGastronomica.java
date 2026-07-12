package model;

public class RutaGastronomica extends ServicioTuristico implements Registrable {
	protected int numeroDeParadas;

	public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
		super(nombre, duracionHoras);
		this.numeroDeParadas = numeroDeParadas;
	}

	@Override
	public String mostrarResumen() {
		super.mostrarResumen();
		return " Paradas: " + this.numeroDeParadas;
	}

}
