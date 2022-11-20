package Logica;

public class NightState extends State{

	public NightState(Logica juego) {
		super(juego);
	}

	@Override
	public void cambioDia() {
		juego.setState(new DayState(juego));
		juego.setGrass("PastoDia.png");
		juego.setGrassVariante("PastoDiaOsc.png");
		 juego.setMiFactoria(new FactoryDay());
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
