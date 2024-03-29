package Zombie;

import GUI.mainGUI;
import Logica.Logica;

public class TimerZombie implements Runnable {
	protected Logica miLogica;
	protected mainGUI miG;
	public Thread hiloZombie;
	protected boolean gameStart;
	protected int contadorZombie;
	protected int velocidadDeAparicion;
	protected final int limiteHordaZombie = 8;
	
	public TimerZombie() {
		miG = mainGUI.getInstancia();
		miLogica = Logica.getInstancia(0);
		hiloZombie = new Thread (this);
		hiloZombie.start();
		gameStart = true;
		contadorZombie = 0;
		velocidadDeAparicion = 20000;
	}
	
	public void run() {
		while(gameStart) {

	
			generarZombie();
			
			if(contadorZombie == limiteHordaZombie) {
				horda();
			}
			if(contadorZombie > limiteHordaZombie)
				eliminarLblHorda();
			
		try {
			Thread.sleep(velocidadDeAparicion);
		} catch (InterruptedException e) {e.printStackTrace();}	
	
		}
		
	}
	
	public void generarZombie() {
		miLogica.generarRandomZombie();
		contadorZombie++;
	}
	
	public void horda() {
		velocidadDeAparicion = 8000;
		miG.nuevaHorda(); 
	}
	

	public void eliminarLblHorda() {
		miG.eliminarHorda(); 
		miG.repaint();
	}
	
	public void detener() {
		gameStart = false;
	}
	
	public void resetVelocidad() {
		velocidadDeAparicion = 20000;
	}
	

		
	



}
