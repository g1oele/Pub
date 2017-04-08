package model;

import java.util.Date;
/**
 * Classe per la gestione della data all'interno di un programma
 * @author negri.gioele
 */
public class Data {
    private static Date data = new Date();
    String d ;
    /**
     * stampa la data e l'ora attuale
     */
    public Data(){
        d = data.getMonth()+"-" + data.getDay() + " "+data.getHours() + ":" +data.getMinutes() + ":"+data.getSeconds();
        System.out.println(d);
    }
}
