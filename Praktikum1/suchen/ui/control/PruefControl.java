package suchen.ui.control;

import java.util.Scanner;

import suchen.al.PruefeWare;
import suchen.ui.view.PruefView;

public class PruefControl {
    PruefeWare pruefeWare;
    PruefView view;
    MainController controller;

    public PruefControl(PruefeWare pruefeWare, MainController controller) {
        this.pruefeWare = pruefeWare;
        this.controller = controller;
    }

    public void startPruefControl(Scanner scanner) {
        String in;
        in = scanner.nextLine();
        view.printPruefMenue();
        view.printDetailansicht(pruefeWare.holeDetailinformation(in));

        in = scanner.nextLine();
        if (in.equals("1")) {
            controller.controlSuchenStart(scanner);
        }
    }

}
