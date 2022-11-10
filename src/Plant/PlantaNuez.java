package Plant;

import Logica.Visitor;

public class PlantaNuez extends Planta{

	public PlantaNuez(int x,int y) {
		super(x,y);
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
