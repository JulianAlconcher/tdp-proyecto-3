package Zombie;

public class ClassicZombie{
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
	
	public void recibirDaño(int d) {
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

}
