package Plant;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class ProyectilCongelante extends Proyectil{

	public ProyectilCongelante(int x, int y) {
		super(x, y);
		imgPath = "peaCongelante.png";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public void visit(ClassicZombie z) {
		z.recibirDanio(danio);
		z.setVelocidad(1);
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
