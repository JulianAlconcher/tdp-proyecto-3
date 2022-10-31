package Logica;

import java.util.LinkedList;

import Plant.Planta;

public class PlantsHandler {
	
	protected int cantidadMaxima;
	protected int cantidadActual;
	protected int cantidadEnergia;
	protected LinkedList<Planta> listaPlantas;
	
	public PlantsHandler() {
		cantidadMaxima = 5;
		cantidadActual = 0;
	}

	public int getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	public int getEnergia() {
		return cantidadEnergia;
	}
	
	public void setEnergia(int c) {
		cantidadEnergia = c;
	}
	
//	public void sacarPlanta(Planta p) {
//		listaPlantas.remove(p);
//	}
//	
	
	/**
	 * Retorna verdadero si es posible comprar la planta
	 * @param p: planta a comprar
	 * @return
	 */
	public boolean estadoPlanta(Planta p) {
		return p.getCosto() < cantidadEnergia; 
	}
	
	

}
