package Logica;

import Plant.*;
import Zombie.*;

public interface AbstractFactory  {
	//PLANTAS
	public PlantaCongeladora crearPlantaCongeladora(int x,int y);
	public PlantaGirasol crearPlantaGirasol(int x,int y);
	public PlantaLanzaguisantes crearLanzaguisantes(int x,int y);
	public PlantaMina crearPlantaMina(int x,int y);
	public PlantaCactus crearPlantaCactus(int x,int y);
	public PlantaNuez crearPlantaNuez(int x,int y);
	public PlantaNuezAlta crearPlantaNuezAlta(int x,int y);
	public PlantaSeta crearPlantaSeta(int x,int y);
	public PlantaGordaSeta crearPlantaGordaSeta(int x, int y);
	
	//ZOMBIES
	public AngryZombie crearAngryZombie(int x,int y);
	public BucketZombie crearBucketZombie(int x,int y);
	public ClassicZombie crearClassicZombie(int x,int y);
	public ConeZombie crearConeZombie(int x,int y);
	public NewsZombie crearNewsZombie(int x,int y);
	public HolderZombie crearHolderZombie(int x,int y);

}
