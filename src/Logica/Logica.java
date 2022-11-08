package Logica;

public class Logica {
	
	protected Grilla miGrilla;
	protected int filas;
	protected int columnas;
	protected State state;
	private int soles;
	private String grass;
	protected AbstractFactory miFactoria;
	protected Fila[] misFilas;
	protected Entidad entidadSeleccionada;

	public Logica(int n,int modo) {
	    state= new DayState(this);
	    grass= "fondoCuadradoActualizado.png";
		filas = 6;
		columnas = 9;
		miGrilla = new Grilla(filas,columnas);
		misFilas = new Fila[5];
		entidadSeleccionada = null;
		if(modo == 0) {
			System.out.println(modo);
			miFactoria = new FactoryDay();
			this.setDayState();
		}
		else {
			System.out.println(modo);
			miFactoria = new FactoryNight();
			this.setNightState();
		}
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
	
	public void disminuirSoles(int d) {
		soles -=d;
		if(soles<0)
			soles = 0;
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

	//TOMAR UNA DESICION CON RESPECTO A ESTO.
	public void crearPlanta(int opcion) {
		switch(opcion) {
		case 1:{
			entidadSeleccionada = miFactoria.crearPlantaCongeladora();
			disminuirSoles(entidadSeleccionada.getCosto()); //-->>>>>>>>>>>>>>>>>>>>>>>>>>>>>> esta ok?
		}
		break;
		case 2:{
			entidadSeleccionada = miFactoria.crearPlantaGirasol();
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 3:{
			entidadSeleccionada = miFactoria.crearLanzaguisantes();
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 4:{
			entidadSeleccionada = miFactoria.crearPlantaMina();
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 5:{
			entidadSeleccionada = miFactoria.crearPlantaNuez();
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 6:{
			entidadSeleccionada = miFactoria.crearPlantaNuezAlta();
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 7:{
			entidadSeleccionada = miFactoria.crearPlantaSeta();
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 8:{
		
		}
		break;
		}
	}
	
	public String getImgPath(int opcion) {
		System.out.println("ENTRE");
		switch(opcion) {
		case 1:
			return "";
		case 2:
			return "Girasol.gif";
		case 3:
			return "plantaComun.gif";
		case 4:
			return "";
		case 5:
			return "nuezpng.gif";
		case 6:
			return "";
		case 7:
			return "";
		case 8:
			return "";
		}
		return null;
	}
	
	public AbstractFactory getMiFactoria() {
		return miFactoria;
	}

	public void setMiFactoria(AbstractFactory miFactoria) {
		this.miFactoria = miFactoria;
	}

	


}
