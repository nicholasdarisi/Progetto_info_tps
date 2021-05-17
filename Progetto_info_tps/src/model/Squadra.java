package model;

public class Squadra {

    private int vittorie;
    private int pareggi;
    private int sconfitte;
    private Integer g_fatti[];
    private int g_subiti;
    private int punti;
    private Integer id[];
    private int potenza;
    private int ids;
    int g;
    private String nome;
    private int count_G;

    /**
     * Serve per istanziare Squadra
     * @param potenza
     * @param ids
     * @param nome
     */
    public Squadra(int potenza, int ids, String nome) {
        // TODO Auto-generated constructor stub
        vittorie = 0;
        pareggi = 0;
        sconfitte = 0;
        g_fatti = new Integer[23];
        g_subiti = 0;
        count_G = 0;
        punti = 0;
        id = new Integer[23];
        this.potenza = potenza;
        this.ids = ids;
        this.nome = nome;
    }

    /**
     * Serve per sapere dove siamo arrivati con i calcoli
     * @return count_G
     */
    public int getCount_G() {
        return count_G;
    }

    /**
     * Serve per incrementare count_G
     */
    public void addCount_G() {
        count_G++;
    }

    /**
     * Serve per sapere numero delle vittorie di una squadra
     * @return vittorie
     */
    public int getVittorie() {
        return vittorie;
    }

    /**
     * Serve per incrementare le vittorie di una squadra
     * @param vittorie
     */
    public void setVittorie(int vittorie) {
        this.vittorie += vittorie;
    }

    /**
     * Serve per sapere i pareggi
     * @return pareggi
     */
    public int getPareggi() {
        return pareggi;
    }

    /**
     * Serve per incrementare i pareggi
     * @param pareggi
     */
    public void setPareggi(int pareggi) {
        this.pareggi += pareggi;
    }

    /**
     * Serve per sapere il nome della squadra
     * @return String
     */
    public String gNome() {
        return nome;
    }

    /**
     * Serve per sapere le sconfitte
     * @return int
     */
    public int getSconfitte() {
        return sconfitte;
    }

    /**
     * Serve per incrementare le sconfitte
     * @param sconfitte
     */
    public void setSconfitte(int sconfitte) {
        this.sconfitte += sconfitte;
    }

    /**
     * Serve per sapere i goal fatti in tutti i giorni possibili
     * @return g_fatti
     */
    public Integer[] getG_fatti() {
        return g_fatti;
    }

    /**
     * Serve per settare gli goal fatti in una certa giornata
     * @param goal
     * @param i
     */
    public void setG_fatti(int goal, int i) {
        g_fatti[i] = goal;
        System.out.println(ids + " : " + " N = " + i + " : " + g_fatti[i]);
    }

    /**
     * Restituisce un array di Integer nella qualle sono salvati tutti gli id delle squadre aversarie in diversi giorni
     * @return Integer[]
     */
    public Integer[] getId_array() {
        return id;
    }

    /**
     * Restiruisce id della squadra
     * @return
     */
    public int getids_int() {
        return ids;

    }

    /**
     * Serve per salvare nella array id delle squadre aversarie
     * @param id_
     * @param i
     */
    public void setId(int id_, int i) {
        id[i] = id_;
    }

    /**
     * Restituisce i punti totali della squadra
     * @return
     */
    public int getPunti() {
        return punti;
    }

    /**
     * Serve per incrementare i punti totali
     * @param punti
     */
    public void setPunti(int punti) {
        this.punti += punti;
    }

    /**
     * Serve per sapere i goal totali della squadra
     * @return
     */
    public int getGoal_totali() {
        g = 0;
        for (int i = 0; i < 22; i++) {
            if (g_fatti[i] == null) break;
            g += g_fatti[i];

        }

        return g;

    }

    /**
     * Serve per sapere la potenza di una squadra
     * @return
     */
    public int getPotenza() {
        return potenza;
    }

}
