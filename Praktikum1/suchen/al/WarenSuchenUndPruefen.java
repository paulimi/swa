package suchen.al;

import java.sql.SQLException;
import java.util.ArrayList;

import suchen.bl.Katalog;
import suchen.bl.Produktinformation;
import suchen.bl.SuchAlgorithmus;
import suchen.bl.Ware;
import suchen.dal.WarenRepository;

public class WarenSuchenUndPruefen {
    Katalog katalog;

    public WarenSuchenUndPruefen() throws SQLException{
        katalog = new WarenRepository();
    }
    
    public void legeSuchalgorithmusFest(SuchAlgorithmus algorithmus) {
       katalog.legeSuchalgorithmusFest(algorithmus);
    }

    public ArrayList<Ware> suchen(String name){
        return katalog.suchen(name);
    }

    public Produktinformation pruefen(Ware ware){
        return katalog.gebeProduktinformationen(ware);
    }

  
   
}
