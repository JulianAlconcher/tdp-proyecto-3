package Logica;

import Plant.Planta;

public class Celda {
	protected int fila;
	protected int columna;
	protected boolean ocupada;
	protected Planta miPlanta;
	
	public Celda() {
		ocupada = false; 
	}
	
	
	public void insertarPlanta(Planta nuevaPlanta) {
		miPlanta = nuevaPlanta;
		ocupada = true;
	}
	
	
}
