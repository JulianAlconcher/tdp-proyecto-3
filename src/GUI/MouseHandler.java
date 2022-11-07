package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseHandler implements MouseListener,MouseMotionListener{
	
	protected int miPosX;
	protected int miPosY;
	protected boolean click = false;

	@Override
	public void mouseClicked(MouseEvent e) {
		int code = e.getButton();
		if(code == MouseEvent.BUTTON1) {
			int x = e.getX();
			int y = e.getY();
			miPosX = x;
			miPosY = y;
			click = true;
			System.out.println("Click es :" + click);
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

	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK)
			System.out.println("AYAYAYAY ME ESTOY MOVIENDOOOOOOOOOOO");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}
	
	public int getMiPosX() {
		return miPosX;
	}

	public void setMiPosX(int miPosX) {
		this.miPosX = miPosX;
	}

	public int getMiPosY() {
		return miPosY;
	}

	public void setMiPosY(int miPosY) {
		this.miPosY = miPosY;
	}
	
	public boolean isClick() {
		return click;
	}

	public void setClick(boolean click) {
		this.click = click;
	}

	
	

}
