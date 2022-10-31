package Logica;

import GUI.GUI;

public class Logica {
	
	protected GUI miGUI;
	protected Grilla miGrilla;
	protected PlantsHandler miPlantsHandler;
	protected int filas;
	protected int columnas;
	
	public Logica() {
		filas = 6;
		columnas = 9;
		miGrilla = new Grilla(filas,columnas);
		miPlantsHandler = new PlantsHandler();
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

}
