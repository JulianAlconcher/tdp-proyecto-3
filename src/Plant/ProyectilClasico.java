package Plant;

import Logica.Visitor;

public class ProyectilClasico extends Proyectil {
	
	public ProyectilClasico(int x,int y) {
		super(x,y);
		imgPath = "pea.png";
		this.cantidadDanio = 2;
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
