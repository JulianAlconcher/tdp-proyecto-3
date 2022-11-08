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
import java.awt.Image;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class mainGUI extends JFrame implements Runnable {

	private JPanel contentPane;
	protected final int cantFilas = 6;
	protected final int cantColumnas = 9;
	protected Logica miLogica;
	protected JLabel matrizGrafica[][];
	protected ImageIcon imagenPortadaMenu;
	protected MouseHandler miMouse;
	protected JPanel menuPanel;
	protected JPanel inGamePanel;
	protected JPanel mapPanel;
	protected JLabel lblCantSoles;
	protected JLabel lblSol;
	public Thread hiloJuego;
	private AudioPlayer ap;
	private Thread hiloMusica;
	protected int velocidad = 2;
	protected boolean gameStart = false;
	protected JButton btnPlanta1;
	protected JButton btnPlanta2;
	protected JButton btnPlanta3;
	protected JButton btnPlanta4;
	protected int seleccionNivel,seleccionModo;
	protected int opcion = 0;
	//DE PRUEBA
	protected int Direccion = 300;
	protected JLabel proyectil; 

	public mainGUI() {
		miMouse = new MouseHandler();
		matrizGrafica = new JLabel[cantFilas][cantColumnas];
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937, 766);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		Image imagenPrincipal = Toolkit.getDefaultToolkit().getImage(mainGUI.class.getResource("/Images/logoImage.png"));
		setIconImage(imagenPrincipal);
		setTitle("Plants vs Zombies: Beta Version");
		

		menuPanel = new JPanel();
		menuPanel.setBackground(new Color(0, 0, 0));
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);
		imagenPortadaMenu = new ImageIcon(this.getClass().getResource("/Images/portada.png"));
		inGamePanel = new JPanel();
		contentPane.add(inGamePanel);
		inGamePanel.setLayout(null);
		mapPanel = new JPanel();
		mapPanel.setBackground(new Color(0, 255, 0));
		mapPanel.setBounds(10, 121, 900, 600);
		mapPanel.setOpaque(false);
		inGamePanel.add(mapPanel);
		inGamePanel.setVisible(false);
		mapPanel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black));
		mapPanel.setLayout(null);

		//Seteo GUI en el medio de la pantalla.
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		setLocation(x, y);
		this.setResizable(false);	

		btnPlanta1 = new JButton("");
		btnPlanta1.setBounds(10, 10, 65, 89);
		inGamePanel.add(btnPlanta1);
		btnPlanta1.setIcon(new ImageIcon(this.getClass().getResource("/Images/comun.png")));
		btnPlanta1.setEnabled(false);
		btnPlanta1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				opcion = 3;
			}
		});

		btnPlanta2 = new JButton("");
		btnPlanta2.setBounds(105, 10, 65, 89);
		inGamePanel.add(btnPlanta2);
		btnPlanta2.setIcon(new ImageIcon(this.getClass().getResource("/Images/girasol.png")));
		btnPlanta2.setEnabled(false);
		btnPlanta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					opcion = 2;
					
				}
			});

		btnPlanta3 = new JButton("");
		btnPlanta3.setBounds(200, 10, 65, 89);
		inGamePanel.add(btnPlanta3);
		btnPlanta3.setIcon(new ImageIcon(this.getClass().getResource("/Images/Nuez.png")));
		btnPlanta3.setEnabled(false);
		btnPlanta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					opcion = 5;
					
				}
			});

		btnPlanta4 = new JButton("");
		btnPlanta4.setBounds(295, 10, 65, 89);
		inGamePanel.add(btnPlanta4);
		btnPlanta4.setIcon(new ImageIcon(this.getClass().getResource("/Images/congeladora.png")));
		btnPlanta4.setEnabled(false);

		JButton btnVolverMenu = new JButton("MENU");
		btnVolverMenu.setBounds(807, 10, 103, 101);
		inGamePanel.add(btnVolverMenu);

		btnVolverMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuPanel.setVisible(true);
				inGamePanel.setVisible(false);
			}

		});


		lblSol = new JLabel("");
		lblSol.setBounds(627, 0, 80, 89);
		inGamePanel.add(lblSol);
		lblSol.setIcon(new ImageIcon(this.getClass().getResource("/Images/sun.png")));

		lblCantSoles = new JLabel("0");
		lblCantSoles.setFont(new Font("Cambria Math", Font.BOLD, 15));
		lblCantSoles.setBounds(652, 78, 55, 25);
		inGamePanel.add(lblCantSoles);
		lblCantSoles.setText("0");

		JButton btnPruebaAumentarSol = new JButton("CLICKEAME");
		btnPruebaAumentarSol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miLogica.aumentarSoles();
				lblCantSoles.setText("  " + miLogica.getSoles());
			}
		});
		btnPruebaAumentarSol.setBounds(530, 68, 85, 40);
		inGamePanel.add(btnPruebaAumentarSol);
