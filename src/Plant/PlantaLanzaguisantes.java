package Plant;

import Logica.EntidadGrafica;
import Logica.Visitor;

public class PlantaLanzaguisantes extends Planta{

	
	public PlantaLanzaguisantes(int x, int y) {
		super(x,y);
		imgPath = "plantaComun.gif";
		miProyectil = new ProyectilClasico(x,y);
		costo = 100;
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}
	
	
	public void disparar() {
		System.out.println("DISPARANDO");
		miProyectil.moverProyectil();
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
