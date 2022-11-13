package Logica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EntidadGrafica{
	protected JLabel miLabel;
	protected ImageIcon im;
	
	public EntidadGrafica(String imgPath) {
		miLabel = new JLabel();
		im = new ImageIcon(this.getClass().getResource("/Images/"+imgPath));
		miLabel.setIcon(im);
	}
	
	public JLabel getMiLabel() {
		return miLabel;
	}

	public void setMiLabel(JLabel miLabel) {
		this.miLabel = miLabel;
	}

	public ImageIcon getIm() {
		return im;
	}

	public void setIm(ImageIcon im) {
		this.im = im;
	}
}
