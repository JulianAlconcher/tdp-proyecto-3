package Plant;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class PlantaMina extends Planta{

	public PlantaMina(int x, int y) {
		super(x, y);
		costo = 25;
		imgPath = "mina.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public Proyectil disparar() {
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
