package Praktikum1.suchen.al;

import java.util.List;

import Praktikum1.suchen.bl.Produktinformation;
import Praktikum1.suchen.bl.Ware;

public interface PruefeWare {
    List<Produktinformation> holeDetailinformation(Ware ware);
}
