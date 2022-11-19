package Plant;

import Logica.EntidadGrafica;
import Zombie.ClassicZombie;

public class PlantaLanzaguisantes extends Planta{
	
	
	
	public PlantaLanzaguisantes(int x, int y) {
		super(x,y);
		imgPath = "plantaComun.gif";
		costo = 100;
		miX = x;
		miY = y;
		miEntidadGrafica = new EntidadGrafica(imgPath);
		disparadora = true;
	}

	public ProyectilClasico disparar() {
		ProyectilClasico aux = new ProyectilClasico(miX,miY);
//		aux.setMiX(miX+50);
//		aux.setMiY(miY-20);
		return aux;
	}

	@Override
	public void visit(ClassicZombie z) {
		// TODO Auto-generated method stub
		
	}





}
