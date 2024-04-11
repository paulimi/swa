package DB.Repository;

import java.util.ArrayList;

import suchen.bl.Produktinformation;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;

public interface WarenDAO {
    public ArrayList<Ware> getWarenByName(String warenName, SuchAlgorithmus suchAlgorithmus);
    public Produktinformation getProduktinformation(Ware ware);
    
}
