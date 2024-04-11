import java.sql.Connection;
import java.sql.SQLException;
import DB.Db;

import ui.control.MenueControl;

public class SimpleShoppingApp {

    public static void main(String[] args) throws SQLException {

        MenueControl menueControl = new MenueControl();
        menueControl.navigateMenue();
        
        
    }
}
