package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;

public class PlantaCongeladora extends Planta{


	public PlantaCongeladora(int x, int y, Fila f) {
		super(x, y, f);
		costo = 175;
		vida = 200;
		imgPath = "plantaCongeladora.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		disparadora = true;
	}

	public ProyectilCongelante disparar() {
		return new ProyectilCongelante(miX,miY,miFila);
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}




	
}
