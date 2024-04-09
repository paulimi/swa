package suchen.ui.control;

import java.util.Scanner;

import suchen.al.Einkaeuferin;
import suchen.ui.view.SuchenStartView;

public class MainController {
    Einkaeuferin einkaeuferin;
    SuchenStartView view;
    SucheControl sucheControl;
    PruefControl pruefControl;
    AuswahlControl auswahlControl;

    public MainController(){
        einkaeuferin = new Einkaeuferin(id);
        view = new SuchenStartView();
        sucheControl = new SucheControl(einkaeuferin);
        pruefControl = new PruefControl(einkaeuferin);
        auswahlControl = new AuswahlControl(einkaeuferin);
    }
    
    boolean isRunning = true;
    int id = 1;

    public void increaseId(int id){
        id++;
    }

    
    public void controlSuchenStart(){
        Scanner scanner = new Scanner(System.in);
        String in;
        increaseId(id);
        while(isRunning){
            view.printSucheStart();
            in = scanner.nextLine();

            switch(in){
                case "1": 
                    sucheControl.startSucheControl();
                    break;
                case "2":
                    System.out.println("Zurueck ins Menue");
                    isRunning = false;
                    break;
                default: break;
            }
        }
        scanner.close();
    }

    

   


}
