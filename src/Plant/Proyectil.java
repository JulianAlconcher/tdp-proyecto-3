package Plant;

import java.awt.Rectangle;

import Logica.Entidad;

public abstract class Proyectil extends Entidad{
	public Proyectil(int x, int y) {
		super(x, y);
		miRectangulo = new Rectangle(x,y,30,100);
	}
	int aumento = miX;
	public void moverProyectil() {
		aumento +=10;
		miRectangulo.setBounds(aumento, miY, 30, 100);
	}

	protected int cantidadDanio = 2;
}
