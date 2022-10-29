package Zombie;

public class ClassicZombie{
	protected int vida;
	protected int velocidad;

	public ClassicZombie() {
		this.vida = 50;
		this.velocidad = 10;
	}

	public void mover() {
		
	}
	
	public void atacar() {
		
	}

	public int getVida() {
		return vida;
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

}
