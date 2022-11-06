package Logica;

import Plant.PlantaLanzaguisantes;

public class FactoryNight implements AbstractFactory {

	@Override
	public PlantaLanzaguisantes crearLanzaguisantes() {
		System.out.println("Planta Lanzaguisantes CREADA en MODO NOCHE");
		return new PlantaLanzaguisantes();
	}

}
