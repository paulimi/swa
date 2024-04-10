package suchen.ui.control;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import DB.Db;
import suchen.al.Einkaeuferin;
import suchen.ui.view.MainView;

public class MainController implements Callback {
    Einkaeuferin einkaeuferin;
    MainView view;
    SucheControl sucheControl;
    PruefControl pruefControl;
    AuswahlControl auswahlControl;
    Connection connection;
    Db db;

    public MainController() throws SQLException{
        einkaeuferin = new Einkaeuferin(id);
        view = new MainView();
        sucheControl = new SucheControl(einkaeuferin);
        pruefControl = new PruefControl(einkaeuferin);
        auswahlControl = new AuswahlControl(einkaeuferin);
        db = new Db();
        connection = db.openConnection();
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
                    sucheControl.setCallback(this);
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

    public void pruefenUndAuswahl(){
        view.printPruefenOderAuswahl();
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        switch(in){
            case "1": 
                auswahlControl.startAuswahlControl();
                break;
            case "2":
                pruefControl.startPruefControl();
                break;
            default: break;
        }
    }


    @Override
    public void zumMainController() {
        pruefControl.startPruefControl();
    }

    

   


}
