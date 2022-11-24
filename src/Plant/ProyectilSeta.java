package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;
import Zombie.ClassicZombie;

public class ProyectilSeta extends Proyectil{

	public ProyectilSeta(int x, int y,Fila f) {
		super(x, y, f);
		imgPath = "ProyectilSeta.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		danio = 10;
	}




}
