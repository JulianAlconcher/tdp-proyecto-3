package Logica;

import Plant.Planta;

public class Logica {
	
	protected Grilla miGrilla;
	protected int filas;
	protected int columnas;
	protected State state;
	private int soles;
	private String grass;
	protected AbstractFactory miFactoria;
	protected Fila[] misFilas;
	protected Planta entidadSeleccionada;

	public Logica(int n,int modo) {
	    state= new DayState(this);
	    grass= "fondoCuadradoActualizado.png";
		filas = 6;
		columnas = 9;
		miGrilla = new Grilla(filas,columnas);
		misFilas = new Fila[6];
		for(int i=0; i<6; i++) {
			misFilas[i] = new Fila();
		}
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
	

	public void nuevoProyectil() {
		misFilas[0].getMisProyectiles().getFirst().moverProyectil();
	}
	//TOMAR UNA DESICION CON RESPECTO A ESTO.
	public void crearEntidad(int opcion,int x,int y) {
		switch(opcion) {
		case 1:{
			entidadSeleccionada = miFactoria.crearPlantaCongeladora(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto()); //-->>>>>>>>>>>>>>>>>>>>>>>>>>>>>> esta ok?
		}
		break;
		case 2:{
			entidadSeleccionada = miFactoria.crearPlantaGirasol(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 3:{
			entidadSeleccionada = miFactoria.crearLanzaguisantes(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 4:{
			entidadSeleccionada = miFactoria.crearPlantaMina(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 5:{
			entidadSeleccionada = miFactoria.crearPlantaNuez(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 6:{
			entidadSeleccionada = miFactoria.crearPlantaNuezAlta(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 7:{
			entidadSeleccionada = miFactoria.crearPlantaSeta(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
		}
		break;
		case 8:{
			miFactoria.crearAngryZombie(x,y);
		}
		break;
		case 9:{
			miFactoria.crearBucketZombie(x,y);
		}
		break;
		case 10:{
			misFilas[y/100].insertarZombie(miFactoria.crearClassicZombie(x,y));
		}
		case 11:{
			misFilas[y/100].insertarZombie(miFactoria.crearConeZombie(x,y));
		}
		break;
		case 12:{
			misFilas[y/100].insertarZombie(miFactoria.crearFlagZombie(x,y));
		}
		break;
		case 13:{
			misFilas[y/100].insertarZombie(miFactoria.crearHolderZombie(x,y));
		}
		break;
		case 14:{
			misFilas[y/100].insertarProyectil(miFactoria.crearProyectilClasico(x,y));
		}
		}
	}
	
	public boolean checkCollition(int fila) {
		if(misFilas[fila].getMisZombies().size()>0 && misFilas[fila].getMisProyectiles().size()>0) {
			System.out.println("x: " + misFilas[fila].getMisZombies().getFirst().getMiRectangulo().getX() + " y: " + misFilas[fila].getMisZombies().getFirst().getMiRectangulo().getY());
			System.out.println("x: " + misFilas[fila].getMisProyectiles().getFirst().getMiRectangulo().getX() + " y: " + misFilas[fila].getMisProyectiles().getFirst().getMiRectangulo().getY());
			if(misFilas[fila].getMisZombies().getFirst().getMiRectangulo().intersects(misFilas[fila].getMisProyectiles().getFirst().getMiRectangulo())) {
				return true; //ACA IMPLEMENTAR VISITOR

			}
		}
		return false; 
		
	}
	
	public void moverZombie() {
		misFilas[0].getMisZombies().getFirst().mover();
	}
	
	public String getImgPath(int opcion) {
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
