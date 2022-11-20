package Plant;

import Logica.EntidadGrafica;
import Logica.Logica;
import Zombie.ClassicZombie;

public class PlantaGirasol extends Planta{
	
	private Logica miL;
		
	public PlantaGirasol(int x,int y) {
		super(x,y);
		costo = 50;
		imgPath = "Girasol.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		miL = Logica.getInstancia(0,0);
		miL.aumentarVelocidadDeAparicion();

	}

	@Override
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void visit(ClassicZombie z) {
		
		
	}

	@Override
	public void morir() {
		miL.normalizarVelocidadAparicion();
		
	}


}
