package DB.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import suchen.bl.Geld;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;
import suchen.dal.KeywordMatching;
import suchen.dal.SemanticMatching;

public class WarenDAOImpl implements WarenDAO {
    private Connection connection;

    public WarenDAOImpl(Connection connection){
        this.connection = connection;
    }
    @Override
    public ArrayList<Ware> getWarenByName(String warenName, SuchAlgorithmus suchAlgorithmus) {
        ArrayList<Ware> waren = new ArrayList<>();
        String sql;
        if(suchAlgorithmus == SuchAlgorithmus.KeywordMatching){
            sql = KeywordMatching.getSql();
        }else{
            sql = SemanticMatching.getSql();
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, warenName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                long warennummer = resultSet.getLong("warennummer");
                String name = resultSet.getString("name");
                float preis = resultSet.getFloat("preis");
                String beschreibung = resultSet.getString("beschreibung");

                Ware ware = new Ware(warennummer, name, new Geld(preis), beschreibung);
                waren.add(ware);
            }
                
        } catch (SQLException e) {
            System.err.println("getWarenByName: Es ist ein Fehler aufgetreten.");
        }
        return waren;
    }

   

}
