package Zombie;

import Logica.Entidad;
import Logica.EntidadGrafica;
import Logica.Fila;
import Plant.Planta;
import Plant.PlantaMina;
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
		//aca pregunto si la vida es menor o igual a 0 y lo mato
		
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
		p.recibirDanio();
		state.cambioAtacar();
		
		if(p.getVida()<=0) {
			state.cambioCaminar();
		}
	}
	
	public void accept(VisitorProyectil v) {
		v.visit(this);
	}

	public void setState(ZombieState s) {
	   this.state=s;
	}
}
