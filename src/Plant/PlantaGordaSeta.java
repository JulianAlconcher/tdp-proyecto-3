package Plant;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class PlantaGordaSeta extends Planta {

	public PlantaGordaSeta(int x, int y) {
		super(x, y);
		costo = 75;
		vida = 1000;
		imgPath = "GordaSeta.gif";
		disparadora = true;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	public ProyectilSeta disparar() {
		return new ProyectilSeta(miX,miY);
	}

	@Override
	public void visit(ClassicZombie z) {
		// TODO Auto-generated method stub
		
	}


}
