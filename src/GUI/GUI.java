package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;

import Logica.Logica;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class GUI implements Runnable{

	protected JFrame frame;
	protected JPanel panelMenu;
	protected JPanel panelJuego;
	protected JButton btnJugar;
	protected Logica miLogica;
	protected CeldaGrafica matrizGrafica[][];
	protected ImageIcon imagenBoton;
	protected ImageIcon imagenPortadaMenu;
	protected MouseHandler miMouse;

	/**
	 * Create the application.
	 */
	public GUI() {
		miLogica = new Logica();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 961, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		panelMenu = new JPanel();
		panelMenu.setBackground(Color.BLACK);
		frame.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);
		

		btnJugar = new JButton("Jugar");
		btnJugar.setBounds(391, 409, 182, 77);
		imagenBoton = new ImageIcon(this.getClass().getResource("/Images/BotonJugarPvZ.jpg"));
		btnJugar.setIcon(imagenBoton);
		panelMenu.add(btnJugar);
		
		JLabel lblImagenMenu = new JLabel("");
		lblImagenMenu.setBounds(0, 0, 947, 510);
		panelMenu.add(lblImagenMenu);
		imagenPortadaMenu = new ImageIcon(this.getClass().getResource("/Images/portada.png"));
		lblImagenMenu.setIcon(imagenPortadaMenu);

		panelJuego = new JPanel();
		panelJuego.setBackground(Color.PINK);
		frame.getContentPane().add(panelJuego);
		panelJuego.setLayout(null);
		panelJuego.setLayout(new GridLayout(miLogica.getFilas(), miLogica.getColumnas(), 0, 0));
		panelJuego.setVisible(false);
		pintarMatriz();

		btnJugar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelJuego.setVisible(true);
			}

		});
		panelJuego.setFocusable(true);
		miMouse = new MouseHandler();
		panelJuego.addMouseListener(miMouse);
	}

	private void pintarMatriz() {
		for(int i = 0; i < miLogica.getFilas(); i++) {
			for(int j = 0; j < miLogica.getColumnas(); j++) {
				CeldaGrafica cg = new CeldaGrafica();
				cg.setIcon(cg.getImagen());
				if(i==4 && j==0) {
					ImageIcon im = new ImageIcon(this.getClass().getResource("/Images/nuez.gif")); 
					cg.setIcon(im);
				}
				panelJuego.add(cg);
			}
		}
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
