package Logica;

public class SolGenerator implements Runnable {
	protected Logica miLogica;
	public Thread hiloSol;
	protected boolean gameStart;
	protected int velocidadDeAparicion;
	protected Sol miSol;
	
	public SolGenerator(Logica a) {
		miLogica = a;
		hiloSol = new Thread (this);
		hiloSol.start();
		velocidadDeAparicion = 200;
		miSol = new Sol();
		miSol.colocarSol();
		gameStart = true;

	}
	
	public void run() {
		while(gameStart && miSol.getToco()==true) {
			miSol = new Sol();
			generarSol();
		}
		try {
			Thread.sleep(velocidadDeAparicion);
		} catch (InterruptedException e) {e.printStackTrace();}	

	}

	
	public void generarSol() {
		System.out.println("GENERO SOL");
		miSol.colocarSol();
		miLogica.aumentarSoles();
	}
	
}
