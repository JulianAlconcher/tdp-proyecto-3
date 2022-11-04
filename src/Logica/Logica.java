package Logica;

import GUI.GUI;

public class Logica {
	
	protected GUI miGUI;
	protected Grilla miGrilla;
	protected PlantsHandler miPlantsHandler;
	protected int filas;
	protected int columnas;
	protected State state;
	
	public Logica() {
		state= new DayState(this);
		filas = 6;
		columnas = 9;
		miGrilla = new Grilla(filas,columnas);
		miPlantsHandler = new PlantsHandler();
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

}
