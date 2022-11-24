package Zombie;

public class WalkState extends ZombieState {

	public WalkState(ClassicZombie z) {
		super(z);
	}

	@Override
	public void cambioAtacar() {
		z.setState(new AttackState(z));
		z.getMiEntidadGrafica().getMiLabel().repaint();
		
	}

	@Override
	public void cambioCaminar() {
	}

	@Override
	public String printState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accionar() {
		z.mover();
	}

	
	
}
