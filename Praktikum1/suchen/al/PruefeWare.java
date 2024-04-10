package suchen.al;

import java.util.ArrayList;

import suchen.bl.Produktinformation;
import suchen.bl.Ware;

public interface PruefeWare {
    ArrayList<Produktinformation> holeDetailinformation(Ware ware);
}
