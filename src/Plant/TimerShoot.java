package Plant;

import Logica.Logica;

public class TimerShoot implements Runnable {
	protected Logica miLogica;
	public Thread hiloDisparo;
	protected boolean gameStart;
	protected int velocidadDeDisparo;
	
	public TimerShoot(int modo,Logica l) {
		miLogica = l;
		hiloDisparo = new Thread (this);
		hiloDisparo.start();
		gameStart = true;
		velocidadDeDisparo = 2000;
	}
	@Override
	public void run() {
		while(gameStart) {
			miLogica.controlarPlantas();
			try {
				Thread.sleep(velocidadDeDisparo);
			} catch (InterruptedException e) {e.printStackTrace();}	
		}
	}
	
	public void detener() {
		gameStart = false;
	}
}
