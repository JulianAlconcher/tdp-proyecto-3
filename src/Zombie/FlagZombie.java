package Zombie;

import Logica.EntidadGrafica;

public class FlagZombie extends ClassicZombie{

	public FlagZombie(int x, int y) {
		super(x, y);
		imgPath = "ZombieBandera.gif";
		vida = 100;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

}
