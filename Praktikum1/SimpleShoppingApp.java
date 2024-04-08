import java.sql.Connection;
import java.sql.SQLException;

import DB.Db;


public class SimpleShoppingApp {
    public static void main(String[] args) {
        
       Db db = new Db();
        try {
            Connection connection = db.openConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
