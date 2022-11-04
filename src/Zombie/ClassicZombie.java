package Zombie;

import Logica.Visitor;

public class ClassicZombie implements EntidadZombie{
	protected int vida;
	protected int velocidad;
	//Conocen su ubicacion?

	public ClassicZombie() {
		this.vida = 10;
		this.velocidad = 10;
	}

	public void mover() {
		
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
