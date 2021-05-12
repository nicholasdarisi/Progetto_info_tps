package model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Partita implements Runnable{
	
	private Giornata g;
	private Squadra s;
	private int goal;

	
	
	public Partita(Giornata x, Squadra y) {
		// TODO Auto-generated constructor stub
		g = x;
		s = y;
	}
	
	private void output (String message)
	{
		System.out.println("Partita >>> "+message);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (g.getn_giornata()<22) {
			//inizio partita
			g.start_game(s);
			output ("inizio game");
			
			
			//simulazione della partita
			s.setId(g.getid(s));
			
			int i = g.getn_giornata();
			goal=g.in_game(s);
			System.out.println("goal:" +goal);
			s.setG_fatti(goal);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			
			output("game in corso");
			
			
			//fine partita
			g.out_game(s);
			g.count_partite();
			output("fine game");
		
		}
		
	}

}
