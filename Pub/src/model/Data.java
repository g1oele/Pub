package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;
/**
 * Classe per la gestione della data all'interno di un programma
 * @author negri.gioele
 */
public class Data {
    private static Date data;
    private long momento;
    private String d;
    /**
     * inizializza la data e l'ora con quelle attuali
     */
    public Data(){
        momento = Instant.now().toEpochMilli();
        data = new Date(momento);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("CET"));
        d = format.format(data);
    }
    /**
     * Stampa l'ultima data salvata
     */
    public void printLatestData(){
        System.out.println(d);
    }
    /**
     * Stampa la data attuale
     */
    public void printCurrentData(){
        refreshData();
        System.out.println(d);
    }
    /**
     * Aggiorna la data con quella corrente sovrascrivendo i valori di d e di momento
     */
    public void refreshData(){
        momento = Instant.now().toEpochMilli();
        data = new Date(momento);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("CET"));
        d = format.format(data);
    }
    /**
     * Restituisce l'ultima data salvata come stringa in gg/mm/aaaa hh:mm:ss
     * @return gg/mm/aaaa hh:mm:ss
     */
    public String getLatestData(){
        return d;
    }
    /**
     * Restituisce la data corrente come stringa in gg/mm/aaaa hh:mm:ss
     * @return gg/mm/aaaa hh:mm:ss
     */
    public String getCurrentData(){
        refreshData();
        return d;
    }
}