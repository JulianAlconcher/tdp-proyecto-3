package Logica;

import Plant.PlantaCongeladora;
import Plant.PlantaGirasol;
import Plant.PlantaLanzaguisantes;
import Plant.PlantaNuez;
import Plant.PlantaNuezAlta;
import Zombie.ClassicZombie;

public class FactoryNight implements AbstractFactory {

	@Override
	public PlantaLanzaguisantes crearLanzaguisantes() {
		System.out.println("Planta Lanzaguisantes CREADA en MODO NOCHE");
		return new PlantaLanzaguisantes();
	}

	@Override
	public PlantaCongeladora crearPlantaCongeladora() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlantaGirasol crearPlantaGirasol() {
		return new PlantaGirasol();
	}

	@Override
	public ClassicZombie crearZombieClasico() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlantaNuezAlta crearPlantaNuezAlta() {
		// TODO Auto-generated method stub
		return new PlantaNuezAlta();
	}

	@Override
	public PlantaNuez crearPlantaNuez() {
		return new PlantaNuez();
	}

}
