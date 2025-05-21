package ro.cts.main;

import ro.cts.models.AOcupare;
import ro.cts.models.Ocupare;
import ro.cts.models.OcupareBufetSuedez;

public class Main {
    public static void main(String[] args) {

        AOcupare ocupare= new Ocupare(4);
        AOcupare ocupareBufet= new OcupareBufetSuedez();

        ocupareBufet.ocupareMasaLive();
        ocupareBufet.ocupareMasa();

        ocupare.ocupareMasa();
        ocupare.ocupareMasaLive();
    }
}