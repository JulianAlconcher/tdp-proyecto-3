package Logica;

import GUI.GUI;

public class Logica {
	
	protected GUI miGUI;
	protected Grilla miGrilla;
	protected PlantsHandler miPlantsHandler;
	protected int filas;
	protected int columnas;
	protected State state;
	private int soles;
	
	public Logica() {
	    state= new DayState(this);
		filas = 6;
		columnas = 9;
		miGrilla = new Grilla(filas,columnas);
		miPlantsHandler = new PlantsHandler();
	}
	
	public void setDayState() {
		this.state=new DayState(this);
	}
	
	public void setNightState() {
		this.state=new NightState(this);
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

	public PlantsHandler getMiPlantsHandler() {
		return miPlantsHandler;
	}

	public void setMiPlantsHandler(PlantsHandler miPlantsHandler) {
		this.miPlantsHandler = miPlantsHandler;
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

}
