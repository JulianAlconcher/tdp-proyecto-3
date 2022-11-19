package Zombie;

public class AttackState extends ZombieState {

	public AttackState(ClassicZombie z) {
		super(z);
	}

	public void cambioAtacar() {	
	}

	public void cambioCaminar() {
		z.setState(new WalkState(z));
		z.setVelocidad(2);
		z.getMiEntidadGrafica().getMiLabel().repaint();
	}

	public String printState() {
		return null;
	}
	
	

}
