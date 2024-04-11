package suchen.ui.control;

import java.util.Scanner;

import suchen.al.WaehleWare;
import suchen.ui.view.AuswahlView;

public class AuswahlControl {
    WaehleWare waehleWare;
    MainController controller;
    AuswahlView view;

    public AuswahlControl(WaehleWare waehleWare, MainController controller) {
        this.waehleWare = waehleWare;
        this.controller = controller;
        view = new AuswahlView();
    }

    public void startAuswahlControl(Scanner scanner) {
        view.printAuswahlMenue();
        String in = scanner.nextLine();
        String artikelname;

        switch (in) {
            case "1":
                view.artikelNameEingeben();
                artikelname = scanner.nextLine();
                waehleWare.wareZuWarenkorbHinzufuegen(artikelname);
                break;
            case "2":
                controller.controlSuchenStart(scanner);
                break;
            default:
                controller.controlSuchenStart(scanner);
                break;
        }
    }
}
