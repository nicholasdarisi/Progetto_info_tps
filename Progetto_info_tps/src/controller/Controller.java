package controller;

import model.Classifica;
import model.Sound;
import view.Grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;

/**
 * @author Oniichan
 * @data 2021/5/12
 * @project Progetto_info_tps
 */
public class Controller implements ActionListener {
    Grafica view;
    Classifica c;
    Thread[] a;

    public Controller(Grafica a, Classifica c, Thread[] b) {
        view = a;
        this.c = c;
        this.a = b;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getButton(0)) {
            view.switchPanel(0);
            view.printC(c.Stampa_classifica());
        }
        if (e.getSource() == view.getButton(1)) {
            view.switchPanel(2);
            if (!c.getS()) {
                for (Thread a : this.a) {
                    a.start();
                }
                c.setS(true);
            }
            try {
                new Sound(this.getClass().getResource("/Resource/fischio.wav").toURI()).play();
            } catch (URISyntaxException uriSyntaxException) {
            }
        }
        if (e.getSource() == view.getButton(2)) {
            view.switchPanel(1);
        }
        if (e.getSource() == view.getButton(5)) {
            view.switchPanel(3);
        }
        if (e.getSource() == view.getButton(4)) {
            view.switchGiorni(c.getClassificaG(c.getNext()));
        }
        if (e.getSource() == view.getButton(3)) {
            view.switchGiorni(c.getClassificaG(c.getPrev()));
        }

    }
}
