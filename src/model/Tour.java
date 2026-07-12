package model;

/**
 * Clase Tour representa los paquetes turísticos disponibles a manos de Llanquihue Tour
 */
public class Tour implements Registrable {

	private String nombre;
	private String descripcion;
	private double precio;
	private int cantidadPersonas;

	/**
	 *
	 * @param Nombre           nombre paquete de turismo
	 * @param Descripcion      descripción del tour, por ejemplo su duración y locación
	 * @param precio           Precio del tour
	 * @param cantidadPersonas Cantidad de personas que contempla el paquete
	 */
	public Tour(String Nombre, String Descripcion, double precio, int cantidadPersonas) {
		this.nombre = Nombre;
		this.descripcion = Descripcion;
		this.precio = precio;
		this.cantidadPersonas = cantidadPersonas;
	}

	/**
	 * Métodos Getters y Setters
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	@Override
	public String mostrarResumen() {
		return "Tour: " + getNombre() + " | Precio: $" + getPrecio();
	}
}
