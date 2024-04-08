package ui.view;

public class SimpleShoppingAppView {
    BegruessungView bView = new BegruessungView();
    MenueView mView = new MenueView();
   
    public void printMenue(){
        mView.printMenue();
    }

    public void printBegruessung(){
        bView.printBegruessung();
    }
}
