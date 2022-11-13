package Logica;

import java.util.concurrent.ThreadLocalRandom;

import GUI.mainGUI;
import Plant.Planta;
import Zombie.ClassicZombie;
import Zombie.TimerZombie;

public final class Logica {
	
	private static Logica miLogica;
	public String valor;
	
	protected Grilla miGrilla;
	protected int filas;
	protected int columnas;
	protected State state;
	private int soles;
	private String grass;
	protected AbstractFactory miFactoria;
	protected Fila[] misFilas;
	protected Planta entidadSeleccionada;
	protected mainGUI miGUI;
	protected TimerZombie miGeneradorZombie;

	public Logica(int n,int modo,mainGUI a) {
		miGUI = a;
	    state= new DayState(this);
	    grass= "PastoDia.png";
		filas = 6;
		columnas = 9;
		miGrilla = new Grilla(filas,columnas);
		misFilas = new Fila[6];
		for(int i=0; i<6; i++) {
			misFilas[i] = new Fila();
		}
		entidadSeleccionada = null;
		if(modo == 0) {
			miFactoria = new FactoryDay();
			this.setDayState();
		}
		else {
			miFactoria = new FactoryNight();
			this.setNightState();
		}
		this.valor = valor;
		miGeneradorZombie = new TimerZombie(this);
	}
//	public synchronized static Logica getInstancia(int n, int modo,String valor) {
//		if(valor == null)
//			miLogica = new Logica(n,modo,valor);
//		
//		return miLogica;
//	}
	public void setDayState() {
		state.cambioDia();
	}
	
	public void setNightState() {
		state.cambioNoche();
	}
	public void setState(State state) {
		this.state=state;
	}
	
	public Grilla getMiGrilla() {
		return miGrilla;
	}

	public void setMiGrilla(Grilla miGrilla) {
		this.miGrilla = miGrilla;
	}


	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	public void gameOver() { //Zombie llega a casa
		
	}

	public int getSoles() {
		return soles;
	}

	public void aumentarSoles() {
		this.soles=soles+25;
	}
	
	public void disminuirSoles(int d) {
		soles -=d;
		if(soles<0)
			soles = 0;
	}
	
	public void setSoles(int soles) {
		this.soles = soles;
	}

	public String printGameState() {
		return state.printState();
	}

	public void setGrass(String string) {
		grass = string;
		
	}
	
	public String getGrass() {
		return grass;
	}
	

	public void moverProyectil(int fila) {
		misFilas[fila].getMisProyectiles().getFirst().moverProyectil();
	}
	
