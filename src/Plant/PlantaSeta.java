package Plant;

import java.awt.Rectangle;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class PlantaSeta extends Planta{

	public PlantaSeta(int x,int y) {
		super(x,y);
		imgPath = "seta.gif";
		costo = 0;
		disparadora = true;
		miRectangulo = new Rectangle(x,y,20,100);
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	public ProyectilSeta disparar() {
		return new ProyectilSeta(miX,miY);
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
