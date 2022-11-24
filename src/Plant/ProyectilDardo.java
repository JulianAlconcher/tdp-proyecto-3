package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;
import Zombie.ClassicZombie;

public class ProyectilDardo extends Proyectil{

	public ProyectilDardo(int x, int y,Fila f) {
		super(x, y, f);
		imgPath = "stick.gif";
		danio = 5;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public void visit(ClassicZombie z) {
		remover();
		z.recibirDanio(danio);
		
	}

}
