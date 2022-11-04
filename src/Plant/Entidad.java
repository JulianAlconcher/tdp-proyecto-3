package Plant;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import Logica.Visitor;

@SuppressWarnings("serial")
public abstract class Entidad extends Rectangle implements Visitor {
	
	protected double x;
	protected double y;
	protected int ancho;
	protected int largo;
	protected BufferedImage img;
	protected String imgPath;
	
	public Entidad(int x, int y, int anchoRec, int largoRec) {
		this.x = x; 
		this.y = y;
		this.ancho = anchoRec;
		this.largo = largoRec;
	}
	
	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}
	
	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}
}
