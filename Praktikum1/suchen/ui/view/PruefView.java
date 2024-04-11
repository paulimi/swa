package suchen.ui.view;

import suchen.bl.Produktinformation;

public class PruefView {
    public void printPruefMenue(){
        System.out.println("Für welchen Artikel möchtest du die Detailinformationen sehen?");
    }

    public void printDetailansicht(Produktinformation produktinformation){
        System.out.println(produktinformation.toString());
        System.out.println();
        printZurueckZumSuchenMenue();
    }

    public void printZurueckZumSuchenMenue(){
        System.out.println("1. Exit");
    }

}
