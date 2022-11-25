package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;

public class ProyectilClasico extends Proyectil {
	
	public ProyectilClasico(int x,int y,Fila f) {
		super(x, y, f);
		imgPath = "pea.png";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}


}

