package Plant;

import java.awt.Rectangle;

import Logica.Entidad;

public abstract class Proyectil extends Entidad{
	
	protected int cantidadDanio = 2;
	
	public Proyectil(int x, int y) {
		super(x, y);
		imgPath = "pea.png";
		miRectangulo = new Rectangle(x,y,30,100);
	}
	int aumento = miX;
	
	public void moverProyectil() {
		aumento +=15;
		miRectangulo.setBounds(aumento, miY, 30, 100);
//		miGUI.moverProyectil(miLabel, aumento, miY);
//		System.out.println(miLabel.getIcon() + "x: " + aumento + "y: " + miY);
	}


}
