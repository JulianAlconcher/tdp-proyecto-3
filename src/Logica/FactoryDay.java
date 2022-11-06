package Logica;

import Plant.PlantaLanzaguisantes;

public class FactoryDay implements AbstractFactory{

	@Override
	public PlantaLanzaguisantes crearLanzaguisantes() {
		System.out.println("Planta Lanzaguisantes CREADA en MODO DIA");
		return new PlantaLanzaguisantes();
	}

	
	
	

}
