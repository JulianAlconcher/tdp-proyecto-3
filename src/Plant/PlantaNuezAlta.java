package Plant;

import Logica.EntidadGrafica;
import Logica.Visitor;

public class PlantaNuezAlta extends Planta{

	public PlantaNuezAlta(int x, int y) {
		super(x,y);
		imgPath = "nuezAlta.gif";
		costo = 120;
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
