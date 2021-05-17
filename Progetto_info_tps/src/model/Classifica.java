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
        int max = squadre[0].getPunti();
        Squadra sq []= new Squadra[12];

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

        for (int i = 0; i <12; i++) {
        	sq[i] = squadre[i];
        }

        for (int i = 0; i < 12; i++) {
        	int k=i;
        	for (int j = k+1; j < 12; j++) {
        	if (sq[j].getPunti()>sq[k].getPunti()) {
        		k = j;
        		
        	}
        	}
            str[i] = " \t\t\t\t" +squadre[k].gNome()+ " \t\t\t\t" +g.getn_giornata() + " \t\t\t\t" + squadre[k].getVittorie() + " \t\t\t\t" + squadre[k].getPareggi() + " \t\t\t\t" + squadre[k].getSconfitte()
                    + " \t\t\t\t" + squadre[k].getGoal_totali() 
                    + " \t\t\t\t" + squadre[k].getPunti();
        
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
