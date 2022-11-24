package Zombie;

import Logica.EntidadGrafica;
import Logica.Fila;

public class AngryZombie extends ClassicZombie{

	public AngryZombie(int x, int y,Fila f) {
		super(x,y, f);
		imgPath = "AngryZombie.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		vida = 100;
		velocidad = 4;
	}

}
