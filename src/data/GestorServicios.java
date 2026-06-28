package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;

public class GestorServicios {
	public ArrayList<ServicioTuristico> crearServicioTuristico() {
		ArrayList<ServicioTuristico> listaServicioTuristico = new ArrayList<>();

		RutaGastronomica ruta1 = new RutaGastronomica("Viñedos sureños", 5, 3);
		listaServicioTuristico.add(ruta1);
		RutaGastronomica ruta2 = new RutaGastronomica("Restaurantes del lago", 2, 3);
		listaServicioTuristico.add(ruta2);
		ExcursionCultural ruta3 = new ExcursionCultural("Paseo por pinturas rupestres", 3, "pinturas rupestres de civilizaciones antiguas");
		listaServicioTuristico.add(ruta3);
		ExcursionCultural ruta4 = new ExcursionCultural("Visita a museos", 5, "museos contemporáneos de la zona");
		listaServicioTuristico.add(ruta4);
		PaseoLacustre ruta5 = new PaseoLacustre("Recorrido por el lago Llanquihue", 1, "catamaran");
		listaServicioTuristico.add(ruta5);
		PaseoLacustre ruta6 = new PaseoLacustre("Pesca artesanal en el lago", 6, "bote a remos");
		listaServicioTuristico.add(ruta6);
		return listaServicioTuristico;
	}
}
