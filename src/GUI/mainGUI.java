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
	protected Logica miLogica;
	protected JLabel matrizGrafica[][];
	protected ImageIcon imagenPortadaMenu;
	protected MouseHandler miMouse;
	protected JPanel menuPanel;
	protected JPanel inGamePanel;
	protected JPanel mapPanel;
	protected JLabel lblCantSoles,proyectil;
	protected JLabel lblSol;
	public Thread hiloJuego;
	protected int velocidad = 1;
	protected boolean gameStart = false;
	protected JButton btnPlanta1;
	protected JButton btnPlanta2;
	protected JButton btnPlanta3;
	protected JButton btnPlanta4;
	protected int Direccion = 300;

	public mainGUI() {
		miMouse = new MouseHandler();
		miLogica= new Logica();
		matrizGrafica = new JLabel[miLogica.getFilas()][miLogica.getColumnas()];
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
				miLogica.setMiPlantaSeleccionada(miLogica.getMiFactoria().crearLanzaguisantes());
				
			}
		});

		btnPlanta2 = new JButton("");
		btnPlanta2.setBounds(105, 10, 65, 89);
		inGamePanel.add(btnPlanta2);
		btnPlanta2.setIcon(new ImageIcon(this.getClass().getResource("/Images/girasol.png")));
		btnPlanta2.setEnabled(false);
		btnPlanta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					miLogica.setMiPlantaSeleccionada(miLogica.getMiFactoria().crearPlantaGirasol());
					
				}
			});

		btnPlanta3 = new JButton("");
		btnPlanta3.setBounds(200, 10, 65, 89);
		inGamePanel.add(btnPlanta3);
		btnPlanta3.setIcon(new ImageIcon(this.getClass().getResource("/Images/Nuez.png")));
		btnPlanta3.setEnabled(false);
		btnPlanta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					miLogica.setMiPlantaSeleccionada(miLogica.getMiFactoria().crearPlantaNuez()); //¡¿?!
					
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
		lblCantSoles.setText("  " + miLogica.getSoles());

		JButton btnPruebaAumentarSol = new JButton("CLICKEAME");
		btnPruebaAumentarSol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miLogica.aumentarSoles();
				lblCantSoles.setText("  " + miLogica.getSoles());
			}
		});
		btnPruebaAumentarSol.setBounds(530, 68, 85, 40);
		inGamePanel.add(btnPruebaAumentarSol);

		JLabel lblMododeJuego = new JLabel("MODO:" + miLogica.printGameState());
		lblMododeJuego.setBounds(468, 10, 123, 25);
		inGamePanel.add(lblMododeJuego);

		//BOTONES DE MENU
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.setFont(new Font("Kozuka Gothic Pro R", Font.BOLD, 17));
		btnJugar.setBounds(338, 529, 253, 114);
		menuPanel.add(btnJugar);
		btnJugar.setForeground(Color.black);
	    btnJugar.setOpaque(false);
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarNuevoJuegoDia();
			}

		});	


		JButton btnModoDia = new JButton("MODO DIA");
		btnModoDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarNuevoJuegoDia();	
				lblMododeJuego.setText("MODO: " + miLogica.printGameState());
				System.out.println(miLogica.getGrass());
				repintar();
			}
		});
		btnModoDia.setBounds(603, 529, 158, 52);
		menuPanel.add(btnModoDia);

		JButton btnModoNoche = new JButton("MODO NOCHE");
		btnModoNoche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarNuevoJuegoNoche();
				lblMododeJuego.setText("MODO: " + miLogica.printGameState());
				System.out.println(miLogica.getGrass());
				repintar();
				
			}
		});
		btnModoNoche.setBounds(603, 594, 158, 52);
		menuPanel.add(btnModoNoche);

		JButton btnManual = new JButton("MANUAL");
		btnManual.setBounds(168, 529, 158, 52);
		menuPanel.add(btnManual);
		btnManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "MANUAL EN CONSTRUCCION";
				JOptionPane.showMessageDialog(null, message, "Manual", JOptionPane.INFORMATION_MESSAGE,null);
			}
		});

		btnManual.setEnabled(false);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(168, 591, 158, 52);
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

		pintarMatriz();
		moverImage();
	}




	private void pintarMatriz() {
		for(int i=0;i<miLogica.getFilas();i++) {
			for(int j=0;j<miLogica.getColumnas();j++) {
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
        for(int i=0;i<miLogica.getFilas();i++) {
            for(int j=0;j<miLogica.getColumnas();j++) {
                ImageIcon im= new ImageIcon(this.getClass().getResource("/Images/"+miLogica.getGrass()));
                matrizGrafica[i][j].setIcon(im);
            }
        }
    }
	
	private void onMouseClicked(MouseEvent e) {
		for(int i=0;i<miLogica.getFilas();i++) {
			for(int j=0;j<miLogica.getColumnas();j++) {
				if (e.getSource() == matrizGrafica[i][j] && miLogica.getMiPlantaSeleccionada()!=null) {
					System.out.println("Label x: " + i + " y: " +  j + " fue clickedo");
					JLabel nuevaEntidad = new JLabel();
					ImageIcon im= new ImageIcon(this.getClass().getResource("/Images/"+miLogica.getMiPlantaSeleccionada().getImgPath()));
					nuevaEntidad.setIcon(im);
					mapPanel.add(nuevaEntidad);
					mapPanel.setComponentZOrder(nuevaEntidad, 0);
					nuevaEntidad.setBounds(j*100, i*100, 100, 100);
    				miLogica.disminuirSoles(miLogica.getMiPlantaSeleccionada().getCosto());
    				lblCantSoles.setText(" " + miLogica.getSoles());
    				miLogica.setMiPlantaSeleccionada(null);
    				
                }
            }
        }
    }
	
	private void moverImage() {
		ImageIcon im= new ImageIcon(this.getClass().getResource("/Images/pea.png"));
		proyectil = new JLabel();
		proyectil.setIcon(im);
		mapPanel.add(proyectil);
		proyectil.setBounds(300, 500, 100, 100);
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


	private void iniciarNuevoJuegoDia() {
		miLogica= new Logica();
	
		menuPanel.setVisible(false);
		inGamePanel.setVisible(true);
		lblCantSoles.setText("" + miLogica.getSoles());
		hiloJuego = new Thread (this);
		hiloJuego.start();
		gameStart = true;

		
	}
	
	private void iniciarNuevoJuegoNoche() {
		miLogica= new Logica();
	
		miLogica.setNightState();
		menuPanel.setVisible(false);
		inGamePanel.setVisible(true);
		lblCantSoles.setText("" + miLogica.getSoles());
		hiloJuego = new Thread (this);
		hiloJuego.start();
		gameStart = true;

		
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
		//System.out.println("UPDATE");
		proyectil.setBounds(Direccion, 300, 100, 100);
	}
}
