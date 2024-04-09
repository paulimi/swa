package suchen.dal;

import java.util.ArrayList;

import DB.Repository.WarenDAOImpl;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;

public class WarenRepository {
    WarenDAOImpl warenDAO;
    public ArrayList<Ware> sucheInDB(String suchbegriff, SuchAlgorithmus suchAlgorithmus){
        return warenDAO.getWarenByName(suchbegriff, suchAlgorithmus);
    }
}
