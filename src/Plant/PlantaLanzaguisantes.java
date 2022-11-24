package Plant;

import Logica.EntidadGrafica;

public class PlantaLanzaguisantes extends Planta{
	
	
	
	public PlantaLanzaguisantes(int x, int y) {
		super(x,y);
		imgPath = "plantaComun.gif";
		costo = 100;
		miEntidadGrafica = new EntidadGrafica(imgPath);
		disparadora = true;
	}

	public ProyectilClasico disparar() {
		ProyectilClasico aux = new ProyectilClasico(miX,miY);
		return aux;
	}
	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}





}
