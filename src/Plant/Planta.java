package Plant;

import java.awt.Rectangle;

import Logica.Entidad;
import Logica.Fila;
import Zombie.VisitorZombie;

public abstract class Planta extends Entidad{

	protected int vida = 100;
	protected boolean disparadora;
	protected int alcance;
	protected Fila miFila;

	public Planta(int x, int y,Fila f) {
		super(x, y, f);
		miRectangulo = new Rectangle(x,y,70,100);
		disparadora = false;
		alcance = 400;
		miFila = f;
	}	
	
	public abstract Proyectil disparar();
	
	public abstract void morir();
	
	public void accept(VisitorZombie v) {
		v.visit(this);	
	}

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

	public void recibirDanio() {
		vida -=5;		
	}

	public boolean isDisparadora() {
		return disparadora;
	}

	public void setDisparadora(boolean disparadora) {
		this.disparadora = disparadora;
	}
	
	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}


}
