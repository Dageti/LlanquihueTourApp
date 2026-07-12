package model;

public class Vehiculo implements Registrable {
	public String marca;
	public String patente;
	public double capacidad;

	public Vehiculo(String marca, String patente, double capacidad) {
		this.marca = marca;
		this.patente = patente;
		this.capacidad = capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String mostrarResumen() {
		return "Marca: " + marca + ",Patente: " + patente + ",Capacidad: " + capacidad;
	}
}


