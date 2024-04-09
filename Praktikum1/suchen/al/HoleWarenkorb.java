package Praktikum1.suchen.al;

import Praktikum1.suchen.acl.WarenkorbFuerSuche;

public interface HoleWarenkorb{
    WarenkorbFuerSuche holeWarenkorb();
    WarenkorbFuerSuche holeWarenkorb(long warenkorbnummer);
}