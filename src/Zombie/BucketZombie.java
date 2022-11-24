package Zombie;

import Logica.EntidadGrafica;
import Logica.Fila;

public class BucketZombie extends ClassicZombie{

	public BucketZombie(int x, int y,Fila f) {
		super(x,y,f);
		imgPath = "BucketZombie.gif";
		vida = 120;
		velocidad = 3;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}
	
	
}
