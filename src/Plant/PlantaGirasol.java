package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;
import Logica.Logica;

public class PlantaGirasol extends Planta{
	
	private Logica miL;
		
	public PlantaGirasol(int x,int y,Fila f) {
		super(x,y,f);
		costo = 50;
		imgPath = "Girasol.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		miL = Logica.getInstancia(0);
		miL.aumentarVelocidadDeAparicion();

	}

	@Override
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void morir() {
		miL.normalizarVelocidadAparicion();
		
	}


}
