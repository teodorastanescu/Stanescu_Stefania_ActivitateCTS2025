package ro.cts.models;

public class RezultatPrintat implements IRezultat{
    private String rezultat;

    public RezultatPrintat(String rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void afisare() {
        System.out.println("Rezultatele pacientului sunt urmatoarele: " + rezultat);
    }
}
