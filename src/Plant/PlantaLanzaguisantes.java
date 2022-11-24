package Plant;

import Logica.EntidadGrafica;
import Logica.Fila;

public class PlantaLanzaguisantes extends Planta{
	
	
	
	public PlantaLanzaguisantes(int x, int y, Fila f) {
		super(x,y,f);
		imgPath = "plantaComun.gif";
		costo = 100;
		miEntidadGrafica = new EntidadGrafica(imgPath);
		disparadora = true;
	}

	public ProyectilClasico disparar() {
		ProyectilClasico aux = new ProyectilClasico(miX,miY,miFila);
		return aux;
	}
	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}





}
