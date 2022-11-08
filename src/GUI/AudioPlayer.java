package GUI;

import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class AudioPlayer implements Runnable{

	protected String musica;
	protected boolean enCurso;
	
	public AudioPlayer( String file ) {
		this.musica = file;
		enCurso = true;
	}

	@Override
	public void run() {
		try {
			while(enCurso) {
				File f= new File(getClass().getClassLoader().getResource(this.musica).toURI());
				FileInputStream fmu= new FileInputStream(f);
				Player playMP3= new Player(fmu);
				playMP3.play();
			}
		} catch (Exception  e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean isEnCurso() {
		return enCurso;
	}

	public void setEnCurso(boolean enCurso) {
		this.enCurso = enCurso;
	}

}
