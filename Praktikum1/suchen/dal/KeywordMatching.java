package suchen.dal;

import java.util.ArrayList;

import suchen.bl.Ware;

public class KeywordMatching implements WarenSuche {
    private static String sql = "SELECT warennummer, name, preis, beschreibung FROM waren WHERE name = ?";
    @Override
    public ArrayList<Ware> sucheWare(String suchbegriff) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucheWare'");
    }

    public static String getSql(){
        return sql;
    }

}
