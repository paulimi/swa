package Praktikum1.suchen.bl;

public class Ware {

    private long warennummer;
    private String name;
    private Geld preis;
    private String beschreibung;

    public Ware(long warennummer, String name, Geld preis, String beschreibung){
        this.warennummer = warennummer;
        this.name = name;
        this.preis = preis;
        this.beschreibung = beschreibung;
    }

}
