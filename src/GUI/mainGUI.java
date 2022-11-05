package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Logica.Logica;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;

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

	public mainGUI() {
		miLogica = new Logica();
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		menuPanel = new JPanel();
		menuPanel.setBackground(new Color(255, 0, 0));
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);
		imagenPortadaMenu = new ImageIcon(this.getClass().getResource("/Images/portada.png"));
		
		
		inGamePanel = new JPanel();
		contentPane.add(inGamePanel, "name_907983904796900");
		inGamePanel.setLayout(null);
		
		mapPanel = new JPanel();
		mapPanel.setBackground(new Color(128, 255, 0));
		mapPanel.setBounds(10, 121, 1046, 552);
		inGamePanel.add(mapPanel);
		inGamePanel.setVisible(false);
		mapPanel.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black));
		mapPanel.setLayout(new GridLayout(miLogica.getFilas(), miLogica.getColumnas(), 0, 0));
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		setLocation(x, y);
		this.setResizable(false);	
		
		JButton btnPlanta1 = new JButton("");
		btnPlanta1.setBounds(10, 10, 65, 89);
		inGamePanel.add(btnPlanta1);
		btnPlanta1.setIcon(new ImageIcon(this.getClass().getResource("/Images/comun.png")));
		
		JButton btnPlanta2 = new JButton("");
		btnPlanta2.setBounds(105, 10, 65, 89);
		inGamePanel.add(btnPlanta2);
		btnPlanta2.setIcon(new ImageIcon(this.getClass().getResource("/Images/girasol.png")));
		
		JButton btnPlanta3 = new JButton("");
		btnPlanta3.setBounds(200, 10, 65, 89);
		inGamePanel.add(btnPlanta3);
		btnPlanta3.setIcon(new ImageIcon(this.getClass().getResource("/Images/Nuez.png")));
		
		JButton btnPlanta4 = new JButton("");
		btnPlanta4.setBounds(295, 10, 65, 89);
		inGamePanel.add(btnPlanta4);
		btnPlanta4.setIcon(new ImageIcon(this.getClass().getResource("/Images/congeladora.png")));
		
		JButton btnVolverMenu = new JButton("MENU");
		btnVolverMenu.setBounds(953, 10, 103, 101);
		inGamePanel.add(btnVolverMenu);
		
		JLabel lblNewLabel = new JLabel("SOLES:");
		lblNewLabel.setBounds(803, 10, 140, 101);
		inGamePanel.add(lblNewLabel);
		btnVolverMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuPanel.setVisible(true);
				inGamePanel.setVisible(false);
			}

		});

		//BOTONES DE MENU
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.setBounds(426, 526, 253, 114);
		menuPanel.add(btnJugar);
		
		JButton btnModoDia = new JButton("MODO DIA");
		btnModoDia.setBounds(689, 526, 158, 52);
		menuPanel.add(btnModoDia);
		
		JButton btnModoNoche = new JButton("MODO NOCHE");
		btnModoNoche.setBounds(689, 588, 158, 52);
		menuPanel.add(btnModoNoche);
		
		JButton btnManual = new JButton("MANUAL");
		btnManual.setBounds(258, 526, 158, 52);
		menuPanel.add(btnManual);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(258, 588, 158, 52);
		menuPanel.add(btnSalir);
		
		JLabel lblImageMenu = new JLabel("");
		lblImageMenu.setBounds(0, 0, 1080, 720);
		menuPanel.add(lblImageMenu);
		lblImageMenu.setIcon(imagenPortadaMenu);
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});
		
		btnJugar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuPanel.setVisible(false);
				inGamePanel.setVisible(true);
			}

		});	
		
		miMouse = new MouseHandler();
		inGamePanel.addMouseListener(miMouse);
		 
		matrizGrafica= new JLabel[miLogica.getFilas()][miLogica.getColumnas()];
		pintarMatriz();
	}
	
	private void pintarMatriz() {
		  for(int i=0;i<miLogica.getFilas();i++) {
			  for(int j=0;j<miLogica.getColumnas();j++) {
				   JLabel jl= new JLabel();
				   ImageIcon im= new ImageIcon(this.getClass().getResource("/Images/fondo.png"));
				   jl.setIcon(im);
				   matrizGrafica[i][j]=jl;
				   mapPanel.add(jl);
			  }
		  }
			
		}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}