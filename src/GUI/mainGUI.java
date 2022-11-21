package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

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
public final class mainGUI extends JFrame implements Runnable {
		
	private static mainGUI miGUI;

	private JPanel contentPane;
	protected final int cantFilas = 6;
	protected final int cantColumnas = 9;
	protected Logica miLogica;
	protected Celda matrizGrafica[][];
	protected ImageIcon imagenPortadaMenu;
	protected JPanel menuPanel;
	protected JPanel inGamePanel;
	protected JPanel mapPanel;
	protected JLabel lblCantSoles;
	protected JLabel lblSol;
	protected JLabel lblImageMap;
	protected ImageIcon nightMap,dayMap;
	public Thread hiloJuego;
	private AudioPlayer ap;
	private Thread hiloMusica;
	protected int velocidad = 100;
	protected boolean gameStart = false;
	protected JButton btnPlanta1;
	protected JButton btnPlanta2;
	protected JButton btnPlanta3;
	protected JButton btnPlanta4;
	protected JButton btnPlanta5;
	protected JButton btnPlanta6;
	protected JButton btnPlanta7;
	protected JButton btnPlanta8;
	protected JToggleButton btnAudio;
	protected int seleccionNivel,seleccionModo;
	protected int opcion = 0;
	protected JLabel lblNuevaHorda;
	protected JLabel lblNuevoNivel;

	private mainGUI() {
		initialize();
	}
		
	public static mainGUI getInstancia() {
		if(miGUI == null)
			miGUI = new mainGUI();
		return miGUI;
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 930);
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
		imagenPortadaMenu = new ImageIcon(this.getClass().getResource("/Images/portada2.png"));
		inGamePanel = new JPanel();
		contentPane.add(inGamePanel);
		inGamePanel.setLayout(null);

		lblImageMap = new JLabel("");
		lblImageMap.setBounds(10, 111, 1264, 780);
		inGamePanel.add(lblImageMap);
		nightMap = new ImageIcon(this.getClass().getResource("/Images/nightMap.png"));
		dayMap = new ImageIcon(this.getClass().getResource("/Images/Map.png"));
		inGamePanel.setVisible(false);

		//Seteo GUI en el medio de la pantalla.
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		setLocation(x, y);
		this.setResizable(false);	

