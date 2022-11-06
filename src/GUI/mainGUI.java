package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Logica.Logica;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class mainGUI extends JFrame implements Runnable {

	private JPanel contentPane;
	protected Logica miLogica;
	protected JLabel matrizGrafica[][];
	protected ImageIcon imagenBoton;
	protected ImageIcon imagenPortadaMenu;
	protected MouseHandler miMouse;
	protected JPanel menuPanel;
	protected JPanel inGamePanel;
	protected JPanel mapPanel;
	protected JLabel lblCantSoles;

	public mainGUI() {
		miLogica= new Logica();
		matrizGrafica = new JLabel[miLogica.getFilas()][miLogica.getColumnas()];
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		Image imagenPrincipal = Toolkit.getDefaultToolkit().getImage(mainGUI.class.getResource("/Images/logoImage.png"));
		setIconImage(imagenPrincipal);

		menuPanel = new JPanel();
		menuPanel.setBackground(new Color(255, 0, 0));
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);
		imagenPortadaMenu = new ImageIcon(this.getClass().getResource("/Images/portada.png"));


		inGamePanel = new JPanel();
		contentPane.add(inGamePanel);
		inGamePanel.setLayout(null);

		mapPanel = new JPanel();
		mapPanel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

			}
		});
		mapPanel.setBackground(Color.BLACK);
		mapPanel.setBounds(10, 121, 1046, 552);
		inGamePanel.add(mapPanel);
		inGamePanel.setVisible(false);
		mapPanel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black));
		mapPanel.setLayout(new GridLayout(miLogica.getFilas(), miLogica.getColumnas(), 0, 0));

		//Seteo GUI en el medio de la pantalla.
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		setLocation(x, y);
		this.setResizable(false);	

		JButton btnPlanta1 = new JButton("");
		btnPlanta1.setBounds(10, 10, 65, 89);
		inGamePanel.add(btnPlanta1);
		btnPlanta1.setIcon(new ImageIcon(this.getClass().getResource("/Images/comun.png")));
		btnPlanta1.setEnabled(false);
		btnPlanta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miLogica.getMiFactoria().crearLanzaguisantes();
			}
		});

		JButton btnPlanta2 = new JButton("");
		btnPlanta2.setBounds(105, 10, 65, 89);
		inGamePanel.add(btnPlanta2);
		btnPlanta2.setIcon(new ImageIcon(this.getClass().getResource("/Images/girasol.png")));
		btnPlanta2.setEnabled(false);

		JButton btnPlanta3 = new JButton("");
		btnPlanta3.setBounds(200, 10, 65, 89);
		inGamePanel.add(btnPlanta3);
		btnPlanta3.setIcon(new ImageIcon(this.getClass().getResource("/Images/Nuez.png")));
		btnPlanta3.setEnabled(false);

		JButton btnPlanta4 = new JButton("");
		btnPlanta4.setBounds(295, 10, 65, 89);
		inGamePanel.add(btnPlanta4);
		btnPlanta4.setIcon(new ImageIcon(this.getClass().getResource("/Images/congeladora.png")));
		btnPlanta4.setEnabled(false);

		JButton btnVolverMenu = new JButton("MENU");
		btnVolverMenu.setBounds(953, 10, 103, 101);
		inGamePanel.add(btnVolverMenu);

		JLabel lblSol = new JLabel("");
		lblSol.setBounds(750, 0, 80, 89);
		inGamePanel.add(lblSol);
		lblSol.setIcon(new ImageIcon(this.getClass().getResource("/Images/sun.png")));

		lblCantSoles = new JLabel("0");
		lblCantSoles.setFont(new Font("Cambria Math", Font.BOLD, 15));
		lblCantSoles.setBounds(775, 86, 55, 25);
		inGamePanel.add(lblCantSoles);
		lblCantSoles.setText("  " + miLogica.getSoles());

		JButton btnPruebaAumentarSol = new JButton("CLICKEAME");
		btnPruebaAumentarSol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miLogica.aumentarSoles();
				lblCantSoles.setText("  " + miLogica.getSoles());
				if(miLogica.getSoles()>=50) {
					btnPlanta2.setEnabled(true);
					btnPlanta3.setEnabled(true);
					if(miLogica.getSoles()>=100) {
						btnPlanta1.setEnabled(true);
						if(miLogica.getSoles()>=175) {
							btnPlanta4.setEnabled(true);       //ESTO ESTA PESIMO, ES SOLO A MODO DE PRUEBA 
						}
					}
				}
			}
		});
		btnPruebaAumentarSol.setBounds(655, 71, 85, 40);
		inGamePanel.add(btnPruebaAumentarSol);

		JLabel lblMododeJuego = new JLabel("MODO:" + miLogica.printGameState());
		lblMododeJuego.setBounds(578, 10, 123, 25);
		inGamePanel.add(lblMododeJuego);

		btnVolverMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuPanel.setVisible(true);
				inGamePanel.setVisible(false);
			}

		});

		//BOTONES DE MENU
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.setFont(new Font("Morganite", Font.BOLD, 99));
		btnJugar.setBounds(411, 526, 253, 114);
		menuPanel.add(btnJugar);
		btnJugar.setForeground(Color.black);
	    btnJugar.setOpaque(false);
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarNuevoJuego();
			}

		});	


		JButton btnModoDia = new JButton("MODO DIA");
		btnModoDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miLogica = new Logica();
				miLogica.setDayState();		
				lblMododeJuego.setText("MODO: " + miLogica.printGameState());
				System.out.println(miLogica.getGrass());
				repintar();
			}
		});
		btnModoDia.setBounds(676, 526, 158, 52);
		menuPanel.add(btnModoDia);

		JButton btnModoNoche = new JButton("MODO NOCHE");
		btnModoNoche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miLogica = new Logica();
				miLogica.setNightState();
				lblMododeJuego.setText("MODO: " + miLogica.printGameState());
				System.out.println(miLogica.getGrass());
				repintar();
			}
		});
		btnModoNoche.setBounds(676, 591, 158, 52);
		menuPanel.add(btnModoNoche);

		JButton btnManual = new JButton("MANUAL");
		btnManual.setBounds(241, 526, 158, 52);
		menuPanel.add(btnManual);
		btnManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "MANUAL EN CONSTRUCCION";
				JOptionPane.showMessageDialog(null, message, "Manual", JOptionPane.INFORMATION_MESSAGE,null);
			}
		});


		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(241, 588, 158, 52);
		menuPanel.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

		JLabel lblImageMenu = new JLabel("");
		lblImageMenu.setBounds(0, 0, 1080, 720);
		menuPanel.add(lblImageMenu);
		lblImageMenu.setIcon(imagenPortadaMenu);

		miMouse = new MouseHandler();
		mapPanel.addMouseListener(miMouse);
		mapPanel.addMouseMotionListener(miMouse);

		//matrizGrafica= new JLabel[miLogica.getFilas()][miLogica.getColumnas()];
		pintarMatriz();
	}




	private void pintarMatriz() {
		for(int i=0;i<miLogica.getFilas();i++) {
			for(int j=0;j<miLogica.getColumnas();j++) {
				matrizGrafica[i][j] = new JLabel();
				ImageIcon im= new ImageIcon(this.getClass().getResource("/Images/"+miLogica.getGrass()));
				matrizGrafica[i][j].setIcon(im);
				mapPanel.add(matrizGrafica[i][j]);
			}
		}
	}

	private void repintar() {
		for(int i=0;i<miLogica.getFilas();i++) {
			for(int j=0;j<miLogica.getColumnas();j++) {
				ImageIcon im= new ImageIcon(this.getClass().getResource("/Images/"+miLogica.getGrass()));
				matrizGrafica[i][j].setIcon(im);
			}
		}
	}
	
	private void iniciarNuevoJuego() {
		miLogica= new Logica();
		menuPanel.setVisible(false);
		inGamePanel.setVisible(true);
		lblCantSoles.setText("0");
	}
	

	@Override
	public void run() {

	}
}
