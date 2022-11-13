package Plant;

import Logica.EntidadGrafica;
import Logica.Visitor;

public class PlantaGordaSeta extends Planta {

	public PlantaGordaSeta(int x, int y) {
		super(x, y);
		costo = 75;
		imgPath = "GordaSeta.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		miProyectil = new ProyectilClasico(x,y);
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
