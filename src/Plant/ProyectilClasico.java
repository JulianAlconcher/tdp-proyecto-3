package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;
import Zombie.ClassicZombie;

public class ProyectilClasico extends Proyectil {
	
	public ProyectilClasico(int x,int y,Fila f) {
		super(x, y, f);
		imgPath = "pea.png";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public void visit(ClassicZombie z) {
		remover();
		z.recibirDanio(danio);
	}



}
;
