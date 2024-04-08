package DB.Repository;

import java.util.List;

import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;

public interface WarenDAO {
    public List<Ware> getWarenByName(String warenName, SuchAlgorithmus suchAlgorithmus);
    
}
