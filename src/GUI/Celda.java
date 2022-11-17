package GUI;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Celda extends JLabel{
	
	protected boolean ocupada;
	protected String imgPath;

	public Celda(String image) {
		ocupada = false;
		imgPath = image;
	}
	
	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	
	public String getImgPath() {
		return imgPath;
	}

}
