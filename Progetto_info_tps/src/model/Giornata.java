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

    public Giornata(int n, int max) {
        // TODO Auto-generated constructor stub
        x = n;
        m = max;
        this.darirandom();
    }

    
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

    public boolean check(Squadra x) {
        if (campolibero == 0 || x.getids_int() != darisa.get(count_p) && x.getids_int() != darisa.get(count_p + 1))
            return true;
        return false;
    }

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

    public int in_game(Squadra x) {

        return ThreadLocalRandom.current().nextInt(1, x.getPotenza());

    }

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
        try {
            wait(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int vittoria(Squadra x) {

        return x.get_intgoal();

    }


    public synchronized int getn_giornata() {
        return x;
    }


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



/*
 * milan 1 - 0 inter
 * juve 2 - 0 atletico
 * city 3 - 4 utd  -- > Squadra.g_fatti[0] = 4
 *
 * milan 3 - 0 atletico
 * utd 0 - 0 inter
 * city 3 - 1 juve
 */


