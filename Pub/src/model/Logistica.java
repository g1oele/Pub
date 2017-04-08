package model;

import java.util.ArrayList;

/**
 * classe che contiene le code del bar e della cucina. 
 * gestisce gli ordini
 * @author g1ioele
 */
public class Logistica {
    //ATTRIBUTI
    private ArrayList<Ordinazione> bar = new ArrayList<Ordinazione>();
    private ArrayList<Ordinazione> cucina  = new ArrayList<Ordinazione>();
    
    //METODI
    /**
     * restituisce l'arraylist del bar
     * @return arraylist<ordinazione> bar
     */
    public ArrayList<Ordinazione> getBar(){
        return bar;
    }
    /**
     * restituisce l'arraylist del bar
     * @return arraylist<ordinazione> cucina
     */
    public ArrayList<Ordinazione> getCucina(){
        return cucina;
    }
    /**
     * aggiungi una ordinazione all'arraylist del bar
     * @param a ordinazione da aggiungere
     */
    public void addOrdinazioneBar(Ordinazione a){
        
    }
    /**
     * aggiungi una ordinazione all'arraylist della cucina
     * @param a ordinazione da aggiungere
     */
    public void addOrdinazioneCucina(Ordinazione a){
        
    }
    /**
     * restituisce un valore boolean per modificare la variabile di stato servito in ordinazione
     * @param a ordinazione da rimuovere
     * @return true come valore boolean
     */
    public boolean removeOrdinazioneCucina(Ordinazione a){
        
        return true;
    }
    /**
     * restituisce un valore boolean per modificare la variabile di stato servito in ordinazione
     * @param a ordinazione da rimuovere
     * @return true come valore boolean
     */
    public boolean removeOrdinazioneBar(Ordinazione a){
        
        return true;
    }
}
