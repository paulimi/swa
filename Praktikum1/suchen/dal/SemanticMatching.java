package suchen.dal;

import suchen.bl.Ware;

public class SemanticMatching implements WarenSuche{

    private static String sql = "SELECT warennummer, name, preis, beschreibung FROM waren WHERE name LIKE ? OR beschreibung LIKE ?";

    public static String getSql(){
        return sql;
    }

    @Override
    public Ware sucheWare(String suchbegriff) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucheWare'");
    }

}
