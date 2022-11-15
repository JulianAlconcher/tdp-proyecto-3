package Zombie;

import Logica.Logica;

public class TimerZombie implements Runnable {
	protected Logica miLogica;
	public Thread hiloZombie;
	protected boolean gameStart;
	protected int contadorZombie;
	protected int velocidadDeAparicion;
	protected final int limiteHordaZombie = 3;
	
	public TimerZombie(Logica a) {
		miLogica = a;
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
				miLogica.eliminarLblHorda();
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
		miLogica.nuevaHorda(); // singleton?
	}
	
	public void eliminarLBLhorda() {}
	
		
	



}
