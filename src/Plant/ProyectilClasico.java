package Plant;

import Zombie.ClassicZombie;

public class ProyectilClasico extends Proyectil {
	
	public ProyectilClasico(int x,int y) {
		super(x, y);
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

	


}
;
