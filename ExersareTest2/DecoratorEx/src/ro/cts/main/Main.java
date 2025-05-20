package ro.cts.main;

import ro.cts.models.IRezultat;
import ro.cts.models.RezultatOnlineDecorat;
import ro.cts.models.RezultatPrintat;

public class Main {
    public static void main(String[] args) {

        RezultatPrintat rezultatPacient= new RezultatPrintat("Sunteti complet sanatos!");
        rezultatPacient.afisare();

        IRezultat rezultatOnline= new RezultatOnlineDecorat(rezultatPacient);
        rezultatOnline.afisare();
    }
}