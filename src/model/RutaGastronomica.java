package model;

public class RutaGastronomica extends ServicioTuristico {
	protected int numeroDeParadas;

	public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
		super(nombre, duracionHoras);
		this.numeroDeParadas = numeroDeParadas;
	}

	@Override
	public String mostrarResumen() {
		return super.mostrarResumen() + ", Paradas: " + this.numeroDeParadas;
	}

}
