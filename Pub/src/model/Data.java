package model;

import java.util.Date;

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
