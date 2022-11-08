package Logica;

import Plant.*;
import Zombie.*;

public interface AbstractFactory  {
	//PLANTAS
	public PlantaCongeladora crearPlantaCongeladora();
	public PlantaGirasol crearPlantaGirasol();
	public PlantaLanzaguisantes crearLanzaguisantes();
	public PlantaMina crearPlantaMina();
	public PlantaNuez crearPlantaNuez();
	public PlantaNuezAlta crearPlantaNuezAlta();
	public PlantaSeta crearPlantaSeta();
	
	//ZOMBIES
	public AngryZombie crearAngryZombie();
	public BucketZombie crearBucketZombie();
	public ClassicZombie crearZombieClasico();
	public ConeZombie crearConeZombie();
	public FlagZombie crearFlagZombie();
	public HolderZombie crearHolderZombie();
}
