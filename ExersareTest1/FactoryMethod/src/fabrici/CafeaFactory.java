package fabrici;

import models.Bautura;
import models.Cappuccino;
import models.Espresso;


public class CafeaFactory implements ICafenea {

    @Override
    public Bautura getBautura(TipBautura tip, String nume, int pret, int cantitate) {
        return switch (tip){
            case TipCafea.Cappuccino -> new Cappuccino(nume, pret, cantitate);
            case TipCafea.Espresso -> new Espresso(nume, pret, cantitate);
            default -> null;
        };
    }
}
