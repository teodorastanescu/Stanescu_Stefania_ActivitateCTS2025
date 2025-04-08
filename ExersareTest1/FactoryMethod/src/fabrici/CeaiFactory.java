package fabrici;

import models.Bautura;
import models.CeaiDeMusetel;
import models.CeaiDeTei;

public class CeaiFactory implements ICafenea{
    @Override
    public Bautura getBautura(TipBautura tipBautura, String nume, int pret, int cantitate) {
        return switch (tipBautura){
            case TipCeai.CeaiDeTei -> new CeaiDeTei(nume, pret, cantitate);
            case TipCeai.CeaiDeMusetel ->new CeaiDeMusetel(nume, pret, cantitate);
            default-> null;
        };
    }
}
