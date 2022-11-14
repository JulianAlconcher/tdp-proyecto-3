package Plant;

import Logica.EntidadGrafica;

public class PlantaLanzaguisantes extends Planta{

	
	public PlantaLanzaguisantes(int x, int y) {
		super(x,y);
		imgPath = "plantaComun.gif";
		costo = 100;
		miX = x;
		miY = y;
		miEntidadGrafica = new EntidadGrafica(imgPath);
		disparadora = true;
	}

	@Override
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}





}
