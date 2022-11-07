package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logica.Entidad;

@SuppressWarnings("serial")
public class Celda extends JLabel{
	
	protected int posX;
	protected int posY;
	protected ImageIcon img;
	protected String imgPath;
	protected Entidad miEntidad;

	public Celda(int x, int y) {
		posX = x;
		posY = y;
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	public Entidad getMiEntidad() {
		return miEntidad;
	}

	public void setMiEntidad(Entidad miEntidad) {
		this.miEntidad = miEntidad;
	}
}
