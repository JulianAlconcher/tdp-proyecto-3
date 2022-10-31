package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Celdas para Fondo
 * */
public class CeldaGrafica extends JLabel{
	protected ImageIcon imagen;
	
	public CeldaGrafica() {
		imagen = new ImageIcon(this.getClass().getResource("/Images/Fondo.png"));
		
	}
	public ImageIcon getImagen() {
		return imagen;
	}
	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}
	
	
}
