package Plant;

import Logica.EntidadGrafica;

public class PlantaGirasol extends Planta{

	public PlantaGirasol(int x,int y) {
		super(x,y);
		costo = 50;
		imgPath = "Girasol.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