	public Entidad crearEntidad(int opcion,int x,int y) {
		Entidad aux = null;
		switch(opcion) {
		case 1:{
			entidadSeleccionada = miFactoria.crearPlantaCongeladora(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
			aux = entidadSeleccionada;
		}
		break;
		case 2:{
			entidadSeleccionada = miFactoria.crearPlantaGirasol(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
			aux = entidadSeleccionada;
		}
		break;
		case 3:{
			entidadSeleccionada = miFactoria.crearLanzaguisantes(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
			aux = entidadSeleccionada;
		}
		break;
		case 4:{
			entidadSeleccionada = miFactoria.crearPlantaMina(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
			aux = entidadSeleccionada;
		}
		break;
		case 5:{
			entidadSeleccionada = miFactoria.crearPlantaNuez(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
			aux = entidadSeleccionada;
		}
		break;
		case 6:{
			entidadSeleccionada = miFactoria.crearPlantaNuezAlta(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
			aux = entidadSeleccionada;
		}
		break;
		case 7:{
			entidadSeleccionada = miFactoria.crearPlantaSeta(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
			aux = entidadSeleccionada;
		}
		break;
		case 8:{
			aux = miFactoria.crearAngryZombie(x,y);
			misFilas[y/100].insertarZombie((ClassicZombie) aux);

		}
		break;
		case 9:{
			aux = miFactoria.crearBucketZombie(x,y);
			misFilas[y/100].insertarZombie((ClassicZombie) aux);
		}
		break;
		case 10:{
			aux = miFactoria.crearClassicZombie(x,y);
			misFilas[y/100].insertarZombie((ClassicZombie) aux);
		}
		break;
		case 11:{
			aux = miFactoria.crearConeZombie(x,y);
			misFilas[y/100].insertarZombie((ClassicZombie) aux);
		}
		break;
		case 12:{
			aux = miFactoria.crearFlagZombie(x,y);
			misFilas[y/100].insertarZombie((ClassicZombie) aux);
		}
		break;
		case 13:{
			aux = miFactoria.crearHolderZombie(x,y);
			misFilas[y/100].insertarZombie((ClassicZombie) aux);
		}
		break;
		case 14:{
			misFilas[y/100].insertarProyectil(miFactoria.crearProyectilClasico(x,y));
		}
		break;
		case 16:{
			entidadSeleccionada = miFactoria.crearPlantaGordaSeta(x,y);
			misFilas[y/100].insertarPlanta(entidadSeleccionada);
			disminuirSoles(entidadSeleccionada.getCosto());
			aux = entidadSeleccionada;
		}
		break;
		}
		return aux;
	}
	
	public boolean checkCollition(int fila) {
		if(!misFilas[fila].getMisZombies().isEmpty()) {
			for(ClassicZombie z : misFilas[fila].getMisZombies()) {
				for(Planta p : misFilas[fila].getMisPlantas()) {
					if(z.getMiRectangulo().intersects(p.getMiRectangulo())) {
						System.out.println("-------------COLISION CON PLANTA-----------");//ACA IMPLEMENTAR VISITOR
						return true;
					}
					if(z.getMiRectangulo().intersects(p.getMiProyectil().getMiRectangulo())) {
						System.out.println("-------------COLISION CON PROYECTIL-----------");//ACA IMPLEMENTAR VISITOR
						return true;
					}
				}

			}
		}
			
//			if(misFilas[fila].getMisZombies().getFirst().getMiRectangulo().intersects(misFilas[fila].getMisPlantas().getFirst().getMiRectangulo())) {
//				System.out.println("-------------COLISION-----------");//ACA IMPLEMENTAR VISITOR
//				return true;
//			}
//		}
		return false; 
		
	}
	
	public void generarRandomZombie() {
		int min_val = 8;
		int max_val = 13;
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		int randomEntidad = tlr.nextInt(min_val, max_val+1);
		int randomPosicion = tlr.nextInt(0, 6);
		Entidad nuevoZombie = crearEntidad(randomEntidad,910, randomPosicion*100);
		miGUI.ubicar(nuevoZombie.getMiEntidadGrafica().getMiLabel(),9,randomPosicion);
		System.out.println("Cree: zombie: " + nuevoZombie.getMiEntidadGrafica().getMiLabel().getIcon() +" en Fila: " + randomPosicion);
	}
	
	public void colocarPlanta(int opcion,int fila, int col) {
		Entidad nuevaPlanta = crearEntidad(opcion,fila*100,col*100) ;
		miGUI.ubicar(nuevaPlanta.getMiEntidadGrafica().getMiLabel(),fila,col);
	}
	
	public void avanzarZombies() {
		for(int i=0; i<6; i++) {
			for(ClassicZombie z : misFilas[i].getMisZombies()) {
				if(!misFilas[i].getMisZombies().isEmpty()) {
					z.mover();
				}
			}
		}
	}
	
	public void aparecerSol() {
		soles++;
	}
	
	public void controlarPlantas() {
		for(int i=0; i<6; i++) {
			for(Planta p : misFilas[i].getMisPlantas()) {
				if(!misFilas[i].getMisZombies().isEmpty()) {
					p.disparar();
					if(checkCollition(i)) {
						p.recibirDanio();
					}
				}
			}
		}
	}
		
	public void moverZombie(int fila) {
		misFilas[fila].getMisZombies().getFirst().mover();
	}
	
	public String getImgPath(int opcion) {
		switch(opcion) {
		case 1:
			return "plantaCongeladora.gif";
		case 2:
			return "Girasol.gif";
		case 3:
			return "plantaComun.gif";
		case 4:
			return "mina.gif";
		case 5:
			return "nuez.gif";
		case 6:
			return "nuezAlta.gif";
		case 7:
			return "seta.gif";
		case 8:
			return "AngryZombie.gif";
		case 9:
			return "BucketZombie.gif";
		case 10:
			return "ZombieClasico.gif";
		case 11:
			return "coneZombie.gif";
		case 12:
			return "ZombieBandera.gif";
		case 13:
			return "HolderZombie.gif";
		case 14:
			return "pea.png";
		case 15:
			return "pea.png";
		case 16:
			return "GordaSeta.gif";
		}
		return null;
	}
	
	public AbstractFactory getMiFactoria() {
		return miFactoria;
	}

	public void setMiFactoria(AbstractFactory miFactoria) {
		this.miFactoria = miFactoria;
	}

	public void eliminarZombie(int fila) {
		misFilas[fila].getMisZombies().removeFirst();
	}
	


}
