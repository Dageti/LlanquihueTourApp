package util;

public class RutInvalidoException extends Exception {
	public RutInvalidoException() {
		super("El RUT ingresado no es válido.");
	}
	public RutInvalidoException(String mensaje) {
		super(mensaje);
	}
}
