package Zombie;

import Logica.EntidadGrafica;

public class BucketZombie extends ClassicZombie{

	public BucketZombie(int x, int y) {
		super(x,y);
		imgPath = "BucketZombie.gif";
		velocidad = 3;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}
	
	
}
