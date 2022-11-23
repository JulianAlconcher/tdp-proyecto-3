package Plant;

import java.awt.Rectangle;

import Logica.Entidad;

public abstract class Proyectil extends Entidad implements VisitorProyectil{
	
	protected int danio;
	
	
	public Proyectil(int x, int y) {
		super(x, y);
		miRectangulo = new Rectangle(x,y,30,100);
		danio = 10;
	}

	public void moverProyectil() {
		miX+=15;
		this.miRectangulo.setBounds(miX, miY, 30, 100);
		miGUI.moverProyectil(miEntidadGrafica.getMiLabel(), miX, miY);
	}
	


}
