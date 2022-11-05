package Logica;

public class NightState extends State{

	public NightState(Logica juego) {
		super(juego);
	}

	@Override
	public void cambioDia() {
		juego.setState(new DayState(juego));
		juego.setGrass("Fondo.png");
	
	}

	@Override
	public String printState() {
		return "NOCHE";
	}

	@Override
	public void cambioNoche() {
		// TODO Auto-generated method stub
		
	}

}
