package Logica;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GUI.mainGUI;

public class Sol {
	protected JLabel miLabel;
	protected ImageIcon im;
	protected mainGUI miGUI;
	protected boolean toco;
	
	public Sol() {
		miGUI = new mainGUI("");
		miLabel = new JLabel();
		im = new ImageIcon(this.getClass().getResource("/Images/sun.gif"));
		miLabel.setIcon(im);
		miLabel.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {tocaronSol(e);}});
		toco = false;
	}
	
	public void tocaronSol(MouseEvent e) {
		if(e.getSource() == miLabel)
			toco = true;
	}
	public void colocarSol() {
		int min_val_fila = 0;
		int max_val_fila = 5;
		
		int min_val_col = 0;
		int max_val_col = 8;
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		int randomFila = tlr.nextInt(min_val_fila, max_val_fila+1);
		int randomCol = tlr.nextInt(min_val_col, max_val_col);
		miGUI.ubicar(miLabel,randomCol,randomFila);
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
	
	public boolean getToco() {
		return toco;
	}

	public void setToco(boolean toco) {
		this.toco = toco;
	}

}
