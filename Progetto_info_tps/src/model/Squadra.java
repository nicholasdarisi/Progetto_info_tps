package model;

public class Squadra {
	
	private int vittorie;
	private int pareggi;
	private int sconfitte;
	private Integer g_fatti[];
	private int g_subiti;
	private int punti;
	private Integer id [];
	private int potenza;
	private int ids;
	int g;
	private String nome;
	private int count_G;
	public Squadra(int potenza, int ids, String nome) {
		// TODO Auto-generated constructor stub
		vittorie = 0;
		pareggi = 0;
		sconfitte = 0;
		g_fatti = new Integer [23];
		g_subiti = 0;
		count_G = 0;
		punti = 0;
		id = new Integer [23];
		this.potenza = potenza;
		this.ids = ids;
		this.nome = nome;
	}
    public int getCount_G(){
	    return count_G;
    }
    public void addCount_G(){
	    count_G++;
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
    public String gNome(){
	    return nome;
    }
	public void setG_fatti(int goal) {
		int i = 0;
		
		while(this.g_fatti[i] != null) {
			i++;
		}
		g_fatti[i] = goal;
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


    public void setG_fatti(int goal, int i) {
        g_fatti[i] = goal;
        System.out.println(ids + " : " + " N = " + i + " : " + g_fatti[i]);
    }

    public Integer[] getId_array() {
        return id;
    }

    public int getids_int() {
        return ids;

    }

    public void setId(int id_, int i) {
        id[i] = id_;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti += punti;
    }

    public int getGoal_totali() {
        for (int i = 0; i<22; i++) {
        	if (g_fatti[i] == null) break;
            g += g_fatti[i];
 
        }

        return g;

    }

    public int getDiff_reti() {
        g = getGoal_totali();
        if (g > g_subiti) return g - g_subiti;
        return g_subiti - g;
    }

    public int getPotenza() {
        return potenza;
    }

}
