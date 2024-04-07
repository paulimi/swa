package suchen.al;

import java.util.List;

import suchen.bl.Produktinformation;
import suchen.bl.Ware;

public interface PruefeWare {
    List<Produktinformation> holeDetailinformation(Ware ware);
}
