package Logica;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

import GUI.Celda;
import GUI.mainGUI;
import Plant.Planta;
import Plant.Proyectil;
import Plant.TimerShoot;
import Zombie.ClassicZombie;
import Zombie.TimerZombie;

public final class Logica {
	
	private static Logica miLogica;
	
	protected int filas;
	protected int columnas;
	protected State state;
	private int soles;
	private String grass;
	private final String obstaculo = "sand.png";
	protected AbstractFactory miFactoria;
	protected Fila[] misFilas;
	protected Planta entidadSeleccionada;
	protected mainGUI miGUI;
	protected TimerZombie miGeneradorZombie;
	protected SolGenerator misSoles;
	protected TimerShoot miControladorDeDisparo;
	private String nivelActual;
	private int mapaCeldasNumeros[][];
	private Celda tablero[][];

	private Logica(int n,int modo) {
		miGUI = mainGUI.getInstancia();
		nivelActual = getNivel(n);
	    state= new DayState(this);
	    grass= "PastoDia.png";
		filas = 6;
		columnas = 9;
		mapaCeldasNumeros = new int[filas][columnas];
		tablero = new Celda [filas][columnas];
		misFilas = new Fila[6];
		for(int i=0; i<6; i++) {
			misFilas[i] = new Fila();
		}
		entidadSeleccionada = null;
		if(modo == 0) {
			miFactoria = new FactoryDay();
			this.setDayState();
			misSoles = new SolGenerator(n,modo,this);
		}
		else {
			miFactoria = new FactoryNight();
			this.setNightState();
			misSoles = null;
			soles = 475;
		}
		miGeneradorZombie = new TimerZombie(n,modo,this);
		miControladorDeDisparo = new TimerShoot(n,modo,this);
		cargarMapa();
	}
	
	public static Logica getInstancia(int n, int modo) {
		if(miLogica == null)
			miLogica = new Logica(n,modo);
		return miLogica;
	}
	public void setDayState() {
		state.cambioDia();
	}
	
	public Celda getCelda(int i,int j) {
		return tablero[i][j];
	}
	
	public void setNightState() {
		state.cambioNoche();
	}
	public void setState(State state) {
		this.state=state;
	}
	

	public int getFilas() {
		return filas;
	}

	public String getNivel(int i) {
		int eleccion = i;
		switch(eleccion){
		case 0: 
			return "nivel1.txt";
		case 1:
			return "nivel2.txt";
		}
		return null;
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
	
	public void checkCollition(int fila) {
		if(!misFilas[fila].getMisZombies().isEmpty()) {
			for(ClassicZombie z : misFilas[fila].getMisZombies()) {
				for(Planta p : misFilas[fila].getMisPlantas()) {
					if(z.getMiRectangulo().intersects(p.getMiRectangulo())) {
						System.out.println("-------------COLISION CON PLANTA-----------");
						z.visit(p);						
					}
					if(!misFilas[fila].getMisProyectiles().isEmpty()) {
						for(Proyectil pr :misFilas[fila].getMisProyectiles()) {
							if(z.getMiRectangulo().intersects(pr.getMiRectangulo())) {
								System.out.println("-------------COLISION CON PROYECTIL-----------");
								pr.visit(z);
								misFilas[fila].eliminarProyectil(pr);
								miGUI.removerLabel(pr.getMiEntidadGrafica().getMiLabel());
								miGUI.repaint();
								break;
						}
						
						}	
					}
				}

			}
		}		
	}
	
	public void generarRandomZombie() {
		int min_val = 8;
		int max_val = 13;
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		int randomEntidad = tlr.nextInt(min_val, max_val+1);
		int randomPosicion = tlr.nextInt(0, 6);
		Entidad nuevoZombie = crearEntidad(randomEntidad,910, randomPosicion*100);
		miGUI.ubicar(nuevoZombie.getMiEntidadGrafica().getMiLabel(),9,randomPosicion);
	}
	
	public void colocarPlanta(int opcion,int fila, int col) {
		Entidad nuevaPlanta = crearEntidad(opcion,fila*100,col*100) ;
		miGUI.ubicar(nuevaPlanta.getMiEntidadGrafica().getMiLabel(),fila,col);
	}
	
	public void controlarZombies() {
		for(int i=0; i<6; i++) {
			for(ClassicZombie z : misFilas[i].getMisZombies()) {
				if(!misFilas[i].getMisZombies().isEmpty()) {
					z.mover();
					if(z.getMiX()<-4) {
						miGUI.gameOver();
					}
					if(z.getVida()<=0) {
						miGUI.removerLabel(z.getMiEntidadGrafica().getMiLabel());
						miGUI.repaint();
						misFilas[i].getMisZombies().remove(z);
						break;
					}
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
					for(ClassicZombie z : misFilas[i].getMisZombies()) {
						if(p.isDisparadora()){
							double distanciaZ = z.getMiRectangulo().getX();
							double distanciaP = p.getMiRectangulo().getX();
							if( distanciaZ< (distanciaP + p.getAlcance()) && distanciaZ > distanciaP) {
								Entidad aux = p.disparar();
								misFilas[p.getMiY()/100].insertarProyectil((Proyectil) aux);
								miGUI.ubicar(aux.getMiEntidadGrafica().getMiLabel(), p.getMiX()/100, p.getMiY()/100);
							}
						}
						if(p.getVida()<=0) {
							miGUI.removerLabel(p.getMiEntidadGrafica().getMiLabel());
							miGUI.repaint();
							misFilas[i].getMisPlantas().remove(p);
							break;
						}
					}
				}
			}
		}
	}
	
	
	public void moverProyectiles() {
		for(int i=0; i<6; i++) {
			for(Proyectil p : misFilas[i].getMisProyectiles()) {
				if(!misFilas[i].getMisProyectiles().isEmpty()) {
					if(p.getMiX()>=900) {
						misFilas[i].eliminarProyectil(p);
						break;
					}else {
					p.moverProyectil();
					}
					
				}

			}
		}
	}
	
	public void controlDeColisones() {
		for(int i=0; i<6; i++) {
				if(!misFilas[i].getMisZombies().isEmpty()) 
					checkCollition(i);
		}		
	}
	
	
	public AbstractFactory getMiFactoria() {
		return miFactoria;
	}

	public void setMiFactoria(AbstractFactory miFactoria) {
		this.miFactoria = miFactoria;
	}
	
	public void cargarMapa() {

		try {
			InputStream is = Logica.class.getClassLoader().getResourceAsStream("Niveles/" + nivelActual);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			int columna = 0;
			int fila = 0;
			while(columna < columnas && fila < filas) {
				String line = br.readLine();

					while(columna < columnas) {
						String numeros[] = line.split(" ");
						int n = Integer.parseInt(numeros[columna]);
						mapaCeldasNumeros[fila][columna] = n;
						switch(n) {
						case 0 :
							tablero[fila][columna] = new Celda(grass);
							tablero[fila][columna].setOcupada(false);
							break;
	
						case 1 : {
							tablero[fila][columna] = new Celda(obstaculo);
							tablero[fila][columna].setOcupada(true);
	
						}
						break;						
					}
						columna++;
					}
					if(columna == columnas) {
						columna = 0;
						fila++;
					
				}
			}
			br.close();

		} catch(Exception e) {e.printStackTrace();}

	}
	
	public void nuevoNivel() {
		nivelActual = "Nivel2.txt";
		cargarMapa();
		miGUI.nuevoNivel();
	}
	
}
