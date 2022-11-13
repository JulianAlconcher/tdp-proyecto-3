package Plant;

import Logica.EntidadGrafica;
import Logica.Visitor;

public class PlantaLanzaguisantes extends Planta{

	
	public PlantaLanzaguisantes(int x, int y) {
		super(x,y);
		imgPath = "plantaComun.gif";
		costo = 100;
		miX = x;
		miY = y;
		miEntidadGrafica = new EntidadGrafica(imgPath);


	}
	public Proyectil disparar() {
		System.out.println("DISPARANDO");
		return new ProyectilClasico(miX,miY);
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
