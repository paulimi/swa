package suchen.al;

import suchen.acl.WareDTO;
import suchen.bl.Ware;

public class WarenKonverter {
    public WareDTO wareToDto(Ware ware, int id){
        return new WareDTO(ware, id);
    }
}
