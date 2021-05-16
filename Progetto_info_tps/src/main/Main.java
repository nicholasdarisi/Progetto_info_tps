package main;

import java.awt.EventQueue;
import java.util.concurrent.ThreadLocalRandom;

import controller.Controller;
import model.*;
import org.testng.annotations.Test;
import view.Grafica;

public class Main {
    public static void main(String[] args) {
        Squadra s[] = new Squadra[12];
        Partita p[] = new Partita[12];
        Giornata g = new Giornata(0, 22);
        for (int i = 0; i < 12; i++) {
            s[i] = new Squadra(ThreadLocalRandom.current().nextInt(2, 6), i);
        }
        Classifica c = new Classifica(s, g);
        Thread t[] = new Thread[12];
        for (int i = 0; i < 12; i++) {
            p[i] = new Partita(g, s[i]);
            t[i] = new Thread(p[i]);
        }
        Grafica window = new Grafica();
        window.addController(new Controller(window, c, t));
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }


}