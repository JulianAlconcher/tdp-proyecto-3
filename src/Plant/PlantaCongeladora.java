package Plant;

import Logica.EntidadGrafica;
import Logica.Visitor;

public class PlantaCongeladora extends Planta{


	public PlantaCongeladora(int x, int y) {
		super(x, y);
		miProyectil = new ProyectilCongelante(x,y);
		costo = 175;
		imgPath = "plantaCongeladora.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	@Override
	public void visit(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disparar() {
		// TODO Auto-generated method stub
		
	}


	
}
