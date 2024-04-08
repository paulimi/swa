import java.sql.SQLException;

import suchen.dal.Db;
import ui.control.MenueControl;

public class SimpleShoppingApp {

    public static void main(String[] args) {

        MenueControl menueControl = new MenueControl();
        menueControl.navigateMenue();
        Db db = new Db();
            try {
                db.createDb();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        
    }
}
