package Plant;

import java.awt.Rectangle;

import Logica.Entidad;
import Logica.Visitor;

public class PlantaLanzaguisantes extends Entidad{

	
	public PlantaLanzaguisantes() {
		super(0,0,50,50);
		imgPath = "plantaComun.gif";
		costo = 100;
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
