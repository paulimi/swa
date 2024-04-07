package suchen.ui.control;

import java.util.Scanner;

import suchen.ui.view.SuchenStartView;
import ui.control.MenueControl;

public class ControlSuchen {

    SuchenStartView view = new SuchenStartView();
    MenueControl menueControl = new MenueControl();
    boolean isRunning = true;

    public void controlSuchenStart(){
        Scanner scanner = new Scanner(System.in);
        String in;
        while(isRunning){
            view.printSucheStart();
            in = scanner.nextLine();

            switch(in){
                case "1":
                case "2":
                case "3": 
                    menueControl.navigateMenue();
                    break;
                default:
            }
        }
    
    }
}
