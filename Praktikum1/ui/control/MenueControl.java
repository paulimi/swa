package ui.control;

import ui.view.SimpleShoppingAppView;
import java.util.Scanner;

import suchen.ui.control.ControlSuchen;

public class MenueControl {

    SimpleShoppingAppView view = new SimpleShoppingAppView();
    ControlSuchen controlSuchen = new ControlSuchen();
    boolean isRunning = true;

    public void navigateMenue(){
        Scanner scanner = new Scanner(System.in);
        String in;

        while(isRunning){
            view.printView();
            in = scanner.nextLine();
            switch(in){
                case "1": 
                    controlSuchen.controlSuchenStart();
                    break;
                case "2": 
                    System.out.println("Warenkorb noch nicht verfuegbar.");
                    break;
                case "3":
                    System.out.println("Kasse noch nicht verfuegbar.");
                    break;
                case "4":
                default:

            }
        }
    }
}
