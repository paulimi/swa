package suchen.bl;

public class Produktinformation {
    private long artikelNr;
    private String name;
    private Geld preis;
    private String beschreibung;

    public Produktinformation(long warennummer, String name, Geld preis, String beschreibung) {
        this.artikelNr = warennummer;
        this.name = name;
        this.preis = preis;
        this.beschreibung = beschreibung;
    }

    public long getArtikelNr() {
        return this.artikelNr;
    }

    public String getName() {
        return this.name;
    }

    public Geld getPreis() {
        return this.preis;
    }

    public String getBeschreibung() {
        return this.beschreibung;
    }

    public String toString() {
        return artikelNr + " " + name + " " + preis.betrag + " " + beschreibung;
    }

}
