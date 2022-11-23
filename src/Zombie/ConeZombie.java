package Zombie;

import Logica.EntidadGrafica;

public class ConeZombie extends ClassicZombie{
	
	public ConeZombie(int x,int y) {
		super(x,y);
		this.vida = 110;
		imgPath = "coneZombie.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

}
