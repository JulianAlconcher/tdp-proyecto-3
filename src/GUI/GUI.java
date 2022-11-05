package GUI;

import javax.swing.JFrame;
import Logica.Logica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GUI implements Runnable{

	protected JFrame frame;
	protected Logica miLogica;
	protected JLabel matrizGrafica[][];
	protected ImageIcon imagenBoton;
	protected ImageIcon imagenPortadaMenu;
	protected MouseHandler miMouse;
	private ImageIcon im;

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	    
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		imagenBoton = new ImageIcon(this.getClass().getResource("/Images/BotonJugarPvZ.jpg"));

		im= new ImageIcon(this.getClass().getResource("/Images/fondo.png"));
		miMouse = new MouseHandler();
		 
		matrizGrafica= new JLabel[miLogica.getFilas()][miLogica.getColumnas()];
		pintarMatriz();
		
	}

	private void pintarMatriz() {
	  for(int i=0;i<miLogica.getFilas();i++) {
		  for(int j=0;j<miLogica.getColumnas();j++) {
			   JLabel jl= new JLabel();
			   jl.setIcon(im);
			   matrizGrafica[i][j]=jl;
			   //panelMapa.add(jl);
		  }
	  }
		
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
