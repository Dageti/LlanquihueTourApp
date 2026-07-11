package model;

public class RutaGastronomica extends ServicioTuristico implements Registrable {
	protected int numeroDeParadas;

	public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
		super(nombre, duracionHoras);
		this.numeroDeParadas = numeroDeParadas;
	}

	@Override
	public void mostrarResumen() {
		super.mostrarResumen();
		System.out.println(" Paradas: " + this.numeroDeParadas);
	}

}
