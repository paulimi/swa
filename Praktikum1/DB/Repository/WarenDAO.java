package DB.Repository;

import java.util.List;

import suchen.bl.Ware;

public interface WarenDAO {
    public List<Ware> getWarenListeByNameKeyword(String warenName);
    public List<Ware> getWarenListeByNameSemantic(String warenName);
}
