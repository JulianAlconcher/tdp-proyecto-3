package Logica;

public abstract class State {
	
	protected Logica juego;
	
	public State(Logica juego) {
		this.juego=juego;
	}


	public abstract void cambioNoche();
	public abstract void cambioDia();
	public abstract String printState();

}
