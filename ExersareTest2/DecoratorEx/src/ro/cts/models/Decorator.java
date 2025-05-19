package ro.cts.models;

public abstract class Decorator implements IRezultat{

    private IRezultat rezultatPrintat;

    public Decorator(RezultatPrintat rezultatPrintat) {
        this.rezultatPrintat = rezultatPrintat;
    }

    @Override
    public void afisare() {
        rezultatPrintat.afisare();
        formatAfisare();
    }
    protected abstract void formatAfisare();
}
