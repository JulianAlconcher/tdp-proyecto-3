package Plant;

import Logica.Visitor;

public class PlantaNuezAlta extends Planta{

	public PlantaNuezAlta(int x, int y) {
		super(x,y);
		imgPath = "nuezCuadrada.gif";
		costo = 120;
	}
	@Override
	public void visit(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	

}
