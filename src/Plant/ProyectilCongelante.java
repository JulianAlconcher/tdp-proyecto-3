package Plant;

import java.awt.Rectangle;

import Logica.EntidadGrafica;
import Logica.Visitor;

public class ProyectilCongelante extends Proyectil{

	public ProyectilCongelante(int x, int y) {
		super(x, y);
		imgPath = "peaCongelante.png";
		miRectangulo = new Rectangle(x,y,30,100);
		miEntidadGrafica = new EntidadGrafica(imgPath);
		miGUI.ubicar(miEntidadGrafica.getMiLabel(), x/100, y/100);
	}

	@Override
	public void visit(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
