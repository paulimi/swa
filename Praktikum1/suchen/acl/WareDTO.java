package suchen.acl;

import suchen.bl.Geld;
import suchen.bl.Ware;

public class WareDTO {
    private long warennummer;
    private String name;
    private Geld preis;
    private String beschreibung;
    int warenkorbId;

    public WareDTO(Ware ware, int id){
        this.warennummer = ware.getWarennummer();
        this.name = ware.getName();
        this.warenkorbId = id;
    }
}


