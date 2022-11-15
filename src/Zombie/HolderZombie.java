package Zombie;

import Logica.EntidadGrafica;

//Tu y yo nena nivel 100 B)
public class HolderZombie extends ClassicZombie{

	public HolderZombie(int x, int y) {
		super(x, y);
		imgPath = "HolderZombie.gif";
		vida = 200;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

}
