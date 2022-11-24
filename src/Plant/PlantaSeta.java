package Plant;

import java.awt.Rectangle;

import Logica.EntidadGrafica;
import Logica.Fila;

public class PlantaSeta extends Planta{

	public PlantaSeta(int x,int y,Fila f) {
		super(x,y,f);
		imgPath = "seta.gif";
		costo = 25;
		vida = 50;
		disparadora = true;
		alcance = 300;
		miRectangulo = new Rectangle(x,y,20,100);
		miEntidadGrafica = new EntidadGrafica(imgPath);
	}

	public ProyectilSeta disparar() {
		return new ProyectilSeta(miX,miY,miFila);
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}


}
