package Plant;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class ProyectilClasico extends Proyectil {
	
	public ProyectilClasico(int x,int y) {
		super(x, y);
		imgPath = "pea.png";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public void visit(ClassicZombie z) {
		z.recibirDanio(danio);
	}

	@Override
	public void accept(VisitorProyectil v) {
		v.visit(this);
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
;
