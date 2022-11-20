package Plant;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

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

	@Override
	public void visit(ClassicZombie z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}



	

}
