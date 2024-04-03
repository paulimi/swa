package suchen.al;

import suchen.bl.Produktinformation;
import suchen.bl.Ware;

import java.util.List;

public interface PruefeWare {
    List<Produktinformation> holeDetailinformation(Ware ware);
}
