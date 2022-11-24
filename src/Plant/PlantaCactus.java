package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;

public class PlantaCactus extends Planta{

	public PlantaCactus(int x, int y,Fila f) {
		super(x, y, f);
		imgPath = "Cactus.gif";
		alcance = 900;
		costo = 125;
		miEntidadGrafica = new EntidadGrafica(imgPath);
		disparadora = true;
	}


	@Override
	public ProyectilDardo disparar() {
		return new ProyectilDardo(miX,miY,miFila);
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

}
