package suchen.ui.control;

import java.util.Scanner;

import suchen.ui.view.SuchenStartView;
import ui.control.MenueControl;

public class StartSuchenControl {

    SuchenStartView view = new SuchenStartView();
    boolean isRunning = true;
    
    public void controlSuchenStart(){
        Scanner scanner = new Scanner(System.in);
        String in;
        while(isRunning){
            view.printSucheStart();
            in = scanner.nextLine();
        }
        scanner.close();
    }

    public void startNextControl(String suchbegriff){
        SucheControl sucheControl = new SucheControl();
        sucheControl.startSucheControl(suchbegriff);
    }


}
