package ro.cts.main;

import ro.cts.models.Card;
import ro.cts.models.Cash;
import ro.cts.models.MetodaPlata;
import ro.cts.models.Pacient;

public class Main {
    public static void main(String[] args) {

        MetodaPlata card=new Card(1000);
        Pacient p1=new Pacient(123, card);
        p1.realizeazaPlata(700);

        MetodaPlata cash=new Cash();
        p1.setMetodaPlata(cash);
        p1.realizeazaPlata(500);

    }
}