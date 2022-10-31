package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;

import Logica.Logica;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class GUI{

	protected JFrame frame;
	protected JPanel panelMenu;
	protected JPanel panelJuego;
	protected JButton btnJugar;
	protected Logica miLogica;
	protected CeldaGrafica matrizGrafica[][];
	protected ImageIcon imagenBoton;

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
		frame.setResizable(false);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		panelMenu = new JPanel();
		panelMenu.setBackground(Color.RED);
		frame.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);

		btnJugar = new JButton("Jugar");
		btnJugar.setBounds(389, 215, 157, 59);
		imagenBoton = new ImageIcon(this.getClass().getResource("/Images/BotonJugarPvZ.jpg"));
		btnJugar.setIcon(imagenBoton);
		panelMenu.add(btnJugar);

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
	}

	private void pintarMatriz() {
		for(int i = 0; i < miLogica.getFilas(); i++) {
			for(int j = 0; j < miLogica.getColumnas(); j++) {
				CeldaGrafica cg = new CeldaGrafica();
				cg.setIcon(cg.getImagen());
				panelJuego.add(cg);

			}
		}
	}
}
