package GUI;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Celda extends JLabel{
	
	protected boolean ocupada;

	public Celda() {
		ocupada = false;
	}
	
	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

}
