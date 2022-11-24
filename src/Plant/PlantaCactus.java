package Plant;

import Logica.EntidadGrafica;

public class PlantaCactus extends Planta{

	public PlantaCactus(int x, int y) {
		super(x, y);
		imgPath = "Cactus.gif";
		alcance = 900;
		costo = 125;
		miEntidadGrafica = new EntidadGrafica(imgPath);
		disparadora = true;
	}


	@Override
	public ProyectilDardo disparar() {
		return new ProyectilDardo(miX,miY);
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

}
