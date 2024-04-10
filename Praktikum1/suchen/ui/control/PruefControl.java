package suchen.ui.control;

import java.util.Scanner;

import suchen.al.PruefeWare;
import suchen.ui.view.PruefView;

public class PruefControl {
    PruefeWare pruefeWare;
    PruefView view;
   
    public PruefControl(PruefeWare pruefeWare){
        this.pruefeWare = pruefeWare;
    }

    public void startPruefControl(){
        view.printPruefMenue();

        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        
        
    }

}
