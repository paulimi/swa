package suchen.ui.control;

import java.util.ArrayList;
import java.util.Scanner;

import suchen.al.SucheWare;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;
import suchen.ui.view.SuchView;

public class SucheControl {
    SuchView suchView;
    SucheWare einkaeuferin;

    public SucheControl(SucheWare sucheWare) {
        suchView = new SuchView();
        this.einkaeuferin = sucheWare;
    }

    public void startSucheControl() {
        algorithmusFestlegen();
        suchView.printSuchbegriffEingabe();
        String in;
        Scanner scanner = new Scanner(System.in);

        in = scanner.nextLine();
        ArrayList<Ware> suchergebnisse = einkaeuferin.sucheWare(in);
        // TODO wie navigieren wir zur PrüfControl?
        suchView.printSuchergebnisse(suchergebnisse);
        scanner.close();

    }

    public void algorithmusFestlegen() {
        suchView.printAlgorithmusWaehlen();
        Scanner scanner = new Scanner(System.in);
        String algo = scanner.nextLine();

        switch (algo) {
            case "1":
                einkaeuferin.algorithmusFestlegen(SuchAlgorithmus.KeywordMatching);
                break;
            case "2":
                einkaeuferin.algorithmusFestlegen(SuchAlgorithmus.SemanticMatching);
                break;
            default:
                einkaeuferin.algorithmusFestlegen(SuchAlgorithmus.KeywordMatching);
                break;

        }
        scanner.close();
    }
}
