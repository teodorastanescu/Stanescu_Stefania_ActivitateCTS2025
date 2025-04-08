package fabrici;

import models.Bautura;

public interface ICafenea {
    Bautura getBautura(TipBautura tipBautura, String nume, int pret, int cantitate);
}
