package Zombie;

import Logica.EntidadGrafica;

public class NewsZombie extends ClassicZombie{

	public NewsZombie(int x, int y) {
		super(x, y);
		imgPath = "ZombieBandera.gif";
		vida = 100;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

}
