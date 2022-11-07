package Logica;

import java.awt.Rectangle;

public abstract class Entidad implements Visitor{

	protected int miX;
	protected int miY;
	protected int miAncho;
	protected int miLargo;
	protected String imgPath;
	protected int costo;
	protected Rectangle miRectangulo;

	public Entidad(int x,int y, int a, int l) {
		miX = x;
		miY = y;
		miAncho = a;
		miLargo = l;
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
	
		
}