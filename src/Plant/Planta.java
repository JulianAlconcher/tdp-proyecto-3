package Plant;

import java.awt.Rectangle;

import Logica.Entidad;

public abstract class Planta extends Entidad implements VisitorPlantaMina{

	protected int vida = 100;
	protected boolean disparadora;
	protected int alcance;

	public Planta(int x, int y) {
		super(x, y);
		miRectangulo = new Rectangle(x,y,70,100);
		disparadora = false;
		alcance = 400;
	}	
	
	public abstract Proyectil disparar();
	
	public abstract void morir();

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
