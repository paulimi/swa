package suchen.dal;


import java.sql.SQLException;

import DB.Db;

public class Main {

    public static void main(String[] args) {
       Db db = new Db();
        try {
            db.createDb();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
