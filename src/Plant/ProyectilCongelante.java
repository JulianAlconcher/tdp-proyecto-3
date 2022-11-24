package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;
import Zombie.ClassicZombie;

public class ProyectilCongelante extends Proyectil{

	public ProyectilCongelante(int x, int y,Fila f) {
		super(x, y, f);
		imgPath = "peaCongelante.png";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public void visit(ClassicZombie z) {
		super.visit(z);
		z.setVelocidad(1);
	}


}
