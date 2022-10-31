package Plant;

import Logica.Visitor;

public class PlantaLanzaguisantes extends Planta{
	protected Proyectil miProyectil;
	
	public PlantaLanzaguisantes() {
		miProyectil = new ProyectilClasico();
	}
	
	public void disparar() {
		
	}

	@Override
	public void visit(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	};

}
