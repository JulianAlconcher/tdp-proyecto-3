package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;

public class PlantaGordaSeta extends Planta {

	public PlantaGordaSeta(int x, int y,Fila f) {
		super(x, y, f);
		costo = 75;
		vida = 100;
		alcance = 600;
		imgPath = "GordaSeta.gif";
		disparadora = true;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	public ProyectilSeta disparar() {
		return new ProyectilSeta(miX,miY,miFila);
	}

}
