package main;

import java.awt.EventQueue;


import View.Grafica;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Grafica window = new Grafica();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}