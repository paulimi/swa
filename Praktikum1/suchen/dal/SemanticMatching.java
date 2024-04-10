package suchen.dal;

import java.util.ArrayList;

import DB.Repository.WarenDAO;
import DB.Repository.WarenDAOImpl;
import suchen.bl.Ware;

public class SemanticMatching implements WarenSuche{
    private WarenDAO warenDAO;

    private static String sql = "SELECT warennummer, name, preis, beschreibung FROM waren WHERE name LIKE ? OR beschreibung LIKE ?";

    public SemanticMatching(){
        warenDAO = new WarenDAOImpl(null) 
    }
    public static String getSql(){
        return sql;
    }

    @Override
    public ArrayList<Ware> sucheWare(String suchbegriff) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucheWare'");
    }

}
