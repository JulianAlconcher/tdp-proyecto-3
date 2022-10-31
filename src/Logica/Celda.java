package Logica;

import Plant.Planta;

public class Celda {
	protected int fila;
	protected int columna;
	protected boolean ocupada;
	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public int getColumna() {
		return columna;
	}


	public void setColumna(int columna) {
		this.columna = columna;
	}


	public boolean isOcupada() {
		return ocupada;
	}


	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}


	public Planta getMiPlanta() {
		return miPlanta;
	}


	public void setMiPlanta(Planta miPlanta) {
		this.miPlanta = miPlanta;
	}


	protected Planta miPlanta;
	
	public Celda() {
		ocupada = false; 
	}
	
	
	public void insertarPlanta(Planta nuevaPlanta) {
		miPlanta = nuevaPlanta;
		ocupada = true;
	}
	
	
}
