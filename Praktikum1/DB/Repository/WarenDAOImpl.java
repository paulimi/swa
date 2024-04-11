package DB.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DB.Db;
import suchen.bl.Geld;
import suchen.bl.Produktinformation;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;
import suchen.dal.KeywordMatching;
import suchen.dal.SemanticMatching;

public class WarenDAOImpl implements WarenDAO {
    private Connection connection;

    public WarenDAOImpl() {
        Db db = new Db();
        try {
            connection = db.openConnection();
        } catch (SQLException e) {
            System.out.println("Neue Datenbank wird erstellt...");
        }
        if(connection == null){
            try {
                db.createDb();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public ArrayList<Ware> getWarenByName(String warenName, SuchAlgorithmus suchAlgorithmus) {
        ArrayList<Ware> waren = new ArrayList<>();
        String sql;
        if (suchAlgorithmus == SuchAlgorithmus.SemanticMatching) {
            sql = SemanticMatching.getSql();
        } else {
            sql = KeywordMatching.getSql();
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, warenName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                long warennummer = resultSet.getLong("warennummer");
                String name = resultSet.getString("name");

                Ware ware = new Ware(warennummer, name);
                waren.add(ware);
            }

        } catch (SQLException e) {
            System.err.println("getWarenByName: Es ist ein Fehler aufgetreten.");
        }
        return waren;
    }

    @Override
    public Produktinformation getProduktinformation(Ware ware) {
        Produktinformation produktinformation = null;
        String name = ware.getName();
        String sql = "SELECT warennummer, name, preis, beschreibung FROM waren WHERE name = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                long warennummer = resultSet.getLong("warennummer");
                String artikelName = resultSet.getString("name");
                float preis = resultSet.getFloat("preis");
                String beschreibung = resultSet.getString("beschreibung");
                produktinformation = new Produktinformation(warennummer, artikelName, new Geld(preis), beschreibung);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return produktinformation;
    }
}
