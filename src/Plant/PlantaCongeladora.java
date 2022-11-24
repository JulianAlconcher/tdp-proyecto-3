package Plant;

import Logica.EntidadGrafica;

public class PlantaCongeladora extends Planta{


	public PlantaCongeladora(int x, int y) {
		super(x, y);
		costo = 175;
		vida = 200;
		imgPath = "plantaCongeladora.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		disparadora = true;
	}

	public ProyectilCongelante disparar() {
		return new ProyectilCongelante(miX,miY);
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}




	
}
