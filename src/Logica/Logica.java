package Logica;

public class Logica {
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
}
