package suchen.al;

import suchen.bl.Katalog;
import suchen.bl.SuchAlgorithmus;
import suchen.dal.WarenRepository;

public class WarenSuchenUndPruefen{
    Katalog katalog = new WarenRepository();

    public void legeSuchalgorithmusFest(SuchAlgorithmus algorithmus) {
       katalog.legeSuchalgorithmusFest(algorithmus);
    }

  
   
}
