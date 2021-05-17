package model;

import java.util.ArrayList;

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
                    //squadre[i].setSconfitte(1);
                } else if (squadre[i].getG_fatti()[j] == squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    squadre[i].setPareggi(1);
                    squadre[i].setPunti(1);
                    //squadre[i].setPareggi(1);
                    //squadre[i].setPunti(1);
                } else if (squadre[i].getG_fatti()[j] < squadre[squadre[i].getId_array()[j]].getG_fatti()[j]) {
                    //squadre[i].setVittorie(1);
                    squadre[i].setSconfitte(1);
                    squadre[i].setPunti(0);
                }
            }
        }



        int a[] = new int[12];
        for(int i = 0 ; i < 12 ; i++){
            a[i] = i;
        }
        boolean reorder = false;
        while(!reorder){
            reorder = true;
            for(int i = 0 ; i < 11 ; i++){
                    if(squadre[a[i]].getPunti() < squadre[a[i + 1]].getPunti() ){
                        int temp = a[i + 1];
                        a[i + 1] = a[i];
                        a[i] = temp;
                        reorder = false;
                    }
            }
        }
        for (int i = 0; i < 12; i++) {
            str[i] = " \t\t\t\t" +squadre[a[i]].gNome()+ " \t\t\t\t" +g.getn_giornata() + " \t\t\t\t" + squadre[a[i]].getVittorie() + " \t\t\t\t" + squadre[a[i]].getPareggi() + " \t\t\t\t" + squadre[a[i]].getSconfitte()
                    + " \t\t\t\t" + squadre[a[i]].getGoal_totali()
                    + " \t\t\t\t" + squadre[a[i]].getPunti();

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
