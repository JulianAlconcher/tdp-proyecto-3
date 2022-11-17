package Logica;

import GUI.mainGUI;

public class SolGenerator implements Runnable {
	public Thread hiloSol;
	protected boolean gameStart;
	protected int velocidadDeRefresco;
	protected int velocidadDeAparicion;
	protected Sol miSol;
	protected mainGUI miG;
	protected Logica miL;
	protected int contador;
	protected boolean parar;
	
	public SolGenerator(int n,int modo,Logica l) {

		miG = mainGUI.getInstancia();
		miL = l;
		miSol = new Sol(miG);
		hiloSol = new Thread (this);
		hiloSol.start();
		velocidadDeRefresco = 200;
		velocidadDeAparicion = 20;
		gameStart = true;
		contador = 0;
		miSol.colocarSol();
	}
	//ANDA PERO ESTA FEO
	public void run() {
		while(gameStart) {
				if(miSol.getToco()) {
					parar = miSol.getToco();
					miSol.removerSol();
					miL.aumentarSoles();
				}
				miSol.setToco(false);
				if(parar)
					contador++;
				
				if(contador == velocidadDeAparicion && parar) {
					miSol = new Sol(miG);
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

	
	
}
