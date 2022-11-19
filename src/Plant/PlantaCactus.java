package Plant;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class PlantaCactus extends Planta{

	public PlantaCactus(int x, int y) {
		super(x, y);
		imgPath = "Cactus.gif";
		alcance = 900;
		miEntidadGrafica = new EntidadGrafica(imgPath);
		disparadora = true;
	}

	@Override
	public void visit(ClassicZombie z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProyectilDardo disparar() {
		return new ProyectilDardo(miX,miY);
	}

}
