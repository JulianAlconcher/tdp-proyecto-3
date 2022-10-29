package Logica;

public class Grilla {
	protected int filas;
	protected int columnas;
	protected Celda tablero[][];
	
	public Grilla(int f, int c) {
		filas = f;
		columnas = c;
		tablero = new Celda[filas][columnas];
	}
}
