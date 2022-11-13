package Plant;

import java.awt.Rectangle;

import Logica.Entidad;

public abstract class Planta extends Entidad{

	protected Proyectil miProyectil;
	protected int vida = 100;

	public Planta(int x, int y) {
		super(x, y);
		miProyectil = new ProyectilClasico(x,y);
		miRectangulo = new Rectangle(x,y,70,100);
	}	
	public Proyectil getMiProyectil() {
		return miProyectil;
	}
	
	public void recibirDanio() {
		vida -=5;
		System.out.println("ME ESTAN ATACANDO! VIDA:: " + vida);
		
	}

	public void setMiProyectil(Proyectil miProyectil) {
		this.miProyectil = miProyectil;
	}
	public abstract void disparar();
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

}
