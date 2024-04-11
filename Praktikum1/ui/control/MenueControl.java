package ui.control;

import ui.view.SimpleShoppingAppView;

import java.sql.SQLException;
import java.util.Scanner;

import suchen.ui.control.MainController;

public class MenueControl {

    SimpleShoppingAppView view;
    MainController controlSuchen;
    boolean isRunning;

    public MenueControl() throws SQLException {
        view = new SimpleShoppingAppView();
        controlSuchen = new MainController();
        isRunning = true;
        view.printBegruessung();
    }

    public void navigateMenue() {
        Scanner scanner = new Scanner(System.in);
        String in;
        view.printMenue();
        in = scanner.nextLine();
        switch (in) {
            case "1":
                controlSuchen.controlSuchenStart(scanner);
            case "2":
                System.out.println("Warenkorb noch nicht verfuegbar.");
                break;
            case "3":
                System.out.println("Kasse noch nicht verfuegbar.");
                break;
            case "4":
            default:
                break;
        }
        scanner.close();

    }
}
