package Plant;

import Logica.EntidadGrafica;
import Logica.Visitor;

public class PlantaSeta extends Planta{

	public PlantaSeta(int x,int y) {
		super(x,y);
		imgPath = "seta.gif";
		costo = 0;
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
