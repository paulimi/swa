import java.sql.SQLException;

import suchen.dal.Db;

public class SimpleShoppingApp {
    public static void main(String[] args) {
        
       Db db = new Db();
        try {
            db.createDb();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
