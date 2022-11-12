package Zombie;

import java.util.TimerTask;

import Logica.Logica;

public class TimerZombie extends TimerTask {
	public static int i = 1;
	protected Logica miLogica;
	
	public TimerZombie(int n,int modo) {
		miLogica = Logica.getInstancia(n, modo, null);
	}
	@Override
	public void run() {
		i++;
		System.out.println("Tiempo: " + i);
		
//		if(i==1000) {
//			miLogica.generarRandomZombie();
//			i = 0;
//		}
		
	}


}
