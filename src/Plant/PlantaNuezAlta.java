package Plant;

import Logica.Entidad;
import Logica.Visitor;

public class PlantaNuezAlta extends Entidad{

	public PlantaNuezAlta() {
		super(0,0,100,100);
		imgPath = "nuezCuadrada.gif";
		costo = 50;
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
