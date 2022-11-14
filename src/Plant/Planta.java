package Plant;

import java.awt.Rectangle;

import Logica.Entidad;

public abstract class Planta extends Entidad{

	protected Proyectil miProyectil;
	protected int vida = 100;
	protected boolean disparadora;


	public Planta(int x, int y) {
		super(x, y);
		miRectangulo = new Rectangle(x,y,70,100);
		disparadora = false;
	}	

	public void setMiProyectil(Proyectil miProyectil) {
		this.miProyectil = miProyectil;
	}
	public abstract Proyectil disparar();
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

	public Proyectil getMiProyectil() {
		return miProyectil;
	}
	
	public void recibirDanio() {
		vida -=5;
		System.out.println("ME ESTAN ATACANDO! VIDA:: " + vida);
		
	}

	public boolean isDisparadora() {
		return disparadora;
	}

	public void setDisparadora(boolean disparadora) {
		this.disparadora = disparadora;
	}

}
