package Plant;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class ProyectilSeta extends Proyectil{

	public ProyectilSeta(int x, int y) {
		super(x, y);
		imgPath = "ProyectilSeta.gif";
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
