package DB;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db {
    private static Connection connection;
    private static String dbURL = "jdbc:derby:AppDb;create=true";

    public void createDb() throws SQLException {

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            connection = openConnection();
            createTable();
            fillDb();

        } catch (Exception except) {
            except.printStackTrace();
        }
    }

    private void createTable() throws SQLException {
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet = metaData.getTables(null, null, "waren", null);
        // Prüfen ob die Tabelle in der DB schon existiert
        if (!resultSet.next()) {
            Statement statement = connection.createStatement();
            String createTable = "CREATE TABLE waren (warennummer BIGINT PRIMARY KEY, name VARCHAR(255), preis FLOAT, beschreibung VARCHAR(255))";
            statement.executeUpdate(createTable);
            statement.close();
        } else {
            System.out.println("Die Tabelle existiert bereits.");
        }
    }

    private void addWare(long warennummer, String name, float preis, String beschreibung) throws SQLException {
        String insertWare = "INSERT INTO waren (warennummer, name, preis, beschreibung) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertWare)) {
            preparedStatement.setLong(1, warennummer);
            preparedStatement.setString(2, name);
            preparedStatement.setFloat(3, preis);
            preparedStatement.setString(4, beschreibung);

            preparedStatement.executeUpdate();
            System.out.println("Hinzugefuegt: " + warennummer + " " + name + " " + preis + " " + beschreibung);
        } catch (SQLException e) {
            System.err.println("addWare: Ein Fehler ist aufgetreten");
        }
    }

    private void fillDb() throws SQLException {
        addWare(1, "Blumentopf", 5.99f, "Garten, Tontopf, 15cm");
        addWare(2, "Gartenschere", 15.99f, "Garten, Edelstahlschere");
        addWare(3, "Kochtopf", 39.99f, "Haushalt, Edelstahltopf");
        addWare(4, "Kaffeemaschine", 29.99f, "Haushalt, Filter");
        addWare(5, "Kaffee", 8.99f, "Lebensmittel, gemahlen");
        addWare(6, "Laptop", 899.99f, "Elektronik, ASUS VivoBook");
        addWare(7, "Grundlagen der Elektronik", 14.99f, "Buch, Gebundene Ausgabe");
        addWare(8, "Kopfhoerer", 119.99f, "Elektronik, Bluetooth");
        addWare(9, "Java ist auch eine Insel", 49.90f, "Buch, Gebundene Ausgabe");
    }

    public Connection openConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                connection = DriverManager.getConnection(dbURL);
            } catch (SQLException e) {
                e.printStackTrace();
                throw e; // Wir geben die Exception weiter, um sie an den Aufrufer zu signalisieren
            }
        }
        return connection;
    }

}
