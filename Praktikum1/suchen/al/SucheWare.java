
package suchen.al;

import java.util.ArrayList;

import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;

public interface SucheWare {
    public ArrayList<Ware> sucheWare(String warenname);
    public void algorithmusFestlegen(SuchAlgorithmus algorithmus);

}
