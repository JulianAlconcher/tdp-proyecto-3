package Plant;

import Logica.EntidadGrafica;

public class PlantaNuez extends Planta{

	public PlantaNuez(int x,int y) {
		super(x,y);
		costo = 50;
		imgPath= "nuez.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}




}
