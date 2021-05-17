package model;


public class Classifica {
    String[] a;
    Squadra[] squadre;
    Giornata g;
    private int n;
    private boolean start;

    /**
     * Costruttore per Classifica , Serve un array di Squadra e Giornata
     * @param s
     * @param c
     */
    public Classifica(Squadra[] s, Giornata c) {
        a = new String[12];
        squadre = s;
        n = 0;
        start = false;
        g = c;
    }

    /**
     * Per prendere informazioni di un specifico giorno
     * @param G
     * @return String[]
     */
    public String[] getClassificaG(int G) {

        for (int i = 0; i < 12; i++) {
            if (squadre[i].getG_fatti()[G] == null) {
                break;
            }
            a[i] = squadre[i].gNome() + " " + squadre[i].getG_fatti()[G] + " - " +
                    squadre[squadre[i].getId_array()[G]].getG_fatti()[G] + " " + squadre[squadre[i].getId_array()[G]].gNome();
        }

        return a;
    }

    /**
     * Serve per costruire la tabella finale per Classifica
     * @param str
     * @return String[][]
     */
    public String[][] Stampa_classifica(String[][] str) {
        for (int i = 0; i < 12; i++) {
            for (int j = squadre[i].getCount_G(); j < 22; j++) {
                if (squadre[i].getG_fatti()[j] == null || squadre[squadre[i].getId_array()[j]].getG_fatti()[j] == null) break;
                if (squadre[i].getG_fatti()[j] > squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    squadre[i].setVittorie(1);
                    squadre[i].setPunti(3);
                } else if (squadre[i].getG_fatti()[j] == squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    squadre[i].setPareggi(1);
                    squadre[i].setPunti(1);
                } else if (squadre[i].getG_fatti()[j] < squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    squadre[i].setSconfitte(1);
                    squadre[i].setPunti(0);
                }
                squadre[i].addCount_G();
            }
        }


        int a[] = new int[12];
        for (int i = 0; i < 12; i++) {
            a[i] = i;
        }
        boolean reorder = false;
        while (!reorder) {
            reorder = true;
            for (int i = 0; i < 11; i++) {
                if(squadre[i].getG_fatti()[i] == null){
                    break;
                }
                if (squadre[a[i]].getPunti() < squadre[a[i + 1]].getPunti()) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    reorder = false;
                }
            }
        }
        for (int i = 0; i < 12; i++) {
            str[i][0] = squadre[a[i]].gNome();
            str[i][1] = "" + g.getn_giornata();
            str[i][2] = "" + squadre[a[i]].getVittorie();
            str[i][3] = "" + squadre[a[i]].getPareggi();
            str[i][4] = "" + squadre[a[i]].getSconfitte();
            str[i][5] = "" + squadre[a[i]].getGoal_totali();
            str[i][6] = "" + squadre[a[i]].getPunti();
        }
        return str;
    }

    /**
     * Serve per dirci se la simulazione e mai commminciata o no
     * @return boolean
     */
    public boolean getS() {
        return start;
    }

    /**
     * Serve per settare lo stato di commincia simulazione
     * @param a
     */
    public void setS(boolean a) {
        start = a;
    }

    /**
     *Serve per passare al giorno successivo , se possibile
     * @return int
     */
    public int getNext() {
        System.out.println("Giornata _: " + g.getn_giornata());
        if (n != g.getn_giornata() - 1) {
            n++;
            return n;
        }
        return n;
    }

    /**
     * Serve per passare al giorno precedente , se possibile
     * @return int
     */
    public int getPrev() {
        if (n != 0) {
            n--;
            return n;
        }
        return n;
    }

}
