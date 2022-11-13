package Zombie;

import Logica.Entidad;
import Logica.EntidadGrafica;
import Logica.Visitor;

public class ClassicZombie extends Entidad{
	protected int vida;
	protected int velocidad;

	public ClassicZombie(int x,int y) {
		super(x,y);
		imgPath = "ZombieClasico.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		this.vida = 10;
		this.velocidad = miX;
	}

	public void mover() {
		velocidad -=2;
		this.miRectangulo.setBounds(velocidad, miY, 100, 100);
		miGUI.moverZombie(miEntidadGrafica.getMiLabel(), velocidad, miY);
	}

	public void morir() {
		this.vida = 0;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void recibirDanio(int d) {
		this.vida -= d;
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
	public void visit(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
