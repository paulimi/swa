package suchen.al;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import suchen.bl.Produktinformation;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;

public class Einkaeuferin implements SucheWare, PruefeWare, WaehleWare {
    private int id;
    private WarenSuchenUndPruefen warenSuchenUndPruefen;

    public Einkaeuferin(int id) throws SQLException{
        this.id = id;
        warenSuchenUndPruefen = new WarenSuchenUndPruefen();
    }

    @Override
    public boolean wareZuWarenkorbHinzufuegen(Ware ware) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wareZuWarenkorbHinzufuegen'");
    }

    @Override
    public ArrayList<Produktinformation> holeDetailinformation(Ware ware) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'holeDetailinformation'");
    }

    @Override
    public ArrayList<Ware> sucheWare(String warenname) {
       return warenSuchenUndPruefen.suchen(warenname);
        
    }

    @Override
    public void algorithmusFestlegen(SuchAlgorithmus algorithmus){
        warenSuchenUndPruefen.legeSuchalgorithmusFest(algorithmus);
    }

}
