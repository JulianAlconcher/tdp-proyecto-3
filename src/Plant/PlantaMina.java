package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;

public class PlantaMina extends Planta{

	public PlantaMina(int x, int y,Fila f) {
		super(x, y, f);
		costo = 25;
		imgPath = "mina.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public Proyectil disparar() {
		return null;
	}

}
