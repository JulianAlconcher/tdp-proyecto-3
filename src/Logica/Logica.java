package Logica;

public class Logica {
	
	protected Grilla miGrilla;
	protected int filas;
	protected int columnas;
	protected State state;
	private int soles;
	private String grass;
	protected AbstractFactory miFactoria;

	public Logica() {
	    state= new DayState(this);
	    grass= "fondoCuadrado.png";
		filas = 6;
		columnas = 9;
		miGrilla = new Grilla(filas,columnas);
		miFactoria = new FactoryDay();
	}
	
	public void setDayState() {
		state.cambioDia();
	}
	
	public void setNightState() {
		state.cambioNoche();
	}
	public void setState(State state) {
		this.state=state;
	}
	
	public Grilla getMiGrilla() {
		return miGrilla;
	}

	public void setMiGrilla(Grilla miGrilla) {
		this.miGrilla = miGrilla;
	}


	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	public void gameOver() { //Zombie llega a casa
		
	}
	
	public boolean chequearZombieEnFila(int fila) {
		for(int j=0; j<columnas; j++) {
//			if(miGrilla.getCelda(fila,j))  // Preguntar si tiene un zombie
				
		}
		return true;
	}
	
	public boolean lugarDisponiblePlanta(int f,int c) {
		return true;
	}

	public int getSoles() {
		return soles;
	}

	public void aumentarSoles() {
		this.soles=soles+25;
	}
	
	public void restarSoles() {
		this.soles=soles-100;
		
	}
	public void setSoles(int soles) {
		this.soles = soles;
	}

	public String printGameState() {
		return state.printState();
	}

	public void setGrass(String string) {
		grass = string;
		
	}
	
	public String getGrass() {
		return grass;
	}

	public void crearPlanta() {
		
	}
	
	
	public AbstractFactory getMiFactoria() {
		return miFactoria;
	}

	public void setMiFactoria(AbstractFactory miFactoria) {
		this.miFactoria = miFactoria;
	}
}
