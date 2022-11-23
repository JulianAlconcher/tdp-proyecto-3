package Logica;

import java.util.LinkedList;

import Plant.Planta;
import Plant.Proyectil;
import Plant.ProyectilClasico;
import Zombie.ClassicZombie;

public class Fila {
	protected LinkedList<Planta> misPlantas;
	protected LinkedList<ClassicZombie> misZombies;
	protected LinkedList<Proyectil> misProyectiles;
	
	public Fila() {
		misPlantas = new LinkedList<Planta>();
		misZombies = new LinkedList<ClassicZombie>();
		misProyectiles = new LinkedList<Proyectil>();
	}
	
	public void insertarPlanta(Planta p) {
		misPlantas.add(p);
	}
	
	public void insertarProyectil(Proyectil p) {
		misProyectiles.add(p);
	}
	
	public void insertarZombie(ClassicZombie p) {
		misZombies.add(p);
	}
	
	public LinkedList<Planta> getMisPlantas() {
		return misPlantas;
	}

	public void setMisPlantas(LinkedList<Planta> misPlantas) {
		this.misPlantas = misPlantas;
	}
	
	public void eliminarProyectil(Proyectil p) {
		misProyectiles.remove(p);
		
	}
	public LinkedList<ClassicZombie> getMisZombies() {
		return misZombies;
	}

	public void setMisZombies(LinkedList<ClassicZombie> misZombies) {
		this.misZombies = misZombies;
	}

	public LinkedList<Proyectil> getMisProyectiles() {
		return misProyectiles;
	}

	public void setMisProyectiles(LinkedList<Proyectil> misProyectiles) {
		this.misProyectiles = misProyectiles;
	}
}
