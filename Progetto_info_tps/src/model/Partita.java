package model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Partita implements Runnable {

    private Giornata g;
    private Squadra s;
    private int goal;

    /**
     * Serve per istanziare Partita
     * @param x
     * @param y
     */
    public Partita(Giornata x, Squadra y) {
        // TODO Auto-generated constructor stub
        g = x;
        s = y;
    }

    /**
     * OutPut di un messaggio
     * @param message
     */
    private void output(String message) {
        System.out.println("Partita >>> " + message);
    }


    /**
     * Simula un ciclo della partita , quindi , entrata , giocata , uscita di una squadra
     */
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (g.getn_giornata() < 22) {
            //inizio partita
            g.start_game(s);
            //output("inizio game");
            //simulazione della partita
            s.setId(g.getid(s), g.getn_giornata());
            //output("Generando ....");
            goal = g.in_game(s);
            //System.out.println("goal:" + goal);
            s.setG_fatti(goal, g.getn_giornata());

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }

            //output("game in corso");
            g.out_game(s);
            //output("fine game");

        }

    }

}
