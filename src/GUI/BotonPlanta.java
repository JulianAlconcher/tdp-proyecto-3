package GUI;

import javax.swing.JButton;

public class BotonPlanta extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int costo;
	
	public BotonPlanta(int c) {
		costo = c;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
}
