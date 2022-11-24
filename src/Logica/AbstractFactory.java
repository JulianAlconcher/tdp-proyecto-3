package Logica;

import Plant.*;
import Zombie.*;

public interface AbstractFactory  {
	//PLANTAS
	public PlantaCongeladora crearPlantaCongeladora(int x,int y,Fila f);
	public PlantaGirasol crearPlantaGirasol(int x,int y,Fila f);
	public PlantaLanzaguisantes crearLanzaguisantes(int x,int y,Fila f);
	public PlantaMina crearPlantaMina(int x,int y,Fila f);
	public PlantaCactus crearPlantaCactus(int x,int y,Fila f);
	public PlantaNuez crearPlantaNuez(int x,int y,Fila f);
	public PlantaNuezAlta crearPlantaNuezAlta(int x,int y,Fila f);
	public PlantaSeta crearPlantaSeta(int x,int y,Fila f);
	public PlantaGordaSeta crearPlantaGordaSeta(int x, int y,Fila f);
	
	//ZOMBIES
	public AngryZombie crearAngryZombie(int x,int y,Fila f);
	public BucketZombie crearBucketZombie(int x,int y,Fila f);
	public ClassicZombie crearClassicZombie(int x,int y,Fila f);
	public ConeZombie crearConeZombie(int x,int y,Fila f);
	public NewsZombie crearNewsZombie(int x,int y,Fila f);
	public HolderZombie crearHolderZombie(int x,int y,Fila f);

}
