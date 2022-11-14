package Plant;

import java.awt.Rectangle;

import Logica.Entidad;
import Logica.EntidadGrafica;

public abstract class Proyectil extends Entidad implements VisitorProyectil{
	
	protected int danio;
	
	public Proyectil(int x, int y) {
		super(x, y);
		imgPath = "pea.png";
		miRectangulo = new Rectangle(x,y,30,100);
		miEntidadGrafica = new EntidadGrafica(imgPath);
		danio = 25;
	}

	protected int cantidadDanio = 2;
	int aumento = miX;
	
	public void moverProyectil() {
		miX+=15;
		this.miRectangulo.setBounds(miX, miY, 30, 100);
		miGUI.moverProyectil(miEntidadGrafica.getMiLabel(), miX, miY);
	}
	


}
