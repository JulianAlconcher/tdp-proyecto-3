package GUI;

public class VentanaPrincipal {

	public static void main(String[] args) {
		
        SplashScreen miSplashScreen = new SplashScreen(1000);
		
		miSplashScreen.initialize();

		mainGUI window = mainGUI.getInstancia();
		window.setVisible(true);
		

	}

}
