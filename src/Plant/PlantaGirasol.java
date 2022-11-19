package Plant;

import Logica.EntidadGrafica;
import Logica.Sol;
import Zombie.ClassicZombie;

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

	@Override
	public void visit(ClassicZombie z) {
		// TODO Auto-generated method stub
		
	}


}
