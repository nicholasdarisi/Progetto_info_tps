package model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Giornata {

    private int campolibero = 2;
    private Squadra s1 = null;
    private Squadra s2 = null;
    private int x;
    private int m;
    private int count_p;
    private ArrayList<Integer> darisa = new ArrayList<Integer>();

    /**
     * Serve per istanziare Giornata, monitor per le partite
     * @param n
     * @param max
     */
    public Giornata(int n, int max) {
        // TODO Auto-generated constructor stub
        x = n;
        m = max;
        this.darirandom();
    }

    /**
     * Serve per randomizare gli incontri tra squadre
     */
    private void darirandom() {
        darisa.clear();
        ArrayList<Integer> random = new ArrayList<Integer>();
        int n;

        for (Integer i = 0; i < 12; i++) {
            random.add(i);
        }

        for (Integer i = 0; i < 12; i++) {
            do {
                n = ThreadLocalRandom.current().nextInt(0, random.size());
            } while (n == darisa.size() - 1);
            darisa.add(random.remove(n));
        }


    }


    /**
     * Serve per sapare se e il turno di certe squadre o no
     * @param x
     * @return
     */
    public boolean check(Squadra x) {
        if (campolibero == 0 || x.getids_int() != darisa.get(count_p) && x.getids_int() != darisa.get(count_p + 1))
            return true;
        return false;
    }

    /**
     * Gestisce gli start delle partite
     * @param x
     */
    public synchronized void start_game(Squadra x) {
        while (check(x)) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        campolibero--;

        if (s1 == null) s1 = x;
        else s2 = x;


    }

    /**
     * Simula la giocata della partita
     * @param x
     * @return int
     */
    public synchronized int in_game(Squadra x) {

        return ThreadLocalRandom.current().nextInt(1, x.getPotenza());

    }

    /**
     * Simula uscita delle partite
     * @param x
     */
    public synchronized void out_game(Squadra x) {
        campolibero++;
        if (s1 != null && x.getids_int() == s1.getids_int()) {
            System.out.println(s1.getids_int() + " : deleting...");
            s1 = null;
        } else {
            System.out.println(s2.getids_int() + " : deleting...");
            s2 = null;
        }

        count_p++;
        System.out.println(x.getids_int() + " : ++ " + count_p + " Campo : " + campolibero);
        if (count_p == 12) {
            count_p = 0;
            this.x++;
            darirandom();
        }

        if (campolibero == 2) notifyAll();
        if (!(count_p == 0 && (x.getids_int() == darisa.get(count_p) || x.getids_int() == darisa.get(count_p + 1)))) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * Serve per sapere il giorno attuale
     * @return
     */
    public synchronized int getn_giornata() {
        return x;
    }

    /**
     * Serve per salvare id della squadra aversaria
     * @param x
     * @return int
     */
    public synchronized int getid(Squadra x) {

        while (s2 == null) {
            try {
                wait(100);
            } catch (InterruptedException e) {
            }
        }

        if (x.getids_int() == s1.getids_int()) {
            return s2.getids_int();
        }

        return s1.getids_int();

    }

}





