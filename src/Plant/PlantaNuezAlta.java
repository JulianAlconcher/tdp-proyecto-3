package Plant;

import Logica.EntidadGrafica;

public class PlantaNuezAlta extends Planta{

	public PlantaNuezAlta(int x, int y) {
		super(x,y);
		vida=2500;
		imgPath = "nuezAlta.gif";
		costo = 120;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}



	

}
