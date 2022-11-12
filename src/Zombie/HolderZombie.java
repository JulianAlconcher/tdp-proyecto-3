package Zombie;

import Logica.EntidadGrafica;

//Tu y yo nena nivel 100 B)
public class HolderZombie extends ClassicZombie{

	public HolderZombie(int x, int y) {
		super(x, y);
		imgPath = "HolderZombie.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

}
