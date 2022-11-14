package Plant;

import java.awt.Rectangle;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class ProyectilCongelante extends Proyectil{

	public ProyectilCongelante(int x, int y) {
		super(x, y);
		imgPath = "peaCongelante.png";
		miRectangulo = new Rectangle(x,y,30,100);
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public void visit(ClassicZombie z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(VisitorProyectil v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ProyectilClasico proyectilClasico) {
		// TODO Auto-generated method stub
		
	}

}
