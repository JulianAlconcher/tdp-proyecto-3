package Plant;

import Logica.Entidad;

public abstract class Proyectil extends Entidad{
	
	public Proyectil(int x, int y) {
		super(x, y);
	}

	protected int cantidadDanio = 2;
	int aumento = miX;
	
	public void moverProyectil() {
		aumento +=15;
		this.miRectangulo.setBounds(aumento, miY, 30, 100);
		miGUI.moverProyectil(miEntidadGrafica.getMiLabel(), aumento, miY);
		System.out.println("Moviendo proyectil en :: " + aumento +  " y:: " + miY);
	}


}
