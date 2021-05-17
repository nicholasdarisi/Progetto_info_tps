package model;

import java.io.*;
import java.net.*;
import javax.sound.sampled.*;

public class Sound {
    private Clip clip;
    private int frame;

    /**
     * Serve per istanziare un Sound , sono presenti vari check
     * @param fileName
     */
    public Sound(URI fileName) {
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

    /**
     * Restituisce lo status della musica attuale
     * @return boolean
     */
    public boolean status() {
        return clip.isRunning();
    }

    /**
     * Serve per fare partire la musica
     */
    public void play() {
        clip.setFramePosition(0);
        clip.start();
    }

    /**
     * Serve per mettere in loop la musica
     */
    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    /**
     * Serve per terminare la musica
     */
    public void stop() {
        clip.stop();
    }

    /**
     * Serve per mettere in pausa la musica
     */
    public void pause() {
        frame = clip.getFramePosition();
        clip.stop();
    }

    /**
     * Serve per fare ripartire la musica
     */
    public void resume() {
        clip.setFramePosition(frame);
        loop();
    }

    /**
     * Serve per fare ripartire la musica da una certa posizione
     * @param Frame
     */
    public void resume(int Frame) {
        clip.setFramePosition(Frame);
        loop();
    }

    /**
     * Serve per sapere dove si e arrivato con la musica
     * @return int
     */
    public int getFramePosition() {
        return clip.getFramePosition();
    }

    /**
     * Serve cambiare il volume della musica
     * @param volume
     */
    public void volume(float volume) {
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(volume);
    }

    /**
     * Serve per capire il volume attuale della musica
     * @return
     */
    public float getVolume() {
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        return gainControl.getValue();
    }

}