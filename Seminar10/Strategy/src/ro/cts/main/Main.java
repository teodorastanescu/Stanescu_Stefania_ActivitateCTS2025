package ro.cts.main;

import ro.cts.models.Calator;
import ro.cts.models.CardCalatorie;
import ro.cts.models.IMetodaPlata;
import ro.cts.models.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlata = new CardCalatorie(5);
        Calator calator = new Calator("Andreea", metodaPlata);
        calator.platesteBilet(5);
        calator.setMetodaPlata(new PlataSMS());
        calator.platesteBilet(5);
        calator.setMetodaPlata(metodaPlata);
        calator.platesteBilet(5);
    }
}