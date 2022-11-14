package Logica;

import Plant.*;
import Zombie.*;

public class FactoryNight implements AbstractFactory {


	@Override
	public PlantaCongeladora crearPlantaCongeladora(int x, int y) {
		return new PlantaCongeladora(x,y);
	}

	@Override
	public PlantaGirasol crearPlantaGirasol(int x, int y) {
		return new PlantaGirasol(x, y);
	}

	@Override
	public PlantaLanzaguisantes crearLanzaguisantes(int x, int y) {
		return new PlantaLanzaguisantes(x,y);
	}

	@Override
	public PlantaMina crearPlantaMina(int x, int y) {
		return new PlantaMina(x,y);
	}

	@Override
	public PlantaNuez crearPlantaNuez(int x, int y) {
		return new PlantaNuez(x,y);
	}

	@Override
	public PlantaNuezAlta crearPlantaNuezAlta(int x, int y) {
		return new PlantaNuezAlta(x,y);
	}

	@Override
	public PlantaSeta crearPlantaSeta(int x, int y) {
		return new PlantaSeta(x,y);
	}

	@Override
	public AngryZombie crearAngryZombie(int x, int y) {
		return new AngryZombie(x,y);
	}

	@Override
	public BucketZombie crearBucketZombie(int x, int y) {
		return new BucketZombie(x,y);
	}

	@Override
	public ClassicZombie crearClassicZombie(int x, int y) {
		return new ClassicZombie(x,y);
	}

	@Override
	public ConeZombie crearConeZombie(int x, int y) {
		return new ConeZombie(x,y);
	}

	@Override
	public FlagZombie crearFlagZombie(int x, int y) {
		return new FlagZombie(x,y);
	}

	@Override
	public HolderZombie crearHolderZombie(int x, int y) {
		return new HolderZombie(x,y);
	}

	@Override
	public ProyectilClasico crearProyectilClasico(int x, int y) {
		return new ProyectilClasico(x,y);
	}

	@Override
	public PlantaGordaSeta crearPlantaGordaSeta(int x, int y) {
		return new PlantaGordaSeta(x,y);
	}

	@Override
	public ProyectilCongelante crearProyectilCongelante(int x, int y) {
		return new ProyectilCongelante(x,y);
	}

}
