package Zombie;

import Logica.EntidadGrafica;

public class AngryZombie extends ClassicZombie{

	public AngryZombie(int x, int y) {
		super(x,y);
		imgPath = "AngryZombie.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		velocidad = 4;
	}

}
