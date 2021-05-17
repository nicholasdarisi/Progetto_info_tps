package model;

public class Classifica {
    String[] a;
    Squadra[] squadre;
    Giornata g;
    private int n;
    private boolean start;

    public Classifica(Squadra[] s, Giornata c) {
        a = new String[12];
        squadre = s;
        n = 0;
        start = false;
        g = c;
    }

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

    public String[] Stampa_classifica() {
        String[] str = new String[12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 22; j++) {
                if(squadre[i].getG_fatti()[j] == null) break;
                if (squadre[i].getG_fatti()[j] > squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    squadre[i].setVittorie(1);
                    squadre[i].setPunti(3);
                    squadre[i].setSconfitte(1);
                } else if (squadre[i].getG_fatti()[j] == squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    squadre[i].setPareggi(1);
                    squadre[i].setPunti(1);
                    squadre[i].setPareggi(1);
                    squadre[i].setPunti(1);
                } else if (squadre[i].getG_fatti()[j] < squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    squadre[i].setVittorie(1);
                    squadre[i].setPunti(3);
                    squadre[i].setSconfitte(1);
                }
            }
        }


        for (int i = 0; i < 12; i++) {

            str[i] = " " +squadre[i].gNome()+ " " +g.getn_giornata() + " " + squadre[i].getVittorie() + " " + squadre[i].getPareggi() + " " + squadre[i].getSconfitte()
                    + " " + squadre[i].getGoal_totali() + " " + squadre[i].getG_subiti() + " " + squadre[i].getDiff_reti()
                    + " " + squadre[i].getPunti();
        }

        return str;

    }

    public int getN() {
        return n;
    }

    public boolean getS() {
        return start;
    }

    public void setS(boolean a) {
        start = a;
    }

    public int getNext() {
        System.out.println("Giornata _: " + g.getn_giornata());
        if (n != g.getn_giornata() - 1) {
            n++;
            return n;
        }
        return n;
    }

    public int getPrev() {
        if (n != 0) {
            n--;
            return n;
        }
        return n;
    }

}
