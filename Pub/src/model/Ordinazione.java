package model;
import java.util.ArrayList;

/**
 * Classe per le ordinazioni dei clienti
 * Gestisce bevande, alimenti e numero del tavolo
 * @author baudini.lorenzo
 */
public class Ordinazione {
    //ATTRIBUTI
    private int NumeroTavolo;
    private ArrayList<String> bevande = new ArrayList<String>();
    private ArrayList<String> alimenti = new ArrayList<String>();
    private boolean servitoAlimenti = false;
    private boolean servitoBevande = false;
    //METODI
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
     * aggiunge un alimento alla lista dell'ordine riguardante gli alimenti
     * @param a alimento da aggiungere all'ordinazione
     */
    public void addAlimenti(String a){
    }
    /**
     * Restituisce gli alimenti ordinati
     * @return ArrayList alimenti
     */
    public ArrayList<String> getAlimenti(){
        return alimenti;
    }
    /**
     *  aggiunge una bevanda alla lista dell'ordine riguardante le bevande
     * @param a bevanda da aggiungere all'ordinazione
     */
    public void addBevande(String a){
        
    }
    /**
     * restituisce la lista delle bevande
     * @return ArrayList benvade
     */
    public ArrayList<String> getBevande(){
        return bevande;
    }
    /**
     * rimuove dalla lista delle ordinazioni  un alimento specificato
     * @param a alimento da rimuovere dall'ordinazione
     */
    public void removeAlimenti(String a){
        
    }
    /**
     * rimuove dalla lista delle ordinazioni una bevanda specificata
     * @param a bevanda da rimuovere dall'ordinazione
     */
    public void removeBevande(String a){
        
    }
    /**
     * stampa tutta la lista di alimenti ordinati
     */
    public void printAlimenti(){
        
    }
    /**
     * stampa tutta la lista delle bevande ordinate
     */
    public void printBevande(){
        
    }
    /**
     * cambia il valore booleano che indica se l'ordine riguardante le bevande è stato servito
     * @param a aggiornamento valore boolean [true-false]
     */
    public void changeServitoBevande(boolean a){
        
    }
    /**
     * cambia il valore booleano che indica se l'ordine riguardante gli alimenti è stato servito
     * @param a aggiornamento valore boolean [true-false]
     */
    public void changeServitoAlimenti(boolean a){
        
    }
}
