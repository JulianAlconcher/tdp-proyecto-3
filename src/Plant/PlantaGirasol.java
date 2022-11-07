package Plant;

import Logica.Entidad;
import Logica.Visitor;

public class PlantaGirasol extends Entidad{

	public PlantaGirasol() {
		super(0,0,100,100);
		costo = 50;
		imgPath = "Girasol.gif";
		// TODO Auto-generated constructor stub
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
