package Plant;

import Logica.Entidad;

public abstract class Proyectil extends Entidad{
	
	public Proyectil(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	protected int cantidadDanio = 2;
	
//	public Proyectil(int x, int y) {
////		super(x, y);
////		imgPath = "pea.png";
////		miRectangulo = new Rectangle(x,y,30,100);
////		miEntidadGrafica = new EntidadGrafica(imgPath);
////		miGUI.ubicar(miEntidadGrafica.getMiLabel(), x/100, y/100);
//	}
	int aumento = miX;
	
	public void moverProyectil() {
		aumento +=15;
		miRectangulo.setBounds(aumento, miY, 30, 100);
		miGUI.moverProyectil(miEntidadGrafica.getMiLabel(), aumento, miY);
	}


}
