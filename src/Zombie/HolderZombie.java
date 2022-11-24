package Zombie;

import Logica.EntidadGrafica;
import Logica.Fila;

public class HolderZombie extends ClassicZombie{

	public HolderZombie(int x, int y,Fila f) {
		super(x, y, f);
		imgPath = "HolderZombie.gif";
		vida = 200;
		velocidad = 2;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

}
