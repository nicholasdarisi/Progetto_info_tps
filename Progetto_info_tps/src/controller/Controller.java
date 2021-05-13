package controller;

import view.Grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Oniichan
 * @data 2021/5/12
 * @project Progetto_info_tps
 */
public class Controller implements ActionListener {
    Grafica view;

    public Controller(Grafica a) {
        view = a;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getButton(0)) {
            view.switchPanel(0);
        }
        if (e.getSource() == view.getButton(1)) {
            view.switchPanel(2);
        }
        if (e.getSource() == view.getButton(2)) {
            view.switchPanel(1);
        }
        if (e.getSource() == view.getButton(5)) {
            view.switchPanel(3);
        }
    }
}
