package Plant;

import Logica.Visitor;

public class PlantaMina extends Planta{
	

	
	public PlantaMina(int x, int y, int anchoRec, int largoRec) {
		super(x, y, anchoRec, largoRec);
		// TODO Auto-generated constructor stub
	}

	public void morir() {
		//Explota
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
