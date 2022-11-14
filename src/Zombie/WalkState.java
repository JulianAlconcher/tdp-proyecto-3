package Zombie;

public class WalkState extends ZombieState {

	public WalkState(ClassicZombie z) {
		super(z);
	}

	@Override
	public void cambioAtacar() {
		System.out.println("Entro en atacar");
		z.setState(new AttackState(z));
		z.setVelocidad(0);
		
	}

	@Override
	public void cambioCaminar() {
	}

	@Override
	public String printState() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
