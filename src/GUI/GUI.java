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
import java.awt.Font;
import java.awt.FlowLayout;

public class GUI implements Runnable{

	protected JFrame frame;
	protected JPanel panelPrincipal;
	protected JButton btnJugar;
	protected Logica miLogica;
	protected JLabel matrizGrafica[][];
	protected ImageIcon imagenBoton;
	protected ImageIcon imagenPortadaMenu;
	protected MouseHandler miMouse;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel panelJuego;
	private JPanel panelMapa;
	private ImageIcon im;

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
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.BLACK);
		frame.getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		panelPrincipal.setBounds(frame.getBounds());

		btnJugar = new JButton("Jugar");
		btnJugar.setBounds(391, 409, 182, 77);
		imagenBoton = new ImageIcon(this.getClass().getResource("/Images/BotonJugarPvZ.jpg"));
		btnJugar.setIcon(imagenBoton);
		panelPrincipal.add(btnJugar);
		imagenPortadaMenu = new ImageIcon(this.getClass().getResource("/Images/PORTADA.jpg"));
		
		btnNewButton = new JButton("MODO DIA");
		btnNewButton.setBounds(583, 409, 110, 35);
		panelPrincipal.add(btnNewButton);
		
		btnNewButton_1 = new JButton("MODO NOCHE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.setBounds(583, 454, 110, 32);
		panelPrincipal.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("MANUAL");
		btnNewButton_2.setBounds(271, 409, 110, 35);
		panelPrincipal.add(btnNewButton_2);
		
		JLabel lblImagenMenu = new JLabel("");
		lblImagenMenu.setBounds(panelPrincipal.getBounds());
		panelPrincipal.add(lblImagenMenu);
		lblImagenMenu.setIcon(imagenPortadaMenu);
		
		panelJuego = new JPanel();
		frame.getContentPane().add(panelJuego, "name_843023529105300");
		panelJuego.setLayout(null);
		panelJuego.setBounds(frame.getBounds());
		panelMapa = new JPanel();
		panelMapa.setBorder(null);
		panelJuego.add(panelMapa);
		panelMapa.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_3 = new JButton("PLANTA 1");
		btnNewButton_3.setBounds(10, 10, 85, 47);
		panelJuego.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		btnNewButton_3_1.setBounds(105, 10, 85, 47);
		panelJuego.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("New button");
		btnNewButton_3_1_1.setBounds(200, 10, 85, 47);
		panelJuego.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_1_2 = new JButton("New button");
		btnNewButton_3_1_2.setBounds(295, 10, 85, 47);
		panelJuego.add(btnNewButton_3_1_2);
		
		JLabel lblNewLabel = new JLabel("SOLES: 15");
		lblNewLabel.setBounds(852, 10, 85, 47);
		panelJuego.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NIVEL: MODO:");
		lblNewLabel_1.setBounds(571, 10, 155, 33);
		panelJuego.add(lblNewLabel_1);

		im= new ImageIcon(this.getClass().getResource("/Images/fondo.png"));
		
		btnJugar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(false);
				panelJuego.setVisible(true);
			}

		});
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
			   panelMapa.add(jl);
		  }
	  }
		
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
