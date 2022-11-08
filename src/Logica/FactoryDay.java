package Logica;

import Plant.PlantaCongeladora;
import Plant.PlantaGirasol;
import Plant.PlantaLanzaguisantes;
import Plant.PlantaMina;
import Plant.PlantaNuez;
import Plant.PlantaNuezAlta;
import Plant.PlantaSeta;
import Zombie.AngryZombie;
import Zombie.BucketZombie;
import Zombie.ClassicZombie;
import Zombie.ConeZombie;
import Zombie.FlagZombie;
import Zombie.HolderZombie;

public class FactoryDay implements AbstractFactory{

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
	public PlantaLanzaguisantes crearLanzaguisantes() {
		return new PlantaLanzaguisantes();
	}

	@Override
	public PlantaMina crearPlantaMina() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlantaNuez crearPlantaNuez() {
		System.out.println("Cree planta nuez en MODO DIA");
		return new PlantaNuez();
	}

	@Override
	public PlantaNuezAlta crearPlantaNuezAlta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlantaSeta crearPlantaSeta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AngryZombie crearAngryZombie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BucketZombie crearBucketZombie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassicZombie crearZombieClasico() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConeZombie crearConeZombie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlagZombie crearFlagZombie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HolderZombie crearHolderZombie() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
	
	

}
