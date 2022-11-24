package Logica;

import Plant.*;
import Zombie.*;

public class FactoryDay implements AbstractFactory{

	@Override
	public PlantaCongeladora crearPlantaCongeladora(int x, int y,Fila f) {
		return new PlantaCongeladora(x,y,f);
	}

	@Override
	public PlantaGirasol crearPlantaGirasol(int x, int y,Fila f) {
		return new PlantaGirasol(x,y,f);
	}

	@Override
	public PlantaLanzaguisantes crearLanzaguisantes(int x, int y,Fila f) {
		return new PlantaLanzaguisantes(x,y,f);
	}

	@Override
	public PlantaMina crearPlantaMina(int x, int y,Fila f) {
		return new PlantaMina(x,y,f);
	}

	@Override
	public PlantaNuez crearPlantaNuez(int x, int y,Fila f) {
		return new PlantaNuez(x,y,f);
	}

	@Override
	public PlantaNuezAlta crearPlantaNuezAlta(int x, int y,Fila f) {
		return new PlantaNuezAlta(x,y,f);
	}

	@Override
	public PlantaSeta crearPlantaSeta(int x, int y,Fila f) {
		return null;
	}

	@Override
	public AngryZombie crearAngryZombie(int x, int y,Fila f) {
		return new AngryZombie(x,y,f);
	}

	@Override
	public BucketZombie crearBucketZombie(int x, int y,Fila f) {
		return new BucketZombie(x,y,f);
	}

	@Override
	public ClassicZombie crearClassicZombie(int x, int y,Fila f) {
		return new ClassicZombie(x,y,f);
	}

	@Override
	public ConeZombie crearConeZombie(int x, int y,Fila f) {
		return new ConeZombie(x,y,f);
	}

	@Override
	public NewsZombie crearNewsZombie(int x, int y,Fila f) {
		return new NewsZombie(x,y,f);
	}

	@Override
	public HolderZombie crearHolderZombie(int x, int y,Fila f) {
		return new HolderZombie(x,y,f);
	}

	@Override
	public PlantaGordaSeta crearPlantaGordaSeta(int x, int y,Fila f) {
		return null;
	}

	@Override
	public PlantaCactus crearPlantaCactus(int x, int y,Fila f) {
		return new PlantaCactus(x,y,f);
	}


}
