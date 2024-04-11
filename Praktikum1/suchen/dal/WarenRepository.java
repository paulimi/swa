package suchen.dal;

import java.sql.SQLException;
import java.util.ArrayList;

import DB.Db;
import DB.Repository.WarenDAO;
import DB.Repository.WarenDAOImpl;
import suchen.bl.Katalog;
import suchen.bl.Produktinformation;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;

public class WarenRepository implements Katalog {
    WarenSuche suche;
    Db db;
    WarenDAO warenDAO;
   
    public WarenRepository() throws SQLException{
        warenDAO = new WarenDAOImpl();
    }
    public ArrayList<Ware> sucheInDB(String suchbegriff, SuchAlgorithmus suchAlgorithmus){
        return warenDAO.getWarenByName(suchbegriff, suchAlgorithmus);
    }
    @Override
    public void legeSuchalgorithmusFest(SuchAlgorithmus algorithmus) {
        if(algorithmus == SuchAlgorithmus.SemanticMatching){
            suche = new SemanticMatching();
        }else{
            suche = new KeywordMatching();
        }
    }
    @Override
    public ArrayList<Ware> suchen(String warenname) {
        return suche.sucheWare(warenname);
    }
    @Override
    public Ware suchen(long warenNummer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'suchen'");
    }
    @Override
    public Produktinformation gebeProduktinformationen(Ware ware) {
        return warenDAO.getProduktinformation(ware);
    }
}
