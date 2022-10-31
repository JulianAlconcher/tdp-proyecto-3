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
	
	public void crearTablero() {
		
	}

	public int getFilas() {
		return filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public Celda[][] getTablero() {
		return tablero;
	}

	public void setTablero(Celda[][] tablero) {
		this.tablero = tablero;
	}
	
	
}
