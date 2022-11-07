package Plant;

import Logica.Entidad;
import Logica.Visitor;

public class PlantaNuez extends Entidad{

	public PlantaNuez() {
		super(0, 0, 100, 100);
		costo = 50;
		imgPath= "nuezpng.gif";
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
