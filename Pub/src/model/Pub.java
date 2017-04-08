package model;

import java.util.ArrayList;

/**
 * classe gestione pub in generale
 * @author g1oele
 */
public class Pub {
    //ATTRIBUTI
    private ArrayList<Ordinazione> ordini = new ArrayList<Ordinazione>();
    private boolean tavoliEsterni[] = new boolean[15];
    private boolean tavoleInterni[] = new boolean[25];
    
    //METODI
    /**
     * costruttore per inizializzare i tavoli
     */
    public Pub(){
        
    }
    /**
     * stampa tutte le ordinazioni
     */
    public void printOrdinazioni(){
        
    }
    /**
     * aggiungi una ordinazione alla lista totale
     * @param a ordinazione da aggiungere
     */
    public void addOrdinazione(Ordinazione a){
        
    }
    /**
     * metodo per rimuovere l'ordinazione dalla lista.
     * una volta rimossa stampa lo scontrino e l'ordinazione non sarà più recuperabile
     * @param a ordinazione da rimuovere
     */
    private void removeOrdinazione(Ordinazione a){
        
    }
    /**
     * scrive lo scontrino dell'ordinazione
     * @param a ordinazione da calcolare
     * @return stringa contenente lo scontrino
     */
    public String createScontrino(Ordinazione a){
        return "";
    }
    /**
     * stampa tutti i tavoli interni liberi
     */
    public void printTavoliInterni(){
        
    }
    /**
     * stampa tutti i tavoli esterni liberi
     */
    public void printTavoliEsterni(){

    }
    /**
     * cambia il valore di un tavolo interno [occupato - libero]
     */
    public void changeTavoliInterni(){
        
    }
    /**
     * cambia il valore di un tavolo esterno [occupato - libero]
     */
    public void changeTavoliEsterni(){
        
    }
}

