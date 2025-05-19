package ro.cts.main;

import ro.cts.models.Autobuz;
import ro.cts.models.Calator;
import ro.cts.models.MijlocTransport;
import ro.cts.models.Observer;

public class Main {
    public static void main(String[] args) {

        Observer calator1 = new Calator("calator 1");
        Observer calator2 = new Calator("calator 2");
        Observer calator3 = new Calator("calator 3");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.stergeObserver(calator2);
    }
}