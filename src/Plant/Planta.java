package Plant;

import Logica.Visitor;

public abstract class Planta implements Visitor{
	
	protected int fila;
	protected int columna;
	protected int vida;
	protected int costo;
	
	public void morir() {
		vida = 0;
	};
	
	public int getCosto() {
		return costo;
	}
}
