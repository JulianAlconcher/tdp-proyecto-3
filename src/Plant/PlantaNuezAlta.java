package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;

public class PlantaNuezAlta extends Planta{

	public PlantaNuezAlta(int x, int y,Fila f) {
		super(x,y,f);
		vida=2500;
		imgPath = "nuezAlta.gif";
		costo = 125;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}

}
