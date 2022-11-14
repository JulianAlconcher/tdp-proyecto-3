package Zombie;

import Logica.Entidad;
import Logica.EntidadGrafica;
import Plant.Planta;
import Plant.PlantaCongeladora;
import Plant.PlantaGirasol;
import Plant.PlantaGordaSeta;
import Plant.PlantaLanzaguisantes;
import Plant.PlantaMina;
import Plant.PlantaNuez;
import Plant.PlantaNuezAlta;
import Plant.PlantaSeta;

public class ClassicZombie extends Entidad implements VisitorZombie{
	protected int vida;
	protected int velocidad;

	public ClassicZombie(int x,int y) {
		super(x,y);
		imgPath = "ZombieClasico.gif";
		miEntidadGrafica = new EntidadGrafica(imgPath);
		this.vida = 75;
		this.velocidad = miX;
	}

	public void mover() {
		miX -=2;
		this.miRectangulo.setBounds(miX, miY, 100, 100);
		miGUI.moverZombie(miEntidadGrafica.getMiLabel(), miX, miY);
	}

	public void morir() {
		this.vida = 0;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void recibirDanio(int d) {
		this.vida -= 25;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public void visit(Planta p) {
		p.recibirDanio();
		
	}

	@Override
	public void accept(VisitorZombie v) {
		// TODO Auto-generated method stub
		
	}



}