//
//		JLabel lblMododeJuego = new JLabel("MODO:");
//		lblMododeJuego.setBounds(468, 10, 123, 25);
//		inGamePanel.add(lblMododeJuego);

		//BOTONES DE MENU
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.setFont(new Font("Kozuka Gothic Pro R", Font.BOLD, 17));
		btnJugar.setBounds(339, 510, 250, 114);
		menuPanel.add(btnJugar);
		btnJugar.setForeground(Color.black);
	    btnJugar.setOpaque(false);
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionNivel = JOptionPane.showOptionDialog(menuPanel,"Seleccione el nivel de dificultad", ""
						,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] { "NIVEL 1", "NIVEL 2"},"opcion1"); 
				seleccionModo = JOptionPane.showOptionDialog(menuPanel,"Seleccione el modo de juego", ""
							,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] { "MODO DIA", "MODO NOCHE"},"opcion1"); 
				
				iniciarNuevoJuego(seleccionNivel,seleccionModo);
				audioOn();
									
			}
			
		});	

		JButton btnManual = new JButton("MANUAL");
		btnManual.setBounds(466, 626, 123, 52);
		menuPanel.add(btnManual);
		btnManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "MANUAL EN CONSTRUCCION";
				JOptionPane.showMessageDialog(null, message, "Manual", JOptionPane.INFORMATION_MESSAGE,null);
			}
		});

		btnManual.setEnabled(false);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(339, 626, 123, 52);
		menuPanel.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

		JLabel lblImageMenu = new JLabel("");
		lblImageMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblImageMenu.setBounds(0, 0, 921, 727);
		menuPanel.add(lblImageMenu);
		lblImageMenu.setIcon(imagenPortadaMenu);


		mapPanel.addMouseListener(miMouse);
		mapPanel.addMouseMotionListener(miMouse);


	}




	private void pintarMatriz() {
		for(int i=0;i<cantFilas;i++) {
			for(int j=0;j<cantColumnas;j++) {
				matrizGrafica[i][j] = new JLabel();
				ImageIcon im = new ImageIcon(this.getClass().getResource("/Images/"+miLogica.getGrass()));	
				matrizGrafica[i][j].addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {onMouseClicked(e);}});
				matrizGrafica[i][j].setIcon(im);
				mapPanel.add(matrizGrafica[i][j]);
				matrizGrafica[i][j].setBounds(j*100, i*100, 100, 100);
		
			}
		}
	}
	
	private void repintar() {
        for(int i=0;i<cantFilas;i++) {
            for(int j=0;j<cantColumnas;j++) {
                ImageIcon im= new ImageIcon(this.getClass().getResource("/Images/"+miLogica.getGrass()));
                matrizGrafica[i][j].setIcon(im);
            }
        }
    }
	
	private void onMouseClicked(MouseEvent e) {
		for(int i=0;i<cantFilas;i++) {
			for(int j=0;j<cantColumnas;j++) {
				if (e.getSource() == matrizGrafica[i][j] && opcion!=0) {
					System.out.println("Label x: " + i + " y: " +  j + " fue clickedo");
					JLabel nuevaEntidad = new JLabel();
					miLogica.crearPlanta(opcion);
					ImageIcon im= new ImageIcon(this.getClass().getResource("/Images/"+miLogica.getImgPath(opcion)));
					nuevaEntidad.setIcon(im);
					mapPanel.add(nuevaEntidad);
					mapPanel.setComponentZOrder(nuevaEntidad, 0);
					nuevaEntidad.setBounds(j*100, i*100, 100, 100);
    				lblCantSoles.setText(" " + miLogica.getSoles());
    				opcion = 0;
    				
                }
            }
        }
    }
	
	private void audioOn() {
		ap= new AudioPlayer("Audio/DayMusic.mp3");
		hiloMusica= new Thread(ap);
		hiloMusica.start();
	}
	
	private void movingPea() {
		ImageIcon im= new ImageIcon(this.getClass().getResource("/Images/pea.png"));
		proyectil = new JLabel();
		proyectil.setIcon(im);
		mapPanel.add(proyectil);
		proyectil.setBounds(200, 500, 100, 100);
		mapPanel.setComponentZOrder(proyectil, 0);

	}
	
	private void administrarPlantas() {
		if(miLogica.getSoles()>=50) {
			btnPlanta2.setEnabled(true);
			btnPlanta3.setEnabled(true);
		}
		else {
			btnPlanta2.setEnabled(false);
			btnPlanta3.setEnabled(false);	
		}
			if(miLogica.getSoles()>=100) 
				btnPlanta1.setEnabled(true);
			else
				btnPlanta1.setEnabled(false);
				if(miLogica.getSoles()>=175) 
					btnPlanta4.setEnabled(true);  
				else
					btnPlanta4.setEnabled(false);  
				
	}


	private void iniciarNuevoJuego(int nivel, int modo) {
		miLogica = new Logica(nivel,modo);
	
		menuPanel.setVisible(false);
		inGamePanel.setVisible(true);
		lblCantSoles.setText("" + miLogica.getSoles());
		hiloJuego = new Thread (this);
		hiloJuego.start();
		gameStart = true;
		pintarMatriz();

		
	}
	


	@Override
	public void run() {
		while(gameStart) {
			update();
		try {
			Thread.sleep(velocidad);
		} catch (InterruptedException e) {e.printStackTrace();}	

		}
	}
	

	public void update() {
		administrarPlantas();
		Direccion++;
		if(Direccion == 900) {
			Direccion = 60;
		}
		//proyectil.setBounds(Direccion, 280, 100, 100);
	}
}
