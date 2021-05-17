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
    public DayControll(Giornata g, Grafica graf){
        giornata = g;
        this.g = graf;
    }

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
