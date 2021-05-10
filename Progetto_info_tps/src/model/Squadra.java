package model;

public class Squadra {
	
	private int vittorie;
	private int pareggi;
	private int sconfitte;
	private Integer g_fatti[];
	private int g_subiti;
	private int diff_reti;
	private int punti;
	private Integer id [];
	private int potenza;
	private int ids;
	
	public Squadra(int potenza, int ids) {
		// TODO Auto-generated constructor stub
		vittorie = 0;
		pareggi = 0;
		sconfitte = 0;
		g_fatti = new Integer [22];
		g_subiti = 0;
		diff_reti = 0;
		punti = 0;
		id = new Integer [22];
		this.potenza = potenza;
		this.ids = ids;
		
	}

	public int getVittorie() {
		return vittorie;
	}

	public void setVittorie(int vittorie) {
		this.vittorie += vittorie;
	}

	public int getPareggi() {
		return pareggi;
	}

	public void setPareggi(int pareggi) {
		this.pareggi += pareggi;
	}

	public int getSconfitte() {
		return sconfitte;
	}

	public void setSconfitte(int sconfitte) {
		this.sconfitte += sconfitte;
	}

	public Integer[] getG_fatti() {
		return g_fatti;
	}
	
	public int get_intgoal() {
		int i = 0;
		int goal = 0;
		
		while(this.g_fatti[i] != null) {
			if (i ==19) {
				goal = g_fatti[i];
				return goal;
				
			}
			i++;
		}
		
		if (i>0) {
			goal = g_fatti[i-1];
		}
		
		return goal;
		
	}

	public void setG_fatti(int goal) {
		int i = 0;
		while(this.g_fatti[i] != null) {
			i++;
		}
		g_fatti[i] = goal;
		
	}

	public Integer[] getId_array() {
		return id;
	}
	
	public int getids_int() {
		return ids;
		
	}

	public void setId(int id_) {
		int i = 0;
		while(this.id[i] != null ) {
			if (i!=21) break;
			i++;
		}
		id[i] = id_;
	}

	public int getG_subiti() {
		return g_subiti;
	}

	public void setG_subiti(int g_subiti) {
		this.g_subiti += g_subiti;
	}

	public int getDiff_reti() {
		return diff_reti;
	}

	public void setDiff_reti(int diff_reti) {
		this.diff_reti += diff_reti;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti += punti;
	}
	
	public int getGoal_totali() {
		int i = 0;
		int t = 0;
		while(this.g_fatti[i] != null) {
			t += g_fatti[i];
			i++;
		}
		
		return t;
		
	}

	public int getPotenza() {
		return potenza;
	}

	public void setPotenza(int potenza) {
		this.potenza = potenza;
	}
	

}
