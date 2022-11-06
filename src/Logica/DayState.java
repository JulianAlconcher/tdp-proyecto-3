package Logica;

public class DayState extends State {

	public DayState(Logica juego) {
		super(juego);
	}

	public void cambioNoche() {
	 juego.setState(new NightState(juego));
	 juego.setGrass("NightGrass.png");
	 juego.setMiFactoria(new FactoryNight());
	}

	public void cambioDia() {
	}

	@Override
	public String printState() {
		return "DIA";
	}


	
	
}
