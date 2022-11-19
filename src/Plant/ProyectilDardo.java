package Plant;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class ProyectilDardo extends Proyectil{

	public ProyectilDardo(int x, int y) {
		super(x, y);
		imgPath = "stick.gif";
		danio = 25;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public void visit(ClassicZombie z) {
		z.recibirDanio(danio);
		
	}

	@Override
	public void accept(VisitorProyectil v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ProyectilClasico proyectilClasico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ProyectilCongelante proyectilCongelante) {
		// TODO Auto-generated method stub
		
	}

}
