package suchen.dal;

import java.util.ArrayList;

import DB.Repository.WarenDAO;
import DB.Repository.WarenDAOImpl;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;

public class KeywordMatching implements WarenSuche {
    private WarenDAO warenDAO;
    private static String sql = "SELECT warennummer, name, preis, beschreibung FROM waren WHERE name = ?";

    public KeywordMatching() {
        warenDAO = new WarenDAOImpl();
    }

    @Override
    public ArrayList<Ware> sucheWare(String suchbegriff) {
        return warenDAO.getWarenByName(suchbegriff, SuchAlgorithmus.KeywordMatching);
    }

    public static String getSql(){
        return sql;
    }
}
