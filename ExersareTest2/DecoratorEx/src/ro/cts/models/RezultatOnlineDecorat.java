package ro.cts.models;

public class RezultatOnlineDecorat extends Decorator{

    public RezultatOnlineDecorat(RezultatPrintat rezultatPrintat) {
        super(rezultatPrintat);
    }

    @Override
    protected void formatAfisare() {
        System.out.println("Rezultatele sunt returnate in format online.");
    }
}
