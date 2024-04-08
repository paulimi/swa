import java.sql.Connection;
import java.sql.SQLException;

import DB.Db;

import ui.control.MenueControl;

public class SimpleShoppingApp {

    public static void main(String[] args) {

        MenueControl menueControl = new MenueControl();
        menueControl.navigateMenue();
        Db db = new Db();
            try {
                Connection connection = db.openConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        
    }
}
