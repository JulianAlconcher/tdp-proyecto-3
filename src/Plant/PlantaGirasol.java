package Plant;

import Logica.EntidadGrafica;
import Logica.Visitor;

public class PlantaGirasol extends Planta{

	public PlantaGirasol(int x,int y) {
		super(x,y);
		costo = 50;
		imgPath = "Girasol.gif";
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
