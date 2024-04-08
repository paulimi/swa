package suchen.bl;

import java.util.ArrayList;


public interface Katalog {
    public SuchAlgorithmus legeSuchalgorithmusFest();
    public ArrayList<Ware> suchen(String warenname);
    public Ware suchen(long warenNummer);
    public Produktinformation gebeProduktinformationen(Ware ware);
}
