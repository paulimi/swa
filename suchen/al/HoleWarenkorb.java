package suchen.al;

import suchen.acl.WarenkorbFuerSuche;

public interface HoleWarenkorb{
    WarenkorbFuerSuche holeWarenkorb();
    WarenkorbFuerSuche holeWarenkorb(long warenkorbnummer);
}