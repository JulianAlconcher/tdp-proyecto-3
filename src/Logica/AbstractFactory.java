package Logica;

import Plant.*;
import Zombie.*;

public interface AbstractFactory  {
	//PLANTAS
	public PlantaLanzaguisantes crearLanzaguisantes();
	public PlantaCongeladora crearPlantaCongeladora();
	public PlantaGirasol crearPlantaGirasol();
	public PlantaNuezAlta crearPlantaNuezAlta();
	
	//ZOMBIES
	public ClassicZombie crearZombieClasico();
	
}
