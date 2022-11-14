package Logica;

import GUI.mainGUI;

public class SolGenerator implements Runnable {
	public Thread hiloSol;
	protected boolean gameStart;
	protected int velocidadDeAparicion;
	protected Sol miSol;
	protected mainGUI miG;
	protected Logica miL;
	protected int contador;
	protected boolean parar;
	
	public SolGenerator(mainGUI g,Logica l) {
		miL = l;
		miG = g;
		miSol = new Sol(g);
		hiloSol = new Thread (this);
		hiloSol.start();
		velocidadDeAparicion = 2000;
		gameStart = true;
		contador = 0;

	}
	//ANDA PERO ESTA FEO
	public void run() {
		while(gameStart) {
				System.out.println("Entro");
				if(miSol.getToco()) {
					parar = miSol.getToco();
					miSol.removerSol();
					miL.aumentarSoles();
				}
				miSol.setToco(false);
				if(parar)
					contador++;
				
				if(contador == 6 && parar) {
					miSol = new Sol(miG);
					contador = 0;
					miSol.setToco(false);
					parar = false;
				}
			try {
				Thread.sleep(velocidadDeAparicion);
			} catch (InterruptedException e) {e.printStackTrace();}	
		}
	}

	
	
}
