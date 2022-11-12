package Plant;

import java.awt.Rectangle;

import Logica.Entidad;

public abstract class Planta extends Entidad{

	protected Proyectil miProyectil;

	public Planta(int x, int y) {
		super(x, y);
		miProyectil = new ProyectilClasico(x,y);
		miRectangulo = new Rectangle(x,y,100,100);
	}	
	public Proyectil getMiProyectil() {
		return miProyectil;
	}

	public void setMiProyectil(Proyectil miProyectil) {
		this.miProyectil = miProyectil;
	}
	public abstract void disparar();

}
