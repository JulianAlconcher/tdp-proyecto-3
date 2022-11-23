package Logica;

import GUI.mainGUI;

public class SolGenerator implements Runnable {
	
	public Thread hiloSol;
	protected boolean gameStart;
	protected int velocidadDeRefresco;
	protected int velocidadDeAparicion;
	private boolean girasol;
	protected Sol miSol;
	protected mainGUI miG;
	protected Logica miL;
	protected int contador;
	protected boolean parar;
	
	public SolGenerator() {

		miG = mainGUI.getInstancia();
		miL = Logica.getInstancia(0);
		miSol = new Sol();
		hiloSol = new Thread (this);
		hiloSol.start();
		girasol = false;
		velocidadDeRefresco = 200;
		velocidadDeAparicion = 20;
		gameStart = true;
		contador = 0;
		miSol.colocarSol();
	}
	
	public void run() {

		while(gameStart) {
				if(miSol.getToco()) {
					parar = miSol.getToco();
					miSol.removerSol();
					if(girasol)
						miL.aumentarSoles();
					miL.aumentarSoles();
				}
				miSol.setToco(false);
				if(parar)
					contador++;
				
				if(contador == velocidadDeAparicion && parar) {
					miSol = new Sol();
					miSol.colocarSol();
					contador = 0;
					miSol.setToco(false);
					parar = false;
				}
			try {
				Thread.sleep(velocidadDeRefresco);
			} catch (InterruptedException e) {e.printStackTrace();}	
		}
	}
	
	public int getVelocidadDeAparicion() {
		return velocidadDeAparicion;
	}
	public void aumentarVelocidadDeAparicion() {
		girasol = true;
	}
	
	public void normalizar() {
		girasol = false;
	}
	
	public void detener() {
		gameStart = false;
	}
	

	
	
}
