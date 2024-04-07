package ui.view;

public class SimpleShoppingAppView {
    BegruessungView bView = new BegruessungView();
    MenueView mView = new MenueView();
   
    public void printView(){
        bView.printBegruessung();
        mView.printMenue();
    }
}
