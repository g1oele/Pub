package model;

import java.util.HashMap;

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
}
