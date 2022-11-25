package Zombie;

import Logica.Entidad;
import Logica.EntidadGrafica;
import Logica.Fila;
import Plant.Planta;
import Plant.VisitorProyectil;

public class ClassicZombie extends Entidad implements VisitorZombie{
	protected int vida;
	protected int velocidad;
	protected ZombieState state;

	public ClassicZombie(int x,int y,Fila f) {
		super(x,y, f);
		imgPath = "Zombie_Normal.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		state= new WalkState(this);
		this.vida = 75;
		this.velocidad = 3;
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
	public void visit(Planta p) {
		if(p.getVida()<=0) {
			state.cambioCaminar();
			p.morir();
		}
		else {
			p.recibirDanio();
			state.cambioAtacar();
		}

	}
	
	public void accept(VisitorProyectil v) {
		v.visit(this);
	}

	public ZombieState getState() {
		return state;
	}
	
	public void setState(ZombieState s) {
	   this.state=s;
	}
}
