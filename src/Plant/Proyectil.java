package Plant;

import java.awt.Rectangle;

import Logica.Entidad;
import Logica.Fila;

public abstract class Proyectil extends Entidad implements VisitorProyectil{
	
	protected int danio;
	protected Fila f;
	
	
	public Proyectil(int x, int y,Fila f) {
		super(x, y, f);
		miRectangulo = new Rectangle(x,y,30,100);
		danio = 10;
		this.f =f; 
	}

	public void moverProyectil() {
		miX+=15;
		this.miRectangulo.setBounds(miX, miY, 30, 100);
		miGUI.moverProyectil(miEntidadGrafica.getMiLabel(), miX, miY);
	}
	
	public void remover() {
		f.eliminarProyectil(this);
		miGUI.removerLabel(miEntidadGrafica.getMiLabel());
		miEntidadGrafica.getMiLabel().repaint();
	}
	
	

}
