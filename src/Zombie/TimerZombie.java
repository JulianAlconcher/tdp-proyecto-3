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
	protected final int limiteHordaZombie = 5;
	
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
			
			if(contadorZombie == limiteHordaZombie) { //--> Cuando llega a limiteHordaZombie zombies empieza la horda
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
		velocidadDeAparicion = 10000;
		miG.nuevaHorda(); 
	}
	

	public void eliminarLblHorda() {
		miG.eliminarHorda(); 
		miG.repaint();
	}
	
	public void detener() {
		gameStart = false;
	}
	

		
	



}
