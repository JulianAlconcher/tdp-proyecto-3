package Plant;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class PlantaNuez extends Planta{

	public PlantaNuez(int x,int y) {
		super(x,y);
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

	@Override
	public void visit(ClassicZombie z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}





}
