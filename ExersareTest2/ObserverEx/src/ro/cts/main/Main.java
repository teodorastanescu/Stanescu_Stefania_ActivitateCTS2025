package ro.cts.main;

import ro.cts.models.Observer;
import ro.cts.models.Pacient;
import ro.cts.models.Sectie;
import ro.cts.models.Spital;

public class Main {
    public static void main(String[] args) {

        Observer pacient1= new Pacient("Clara");
        Observer pacient2= new Pacient("Dan");
        Spital sectieInfectioase= new Sectie("Infectioase");

        sectieInfectioase.adaugaObserver(pacient1);
        sectieInfectioase.adaugaObserver(pacient2);
        sectieInfectioase.mentioneazaSectie();

        sectieInfectioase.stergeObserver(pacient1);
        sectieInfectioase.trimiteMesaj("S-a detectat un virus!!");

    }
}