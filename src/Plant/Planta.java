package Plant;

import java.awt.Rectangle;

import Logica.Entidad;

public abstract class Planta extends Entidad{

	public Planta(int x, int y) {
		super(x, y);
		miRectangulo = new Rectangle(x,y,100,100);
	}

}
