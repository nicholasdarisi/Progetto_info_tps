package model;

import java.io.*;
import java.net.*;
import javax.sound.sampled.*;

public class Sound {
	private Clip clip;
	private int frame;
	public Sound(String fileName) {
		try {
			File file = new File(fileName);
			if (file.exists()) {
				AudioInputStream sound = AudioSystem.getAudioInputStream(file);
				clip = AudioSystem.getClip();
				clip.open(sound);
			} else {
				throw new RuntimeException("Sound: file not found: " + fileName);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Malformed URL: " + e);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Unsupported Audio File: " + e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Input/Output Error: " + e);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
			throw new RuntimeException("Sound: Line Unavailable Exception Error: " + e);
		}

	}

	public boolean status() {
		return clip.isRunning();
	}

	public void play() {
		clip.setFramePosition(0);
		clip.start();
	}

	public void loop() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}

	public void stop() {
		clip.stop();
	}

	public void pause() {
		frame = clip.getFramePosition();
		clip.stop();
	}

	public void resume() {
		clip.setFramePosition(frame);
		loop();
	}
	public void resume(int Frame) {
		clip.setFramePosition(Frame);
		loop();
	}
	public int getFramePosition() {
		return clip.getFramePosition();
	}

	public void volume(float volume) {
		FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(volume);
	}

	public float getVolume() {
		FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		return gainControl.getValue();
	}

}