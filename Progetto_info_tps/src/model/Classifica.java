package model;

public class Classifica {
    Squadra[] squadre;
    public Classifica(Squadra[] s ){
        squadre = s;
    }

    public String[] getClassificaG(int G){
        String[] a = new String[12];

        for(int i = 0 ; i< 12;i++){
            a[i] = "Squadra  " + squadre[i].getids_int() + " " + squadre[i].getG_fatti()[G] + " - " +
            squadre[squadre[i].getId_array()[G]].getG_fatti()[G] + " Squadra " + squadre[i].getId_array()[G];
        }
        return a;
    }

}
