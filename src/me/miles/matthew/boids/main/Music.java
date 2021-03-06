package me.miles.matthew.boids.main;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public final class Music extends JFrame {
	
	public Music() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("Test Sound Clip");
	    this.setSize(300, 200);
	    this.setVisible(true);
        
	    try {
	       // Open an audio input stream.
	       URL url = new URL(new URL("file:"), "./music.wav");
	       System.out.println(url.getPath());
	       AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
	       // Get a sound clip resource.
	       Clip clip = AudioSystem.getClip();
	       // Open audio clip and load samples from the audio input stream.
	       clip.open(audioIn);
	       clip.start();
	    } catch (UnsupportedAudioFileException e) {
	       e.printStackTrace();
	    } catch (IOException e) {
	       e.printStackTrace();
	    } catch (LineUnavailableException e) {
	       e.printStackTrace();
	    }
	}
}
