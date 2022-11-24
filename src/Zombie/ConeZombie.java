package Zombie;

import Logica.EntidadGrafica;
import Logica.Fila;

public class ConeZombie extends ClassicZombie{
	
	public ConeZombie(int x,int y,Fila f) {
		super(x,y,f);
		this.vida = 110;
		imgPath = "coneZombie.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

}
