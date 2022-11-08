package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SplashScreen {

	private JFrame frame;
	private int duracion;

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public SplashScreen(int d) {
		duracion=d;
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100, 900, 600);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(mainGUI.class.getResource("/Images/logoImage.png")));
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		frame.setLocation(x, y);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 844, 611);
		frame.getContentPane().add(lblNewLabel);
		ImageIcon icon= new ImageIcon(this.getClass().getResource("/Images/SplashScreen.png"));
		lblNewLabel.setIcon(icon);
		
		frame.setVisible(true);
		 try { 
			 	Thread.sleep(duracion); 
		 } catch (Exception e) {}
		 frame.setVisible(false); 
	}
}