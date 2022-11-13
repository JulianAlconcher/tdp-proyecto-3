package Plant;

import java.awt.Rectangle;

import Logica.EntidadGrafica;
import Logica.Visitor;

public class ProyectilClasico extends Proyectil {
	
	public ProyectilClasico(int x,int y) {
		super(x, y);
		imgPath = "pea.png";
		miRectangulo = new Rectangle(x,y,30,100);
		miEntidadGrafica = new EntidadGrafica(imgPath);
		miGUI.ubicar(miEntidadGrafica.getMiLabel(), miX/100, miY/100);
	}
	
	public void moverProyectil() {
		aumento +=15;
		miRectangulo.setBounds(aumento, miY, 30, 100);
		miGUI.moverProyectil(miEntidadGrafica.getMiLabel(), aumento, miY);
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
;
