package model;

import java.util.ArrayList;

/**
 * Classe per le ordinazioni dei clienti
 * Gestisce bevande, alimenti e numero del tavolo
 * @author negri.gioele
 */
public class Ordinazione {
    private int NumeroTavolo;
    private ArrayList<String> bevande = new ArrayList<String>();
    private ArrayList<String> alimenti = new ArrayList<String>();
    /**
     * setta il numero del tavolo
     * @param a numero del tavolo
     */
    public Ordinazione(int a){
        NumeroTavolo = a;
    }
    /**
     * restituisce il numero del tavolo a cui corrisponde l'ordinazione
     * @return numero del tavolo
     */
    public int getNumeroTavolo(){
        return NumeroTavolo;
    }
    /**
     * Restituisce gli alimenti ordinati
     * @return ArrayList
     */
    public ArrayList<String> getAlimenti(){
        return alimenti;
    }
}
