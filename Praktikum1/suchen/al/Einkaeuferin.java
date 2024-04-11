package suchen.al;

import java.sql.SQLException;
import java.util.ArrayList;

import suchen.acl.WareDTO;
import suchen.acl.WarenkorbVerwalten;
import suchen.bl.Produktinformation;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;

public class Einkaeuferin implements SucheWare, PruefeWare, WaehleWare {
    private int id;
    private WarenSuchenUndPruefen warenSuchenUndPruefen;
    private ArrayList<Ware> suchergebnisse;
    WarenKonverter konverter;
    WarenkorbVerwalten warenkorbVerwalten;

    public Einkaeuferin(int id) throws SQLException {
        this.id = id;
        warenSuchenUndPruefen = new WarenSuchenUndPruefen();
        konverter = new WarenKonverter();
        warenkorbVerwalten = new WarenkorbVerwalten();
    }

    public ArrayList<Ware> getSuchergebnisse() {
        return suchergebnisse;
    }

    @Override
    public boolean wareZuWarenkorbHinzufuegen(String warenname) {
        Ware ware = null;
        for(Ware w : suchergebnisse){
            if(w.getName().equals(warenname)){
                ware = w;
            }
        }
        if(ware != null){
            WareDTO wareDTO = konverter.wareToDto(ware, id);
            warenkorbVerwalten.wareZuWarenkorbHinzufuegen(wareDTO);
            return true;
        }
        return false;
       
    }

    @Override
    public Produktinformation holeDetailinformation(String warenname) {
        Ware ware = null;
        for (Ware w : suchergebnisse) {
            if (w.getName().equals(warenname)) {
                ware = w;
            }
        }
        if (ware != null) {
            return warenSuchenUndPruefen.pruefen(ware);
        } else {
            System.out.println("Der Artikel konnte nicht gefunden werden.");
            return null;
        }
    }

    @Override
    public ArrayList<Ware> sucheWare(String warenname) {
        suchergebnisse = warenSuchenUndPruefen.suchen(warenname);
        return suchergebnisse;

    }

    @Override
    public void algorithmusFestlegen(SuchAlgorithmus algorithmus) {
        warenSuchenUndPruefen.legeSuchalgorithmusFest(algorithmus);
    }

}
