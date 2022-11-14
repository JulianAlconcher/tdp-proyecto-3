package Plant;

import java.awt.Rectangle;

import Logica.EntidadGrafica;

public class PlantaSeta extends Planta{

	public PlantaSeta(int x,int y) {
		super(x,y);
		imgPath = "seta.gif";
		costo = 0;
		miRectangulo = new Rectangle(x,y,20,100);
		miEntidadGrafica = new EntidadGrafica(imgPath);
		miProyectil = new ProyectilClasico(x,y);
	}

	@Override
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}


}
