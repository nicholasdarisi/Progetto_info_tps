package model;

import view.Grafica;

/**
 * @author Oniichan
 * @data 2021/5/17
 * @project Progetto_info_tps
 */
public class DayControll implements Runnable {
    Giornata giornata;
    Grafica g;

    /**
     * Serve per istanziare un DayControll , la classe gestisce i giorni in corsi nella Grafica
     * @param g
     * @param graf
     */
    public DayControll(Giornata g, Grafica graf){
        giornata = g;
        this.g = graf;
    }

    /**
     * Serve per osservare i giorni passati e cambiare il valore nella Grafica quansto cambia di giorno
     */
    @Override
    public void run() {
        while(giornata.getn_giornata() < 22){
            g.setGiorno((giornata.getn_giornata() + 1) + "");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        g.setGiorno("Done");
    }
}
