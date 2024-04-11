package suchen.acl;

import suchen.al.WaehleWare;
import suchen.bl.Ware;

public class WarenkorbVerwalten implements WaehleWare {

    @Override
    public boolean wareZuWarenkorbHinzufuegen(Ware ware) {
        System.out.println("Artikel wurde dem Warenkorb hinzugefuegt!");
        return true;
    }
    
}
