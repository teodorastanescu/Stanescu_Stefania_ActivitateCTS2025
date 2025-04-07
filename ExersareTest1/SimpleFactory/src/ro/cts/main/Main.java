package ro.cts.main;

import ro.cts.models.Cafea;
import ro.cts.factories.Cafenea;
import ro.cts.factories.TipCafea;

public class Main {
    public static void main(String[] args) {
        Cafenea cafenea= new Cafenea(3.4f, "Meron");
        Cafea comanda1= cafenea.getCafea(TipCafea.CAPPUCCINO, 5.1f, "Cappuccina balerina", 250, Boolean.TRUE);
        //System.out.println(comanda1);  nu afiseaza nimic ok ca nu am string builder

        System.out.println(comanda1.getCantitate());
        comanda1.descriereCafea();
    }
}