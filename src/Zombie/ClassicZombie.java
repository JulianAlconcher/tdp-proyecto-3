package Zombie;

import Logica.Entidad;
import Logica.EntidadGrafica;
import Plant.Planta;
import Plant.PlantaMina;

public class ClassicZombie extends Entidad implements VisitorZombie{
	protected int vida;
	protected int velocidad;
	protected ZombieState state;

	public ClassicZombie(int x,int y) {
		super(x,y);
		imgPath = "ZombieClasico.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		state= new WalkState(this);
		this.vida = 75;
		this.velocidad = 2;
	}

	public void mover() {
		miX -=velocidad;
		this.miRectangulo.setBounds(miX, miY, 100, 100);
		miGUI.moverZombie(miEntidadGrafica.getMiLabel(), miX, miY);
	}

	public void morir() {
		this.vida = 0;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void recibirDanio(int d) {
		this.vida -= 25;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public void visit(Planta p) {
		p.recibirDanio();
		state.cambioAtacar();
		if(p.getVida()<=0) {
			state.cambioCaminar();
		}
	}
	
//	public void setGraficaAtacando() {
//		imgPath="AttackClassic.gif";
//		miEntidadGrafica= new EntidadGrafica(imgPath);	
//	}
//	
//	public void setGraficaCaminar() {
//		imgPath="WalkClassic.gif ";
//		miEntidadGrafica= new EntidadGrafica(imgPath);
//	}

	@Override
	public void accept(VisitorZombie v) {
		// TODO Auto-generated method stub
		
	}


	public void setState(ZombieState s) {
	   this.state=s;
	}

}
