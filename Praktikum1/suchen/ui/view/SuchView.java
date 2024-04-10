package suchen.ui.view;

import java.util.ArrayList;

import suchen.bl.Ware;

public class SuchView {
    public void printAlgorithmusWaehlen(){
        System.out.println("1. Keyword-Matching");
        System.out.println("2. Semantic Matching");
        System.out.println("Wie willst du suchen?");
    }

    public void printSuchbegriffEingabe(){
        System.out.println("Wonach willst du suchen?");
        System.out.println();
    }

    public void printSuchergebnisse(ArrayList<Ware> suchergebnisse){
        for(Ware ware : suchergebnisse){
            System.out.println(ware.toString());
            System.out.println();
        }
    }

    
}
