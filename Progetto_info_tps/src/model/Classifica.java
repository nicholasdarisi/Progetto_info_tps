package model;

public class Classifica {
	private Squadra s [] = new Squadra [12];
	
	public Classifica(Squadra [] s) {
		// TODO Auto-generated constructor stub
		
	}
	
	public String[] class_finale (int indice, int method) {
		
		String str []= new String [12];
		
		if (method == 0) {
		
		}
		
		if (method == 1) {
		for (int i = 0; i < 12; i++) {
			s[i].getG_fatti();
			for (int j =i+1; j < 12; j++) {
				if (s[i].getids_int() == s[j].getids_int()) {
					if (s[i].get_intgoal() > s[j].get_intgoal()) {
						s[i].setVittorie(1);
						s[i].setPunti(3);
						s[j].setSconfitte(1);
					}
					else if (s[i].get_intgoal() == s[j].get_intgoal()) {
						s[i].setPareggi(1);
						s[i].setPunti(1);
						s[j].setPareggi(1);
						s[j].setPunti(1);
					}
					else if (s[i].get_intgoal() < s[j].get_intgoal()) {
						s[i].setSconfitte(1);
					}
				}
			}
		}
		}
		
		for (int i = 0; i < 12; i++) {
			str[i] = "Partite giocate: 22" + "Vittorie: "+s[i].getVittorie()+"Pareggi:"+s[i].getPareggi()
					+ "Sconfitte:"+ s[i].getSconfitte() + "Goal fatti:" +s[i].getGoal_totali()+"Goal subiti:"
					+ s[i].getG_subiti()+ "Punti:" +s[i].getPunti();
		}
		
		return str;
	}
	
	
	/*
	 * 12 squadre
	 * 1 giornata: 6 partite (ogni squadra gioca 1 partita a giornata
	 * ci sono 22 giornate
	 */
	

}
