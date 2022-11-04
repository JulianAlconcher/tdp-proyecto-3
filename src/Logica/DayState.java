package Logica;

public class DayState extends State {

	public DayState(Logica juego) {
		super(juego);
	}

	public void cambioNoche() {
	 juego.setState(new NightState(juego));
	}

	public void cambioDia() {
	}


	
	
}
