package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;

public class PlantaNuez extends Planta{

	public PlantaNuez(int x,int y,Fila f) {
		super(x,y,f);
		vida=1000;
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
