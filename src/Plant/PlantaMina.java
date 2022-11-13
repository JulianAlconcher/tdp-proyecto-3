package Plant;

import Logica.EntidadGrafica;
import Logica.Visitor;

public class PlantaMina extends Planta{

	public PlantaMina(int x, int y) {
		super(x, y);
		costo = 25;
		imgPath = "mina.gif";
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
	public Proyectil disparar() {
		// TODO Auto-generated method stub
		return null;
	}


	



}
