package suchen.al;

import java.util.List;

import suchen.acl.WarenkorbFuerSuche;
import suchen.bl.Produktinformation;
import suchen.bl.Ware;

public class EinkaeuferIn implements HoleWarenkorb, PruefeWare, SucheWare, WaehleWare {

    public WarenkorbFuerSuche holeWarenkorb() {
        return null;
    }

    public WarenkorbFuerSuche holeWarenkorb(long warenkorbnummer) {
        return  null;
    }

    public boolean wareZuWarenkorbHinzufuegen(Ware ware) {
        return false; 
    }

    public List<Produktinformation> holeDetailinformation(Ware ware) {
        return null; 
    }
}