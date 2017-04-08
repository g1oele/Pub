package model;

import java.util.HashMap;
    /**
     * menu del ristorante
     * contiene una hashmap contente i prodotti con chiave: nome e valore: prezzo
     * @author negri.gioele
     */
public class Menu {
    private HashMap<String,Integer> prodotti = new HashMap<String,Integer>();
    
    /**
     * restituisce i prodotti del pub
     * @return hashmap
     */
    public HashMap getMenu(){
        return prodotti;
    }
    /**
     * aggiungi un prodotto al menu del pub
     * @param a nome del prodotto
     * @param b prezzo del prodotto
     */
    public void setNuovoProdotto(String a, int b){
            
    }
    /**
     *  Rimuove il prodotto specificato
     * @param a nome del prodotto
     */
    public void removeProdotto(String a){
        
    }
    /**
     * Restituisce il prezzo di un prodotto dato in ingresso il nome
     * @param a nome prodotto
     * @return prezzo
     */
    public int getPrezzo(String a){
        return prodotti.get(a);
    }
}
