package Logica;

import java.awt.Rectangle;

import GUI.mainGUI;

public abstract class Entidad{

	protected int miX;
	protected int miY;
	protected String imgPath;
	protected int costo;
	protected Rectangle miRectangulo;
	protected mainGUI miGUI;
	protected Logica miLogica;
	protected EntidadGrafica miEntidadGrafica;
	protected Fila miFila;

	public Entidad(int x,int y,Fila f) {
		miX = x;
		miY = y;
		miRectangulo = new Rectangle(miX,miY,100,100);
		miEntidadGrafica = null;
		miFila = f;
		miGUI = mainGUI.getInstancia();
		miLogica= Logica.getInstancia(0);
	}
	
	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public int getMiX() {
		return miX;
	}

	public void setMiX(int miX) {
		this.miX = miX;
	}

	public int getMiY() {
		return miY;
	}

	public void setMiY(int miY) {
		this.miY = miY;
	}
	
	public Rectangle getMiRectangulo() {
		return miRectangulo;
	}

	public void setMiRectangulo(Rectangle miRectangulo) {
		this.miRectangulo = miRectangulo;
	}
	
	public EntidadGrafica getMiEntidadGrafica() {
		return miEntidadGrafica;
	}

	public void setMiEntidadGrafica(EntidadGrafica miEntidadGrafica) {
		this.miEntidadGrafica = miEntidadGrafica;
	}
	
		
}