package suchen.al;

import java.util.List;

import suchen.bl.Produktinformation;
import suchen.bl.Ware;

public class Einkaeuferin implements SucheWare, PruefeWare, WaehleWare {
    public int id;

    @Override
    public boolean wareZuWarenkorbHinzufuegen(Ware ware) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wareZuWarenkorbHinzufuegen'");
    }

    @Override
    public List<Produktinformation> holeDetailinformation(Ware ware) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'holeDetailinformation'");
    }

    @Override
    public Ware sucheWare(String warenname) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucheWare'");
    }

}
