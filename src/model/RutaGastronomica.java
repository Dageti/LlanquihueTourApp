package model;

public class RutaGastronomica extends ServicioTuristico {
	protected int numeroDeParadas;

	public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
		super(nombre, duracionHoras);
		this.numeroDeParadas = numeroDeParadas;
	}

	@Override
	public String toString() {
		return "RutaGastronomica{" +
				"numeroDeParadas=" + numeroDeParadas +
				", nombre='" + nombre + '\'' +
				", duracionHoras=" + duracionHoras +
				'}';
	}
}
