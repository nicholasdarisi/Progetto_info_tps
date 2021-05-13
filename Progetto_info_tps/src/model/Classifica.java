package model;

public class Classifica {

    Squadra[] squadre;

    public Classifica(Squadra[] s) {
        squadre = s;
    }

    public String[] getClassificaG(int G) {
        String[] a = new String[12];

        for (int i = 0; i < 12; i++) {
            a[i] = "Squadra  " + squadre[i].getids_int() + " " + squadre[i].getG_fatti()[G] + " - " +
                    squadre[squadre[i].getId_array()[G]].getG_fatti()[G] + " Squadra " + squadre[i].getId_array()[G];
        }

        return a;
    }

    public String[] Stampa_classifica() {
        String[] str = new String[12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 22; j++) {

                if (squadre[i].getG_fatti()[j] > squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    squadre[i].setVittorie(1);
                    squadre[i].setPunti(3);
                    squadre[j].setSconfitte(1);
                } else if (squadre[i].getG_fatti()[j] == squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    squadre[i].setPareggi(1);
                    squadre[i].setPunti(1);
                    squadre[j].setPareggi(1);
                    squadre[j].setPunti(1);
                } else if (squadre[i].getG_fatti()[j] < squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    squadre[j].setVittorie(1);
                    squadre[j].setPunti(3);
                    squadre[i].setSconfitte(1);
                }
            }
        }


        for (int i = 0; i < 12; i++) {

            str[i] = "22" + " " + squadre[i].getVittorie() + " " + squadre[i].getPareggi() + " " + squadre[i].getSconfitte()
                    + " " + squadre[i].getGoal_totali() + " " + squadre[i].getG_subiti() + " " + squadre[i].getDiff_reti()
                    + " " + squadre[i].getPunti();
        }

        return str;

    }


}
