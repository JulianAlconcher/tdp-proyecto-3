package Zombie;

public abstract class ZombieState {

	protected ClassicZombie z;
	
	public ZombieState(ClassicZombie z) {
		this.z=z;
	}
	
	public abstract void cambioAtacar();
	public abstract void cambioCaminar();
	public abstract String printState();
	
}
