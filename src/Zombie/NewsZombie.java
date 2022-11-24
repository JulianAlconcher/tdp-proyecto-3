package Zombie;

import Logica.EntidadGrafica;
import Logica.Fila;

public class NewsZombie extends ClassicZombie{

	public NewsZombie(int x, int y,Fila f) {
		super(x, y, f);
		imgPath = "ZombieBandera.gif";
		vida = 100;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

}
