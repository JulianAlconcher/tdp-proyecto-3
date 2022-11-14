package Zombie;

public class AttackState extends ZombieState {

	public AttackState(ClassicZombie z) {
		super(z);
	}

	public void cambioAtacar() {	
	}

	public void cambioCaminar() {
		System.out.println("Entro en caminar");
		z.setState(new WalkState(z));
		z.setVelocidad(2);
	}

	public String printState() {
		return null;
	}
	
	

}
