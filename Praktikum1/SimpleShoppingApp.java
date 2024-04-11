import java.sql.SQLException;

import ui.control.MenueControl;

public class SimpleShoppingApp {

    public static void main(String[] args) {
        try {
            MenueControl menueControl = new MenueControl();
            menueControl.navigateMenue();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
