package suchen.ui.control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import suchen.al.SucheWare;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;
import suchen.ui.view.SuchView;

public class SucheControl {
    SuchView suchView;
    SucheWare einkaeuferin;
    MainController controller;

    public SucheControl(SucheWare sucheWare, MainController controller) {
        suchView = new SuchView();
        this.einkaeuferin = sucheWare;
        try {
            this.controller = new MainController();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void startSucheControl(Scanner scanner) {
        String suchbegriff = null;
        algorithmusFestlegen(scanner);
        handleSuchbegriffEingabe(scanner, suchbegriff);
        ArrayList<Ware> suchergebnisse = einkaeuferin.sucheWare(suchbegriff);
        suchView.printSuchergebnisse(suchergebnisse);
        handleSucheOderMenue(scanner);
    }

    public void algorithmusFestlegen(Scanner scanner) {
        suchView.printAlgorithmusWaehlen();
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
    }

    private void handleSucheOderMenue(Scanner scanner){
        String in;
        suchView.printZurueckInsMenueOderNochmalSuchen();
        in = scanner.nextLine();

        switch(in){
            case "1": 
                startSucheControl(scanner);
                break;
            case "2":
                this.controller.controlSuchenStart(scanner);
            default:
                System.out.println("Keine gueltige Wahl");
        }
    }

    private void handleSuchbegriffEingabe(Scanner scanner, String suchbegriff){
        suchView.printSuchbegriffEingabe();
        suchbegriff = scanner.nextLine();
    }
}
