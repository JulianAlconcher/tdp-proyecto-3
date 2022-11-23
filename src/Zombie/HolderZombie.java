package Zombie;

import Logica.EntidadGrafica;

public class HolderZombie extends ClassicZombie{

	public HolderZombie(int x, int y) {
		super(x, y);
		imgPath = "HolderZombie.gif";
		vida = 200;
		velocidad = 2;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

}
