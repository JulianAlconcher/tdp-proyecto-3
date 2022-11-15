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
	protected final int limiteHordaZombie = 3;
	
	public TimerZombie(int n,int modo,Logica l) {
		miG = mainGUI.getInstancia();
		miLogica = l;
		hiloZombie = new Thread (this);
		hiloZombie.start();
		gameStart = true;
		contadorZombie = 0;
		velocidadDeAparicion = 20000;
	}
	
	public void run() {
		while(gameStart) {
			generarZombie();
			if(contadorZombie == limiteHordaZombie) { //--> Cuando llega a 5 zombies empieza la horda
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
		System.out.println("GENERO ZOMBIE");
		miLogica.generarRandomZombie();
		contadorZombie++;
	}
	
	public void horda() {
		velocidadDeAparicion = 2000;
		miG.nuevaHorda(); // singleton?
	}
	

	public void eliminarLblHorda() {
		miG.eliminarHorda(); //X AHoRA
		miG.repaint();
	}
	

		
	



}
