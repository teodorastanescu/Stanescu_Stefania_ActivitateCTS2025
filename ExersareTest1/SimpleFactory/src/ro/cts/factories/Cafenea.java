package ro.cts.factories;
import ro.cts.models.Cafea;
import ro.cts.models.Cappuccino;
import ro.cts.models.Espresso;

public class Cafenea {
    private float pret;
    private String nume;

    public Cafenea(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public Cafea getCafea(TipCafea tipCafea, float pret, String nume, int cantitate, Boolean areLapte){
        switch (tipCafea){
            case ESPRESSO -> {return new Espresso(pret, nume, cantitate, areLapte);}
            case CAPPUCCINO -> {return new Cappuccino(pret, nume, cantitate, areLapte);}
            default -> {
                return null;
            }
        }

    }
}
