package Zombie;

public class WalkState extends ZombieState {

	public WalkState(ClassicZombie z) {
		super(z);
	}

	@Override
	public void cambioAtacar() {
		z.setState(new AttackState(z));
		z.setVelocidad(0);
		z.setGraficaAtacando();
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

	
	
}