		btnPlanta1 = new JButton("");
		btnPlanta1.setBounds(116, 19, 65, 89);
		inGamePanel.add(btnPlanta1);
		btnPlanta1.setIcon(new ImageIcon(this.getClass().getResource("/Images/comun.png")));
		btnPlanta1.setEnabled(false);
		btnPlanta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 3;
			}
		});

		btnPlanta2 = new JButton("");
		btnPlanta2.setBounds(191, 19, 65, 89);
		inGamePanel.add(btnPlanta2);
		btnPlanta2.setIcon(new ImageIcon(this.getClass().getResource("/Images/girasol.png")));
		btnPlanta2.setEnabled(false);
		btnPlanta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 2;

			}
		});

		btnPlanta3 = new JButton("");
		btnPlanta3.setBounds(266, 19, 65, 89);
		inGamePanel.add(btnPlanta3);
		btnPlanta3.setIcon(new ImageIcon(this.getClass().getResource("/Images/Nuez.png")));
		btnPlanta3.setEnabled(false);
		btnPlanta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 5;
			}
		});

		btnPlanta4 = new JButton("");
		btnPlanta4.setBounds(341, 19, 65, 89);
		inGamePanel.add(btnPlanta4);
		btnPlanta4.setIcon(new ImageIcon(this.getClass().getResource("/Images/congeladora.png")));
		btnPlanta4.setEnabled(false);
		btnPlanta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 1;
			}
		});

		btnPlanta5 = new JButton("");
		btnPlanta5.setBounds(416, 19, 65, 89);
		inGamePanel.add(btnPlanta5);
		btnPlanta5.setIcon(new ImageIcon(this.getClass().getResource("/Images/CardCatcus.png")));
		btnPlanta5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 4;
			}
		});


		btnPlanta6 = new JButton("");
		btnPlanta6.setBounds(491, 19, 65, 89);
		inGamePanel.add(btnPlanta6);
		btnPlanta6.setIcon(new ImageIcon(this.getClass().getResource("/Images/nuezAlta.png")));
		btnPlanta6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 6;
			}
		});

		btnPlanta7 = new JButton("");
		btnPlanta7.setBounds(566, 19, 65, 89);
		inGamePanel.add(btnPlanta7);
		btnAudio = new JToggleButton();
		btnPlanta7.setIcon(new ImageIcon(this.getClass().getResource("/Images/seta1.png")));
		btnPlanta7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 7;
			}
		});

		btnPlanta8 = new JButton("");
		btnPlanta8.setBounds(641, 19, 65, 89);
		inGamePanel.add(btnPlanta8);
		btnPlanta8.setIcon(new ImageIcon(this.getClass().getResource("/Images/GordaSetaC.png")));
		btnPlanta8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 16;
			}
		});
		btnAudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AudioPulsado();
			}
		});
		btnAudio.setIcon(new ImageIcon(this.getClass().getResource("/Images/btnAudioOn.png")));
		btnAudio.setBounds(1097, 11, 50, 50);
		inGamePanel.add(btnAudio);

		JButton btnVolverMenu = new JButton("");
		btnVolverMenu.setBounds(1157, 11, 103, 105);
		btnVolverMenu.setIcon(new ImageIcon(this.getClass().getResource("/Images/MenuBoton.png")));
		inGamePanel.add(btnVolverMenu);
		btnVolverMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backToMenu();
			}

		});
		lblSol = new JLabel("");
		lblSol.setHorizontalAlignment(SwingConstants.CENTER);
		lblSol.setBounds(10, 11, 96, 80);
		inGamePanel.add(lblSol);
		lblSol.setIcon(new ImageIcon(this.getClass().getResource("/Images/sun.png")));

		lblCantSoles = new JLabel("0");
		lblCantSoles.setForeground(new Color(255, 255, 255));
		lblCantSoles.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantSoles.setFont(new Font("Cambria Math", Font.BOLD, 15));
		lblCantSoles.setBounds(10, 85, 96, 18);
		inGamePanel.add(lblCantSoles);
		lblCantSoles.setText("0");

		JButton btnPruebaAumentarSol = new JButton("");
		btnPruebaAumentarSol.setToolTipText("PARTY MODE: Dale alegria a tu juego!");
		btnPruebaAumentarSol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miLogica.aumentarSoles();
				lblCantSoles.setText("  " + miLogica.getSoles());
				changeMusic(seleccionModo);
			}
		});
		btnPruebaAumentarSol.setBounds(1097, 68, 50, 48);
		inGamePanel.add(btnPruebaAumentarSol);

		JLabel lblPlantsHolder = new JLabel("");
		lblPlantsHolder.setBounds(10, 11, 900, 105);
		inGamePanel.add(lblPlantsHolder);
		lblPlantsHolder.setIcon(new ImageIcon(this.getClass().getResource("/Images/PlantHandler.png")));


		//BOTONES DE MENU
		JButton btnJugar = new JButton("");
		btnJugar.setFont(new Font("Kozuka Gothic Pro R", Font.BOLD, 17));
		btnJugar.setBounds(465, 574, 350, 125);
		menuPanel.add(btnJugar);
		btnJugar.setIcon(new ImageIcon(this.getClass().getResource("/Images/JugarBoton.png")));
		btnJugar.setForeground(Color.black);
		btnJugar.setOpaque(false);
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				seleccionNivel = JOptionPane.showOptionDialog(menuPanel,"Seleccione el nivel de dificultad", ""
						,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,new Object[] { "NIVEL 1", "NIVEL 2"},"opcion1"); 
				seleccionModo = JOptionPane.showOptionDialog(menuPanel,"Seleccione el modo de juego", ""
						,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,new Object[] { "MODO DIA", "MODO NOCHE"},"opcion1"); 
				if(seleccionNivel != JOptionPane.CLOSED_OPTION && seleccionModo != JOptionPane.CLOSED_OPTION) {
					iniciarNuevoJuego();	
				}

			}
		});	

		JButton btnManual = new JButton("");
		btnManual.setBounds(642, 712, 173, 52);
		btnManual.setIcon(new ImageIcon(this.getClass().getResource("/Images/ManualBoton.png")));
		menuPanel.add(btnManual);
		btnManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon Manual = new ImageIcon(this.getClass().getResource("/Images/Manual.png"));
				ImageIcon Plantas = new ImageIcon(this.getClass().getResource("/Images/Plantas.png"));
				ImageIcon Zombies = new ImageIcon(this.getClass().getResource("/Images/zombies.png"));
				int eleccion;
				do {
					eleccion = JOptionPane.showOptionDialog(menuPanel,"", "Informate antes de seguir!"
							,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,Manual,new Object[] { "ENTENDIDO!","PLANTAS","ZOMBIES"},"opcion1"); 
					if(eleccion == 1) {
						JOptionPane.showOptionDialog(menuPanel,"", "Plantas"
								,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,Plantas,new Object[] { "ENTENDIDO!"},"opcion1"); 
						}
					else if(eleccion == 2) {
						JOptionPane.showOptionDialog(menuPanel,"", "Zombies"
								,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,Zombies,new Object[] { "ENTENDIDO!"},"opcion1"); 
					}
				}while(eleccion != 0 && eleccion != JOptionPane.CLOSED_OPTION);
			}
		});


		JButton btnSalir = new JButton("");
		btnSalir.setBounds(465, 712, 173, 52);
		btnSalir.setIcon(new ImageIcon(this.getClass().getResource("/Images/SalirBoton.png")));
		menuPanel.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

		JLabel lblImageMenu = new JLabel("");
		lblImageMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblImageMenu.setBounds(0, 0, 1284, 891);
		menuPanel.add(lblImageMenu);
		lblImageMenu.setIcon(imagenPortadaMenu);

	}

	private void newMapPanel() {
		mapPanel = new JPanel();
		mapPanel.setBackground(new Color(0, 255, 0));
		mapPanel.setBounds(320, 205, 900, 600);
		mapPanel.setOpaque(false);
		inGamePanel.add(mapPanel);
		mapPanel.setLayout(null);
	}

	public void backToMenu() {
		audioOff();
		menuPanel.setVisible(true);
		inGamePanel.setVisible(false);
		gameStart = false;


	}

	private void pintarMatriz() {
		for(int i=0;i<cantFilas;i++) {
			for(int j=0;j<cantColumnas;j++) {
				matrizGrafica[i][j] = miLogica.getCelda(i, j);
				ImageIcon im = new ImageIcon(this.getClass().getResource("/Images/"+matrizGrafica[i][j].getImgPath()));
				matrizGrafica[i][j].addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {onMouseClicked(e);}});
				matrizGrafica[i][j].setIcon(im);
				mapPanel.add(matrizGrafica[i][j]);
				matrizGrafica[i][j].setBounds(j*100, i*100, 100, 100);		
			}
		}
	}

	private void onMouseClicked(MouseEvent e) {
		for(int i=0;i<cantFilas;i++) {
			for(int j=0;j<cantColumnas;j++) {
				if (e.getSource() == matrizGrafica[i][j] && opcion!=0 && !matrizGrafica[i][j].isOcupada()) {					
					miLogica.colocarPlanta(opcion,j,i);
					lblCantSoles.setText(" " + miLogica.getSoles());
					opcion = 0;
					matrizGrafica[i][j].setOcupada(true);

				}
			}
		}
	}


	public void AudioPulsado() {
		if (this.btnAudio.isSelected()) {
			audioOff();
		} else {
			audioOn(seleccionModo);
		}
	}

	private void audioOn(int modo) {
		btnAudio.setIcon(new ImageIcon(this.getClass().getResource("/Images/btnAudioOn.png")));
		if (modo==0) {
			ap= new AudioPlayer("Audio/DayMusic.mp3");
		} else {
			ap=new AudioPlayer("Audio/NightMusic.mp3");
		}
		hiloMusica= new Thread(ap);
		hiloMusica.start();
	}
	
	private void changeMusic(int modo) {
		audioOff();
		btnAudio.setIcon(new ImageIcon(this.getClass().getResource("/Images/btnAudioOn.png")));
		if (modo==0) {
			ap= new AudioPlayer("Audio/PapuMusic.mp3");
		} else {
			ap=new AudioPlayer("Audio/Jeites - Voce.mp3");
		}
		hiloMusica= new Thread(ap);
		hiloMusica.start();
	}

	@SuppressWarnings("removal")
	private void audioOff() {
		btnAudio.setIcon(new ImageIcon(this.getClass().getResource("/Images/btnAudioOff.png")));
		ap=null;
		if(hiloMusica != null) {
			hiloMusica.stop();
			hiloMusica= null;
		}
	}

	public void ubicar(JLabel miLabel,int x, int y ) {
		mapPanel.add(miLabel);
		mapPanel.setComponentZOrder(miLabel, 0);
		miLabel.setBounds(x*100, y*100, 100, 100);
		System.out.println("Ubique JLabel en x:: "  + x*100 + " y:: " + y*100 + " URL:: " + miLabel.getIcon());
	}

	public void moverZombie(JLabel z,int x, int y) {
		z.setBounds(x, y, 100, 100);
	}

	public void moverProyectil(JLabel proyectil,int x, int y) {
		proyectil.setBounds(x, y, 30, 100);

	}

	public void removerLabel(JLabel l) {
		mapPanel.remove(l);
	}

	private void administrarPlantas() {
		if(miLogica.printGameState() == "DIA") {
			btnPlanta8.setEnabled(false);
			btnPlanta7.setEnabled(false);
		}
		if(miLogica.getSoles()>=50) {
			btnPlanta2.setEnabled(true);
			btnPlanta3.setEnabled(true);
		}
		else {
			btnPlanta2.setEnabled(false);
			btnPlanta3.setEnabled(false);	
		}
		if(miLogica.getSoles()>=75) {
			if(miLogica.printGameState() == "NOCHE")
				btnPlanta8.setEnabled(true);
		}
		else {
			btnPlanta8.setEnabled(false);
		}
		if(miLogica.getSoles()>=100) {
			btnPlanta1.setEnabled(true);}
		else {
			btnPlanta1.setEnabled(false);
		}
		if(miLogica.getSoles()>=125) {
			btnPlanta5.setEnabled(true);
			btnPlanta6.setEnabled(true);
		}
		else {
			btnPlanta5.setEnabled(false);
			btnPlanta6.setEnabled(false);
		}
		if(miLogica.getSoles()>=175) 
			btnPlanta4.setEnabled(true);  
		else
			btnPlanta4.setEnabled(false);  
	}
	
	public void nuevaHorda() {
		ImageIcon imgNuevaHorda = new ImageIcon(this.getClass().getResource("/Images/HordaEnCamino.png"));
		lblNuevaHorda = new JLabel();
		lblNuevaHorda.setIcon(imgNuevaHorda);
		
		mapPanel.add(lblNuevaHorda);
		mapPanel.setComponentZOrder(lblNuevaHorda, 0);
		lblNuevaHorda.setBounds(75, 200, 742, 130);
	}
	
	public void eliminarHorda() {
		removerLabel(lblNuevaHorda);
	}

	public void gameOver() {
		gameStart = false;
		ImageIcon gameOver = new ImageIcon(this.getClass().getResource("/Images/gameOver.png"));
		int seleccionPerdiste = JOptionPane.showOptionDialog(menuPanel,"", "Ups, Perdiste"
				,JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,gameOver,new Object[] { "MENU", "SALIR"},"opcion1"); 
		if(seleccionPerdiste == JOptionPane.CLOSED_OPTION || seleccionPerdiste == 1) {
			System.exit(0);
		}
		if(seleccionPerdiste == 0) {
			backToMenu();
		}
	}


	private void iniciarNuevoJuego() {
		newMapPanel();
		matrizGrafica = new Celda[cantFilas][cantColumnas];
		miLogica = Logica.getInstancia(seleccionNivel, seleccionModo);
		menuPanel.setVisible(false);
		inGamePanel.setVisible(true);
		lblCantSoles.setText("" + miLogica.getSoles());
		hiloJuego = new Thread (this);
		hiloJuego.start();
		gameStart = true;
		audioOn(seleccionModo);
		if(seleccionModo == 1)
			lblImageMap.setIcon(nightMap);
		else
			lblImageMap.setIcon(dayMap);
		pintarMatriz();
		mapPanel.repaint();
	}
	
	public void nuevoNivel() {
		ImageIcon imgNuevoNivel = new ImageIcon(this.getClass().getResource("/Images/CambioNivel.png"));
		lblNuevoNivel = new JLabel();
		lblNuevoNivel.setIcon(imgNuevoNivel);
		
		mapPanel.add(lblNuevoNivel);
		mapPanel.setComponentZOrder(lblNuevoNivel, 0);
		lblNuevoNivel.setBounds(75, 200, 742, 130);
		gameStart = false;
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
		miLogica.controlarZombies();
		miLogica.moverProyectiles();
		miLogica.controlDeColisones();
		lblCantSoles.setText(""+miLogica.getSoles());
	}


}
