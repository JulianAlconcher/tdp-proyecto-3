package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		int code = e.getButton();
		if(code == MouseEvent.BUTTON1) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("Click izquierdo en posicion: x: " + x + ",y: " +  y);
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		int code = e.getButton();
		if(code == MouseEvent.BUTTON1) {
			//System.out.println("MANTENGO");
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int code = e.getButton();
		if(code == MouseEvent.BUTTON1) {
			//System.out.println("solte");
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
