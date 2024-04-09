package suchen.ui.control;

import java.util.ArrayList;
import java.util.Scanner;

import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;
import suchen.dal.WarenRepository;
import suchen.ui.view.SuchView;

public class SucheControl {
    SuchView suchView;
    WarenRepository repository;

    public void startSucheControl(String suchbegriff){
        suchView = new SuchView();
        suchView.printAlgorithmusWaehlen();

        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        scanner.close();
    }

    public ArrayList<Ware> durchsucheDb(String suchbegriff, SuchAlgorithmus suchAlgorithmus){
        return repository.sucheInDB(suchbegriff, suchAlgorithmus);
    }
}
