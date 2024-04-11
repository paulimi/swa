package suchen.ui.control;

import java.sql.SQLException;
import java.util.Scanner;

import suchen.al.Einkaeuferin;
import suchen.ui.view.MainView;

public class MainController {
    Einkaeuferin einkaeuferin;
    MainView view;
    SucheControl sucheControl;
    PruefControl pruefControl;
    AuswahlControl auswahlControl;

    public MainController() throws SQLException {
        einkaeuferin = new Einkaeuferin(id);
        view = new MainView();
        sucheControl = new SucheControl(einkaeuferin, this);
        pruefControl = new PruefControl(einkaeuferin, this);
        auswahlControl = new AuswahlControl(einkaeuferin, this);
    }

    int id = 1;

    public void increaseId(int id) {
        id++;
    }

    public void controlSuchenStart(Scanner scanner) {
        String in;
        increaseId(id);
            view.printSucheStart();
            in = scanner.nextLine();

            switch (in) {
                case "1":
                    //sucheControl.setCallback(this);
                    sucheControl.startSucheControl(scanner);
                    break;
                case "2":
                    System.out.println("Zurueck ins Menue");
                    break;
                default:
                    break;
            }
    }

    public void pruefenUndAuswahl(Scanner scanner) {
        String in;
        boolean laeuft = true;
        while (laeuft) {
            view.printPruefenOderAuswahl();
            in = scanner.nextLine();
            switch (in) {
                case "1":
                    auswahlControl.startAuswahlControl(scanner);
                    break;
                case "2":
                    pruefControl.startPruefControl(scanner);
                    break;
                default:
                    break;
            }
        }
    }

}
