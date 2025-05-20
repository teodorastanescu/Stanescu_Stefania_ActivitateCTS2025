package ro.cts.models;

public class Ocupare extends AOcupare{

    private int nrPersoane;

    public Ocupare(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void curatareMasa() {
        System.out.println("Masa este curata!");
    }

    @Override
    public void asezareServetele() {
        System.out.println("Este nevoie de "+ nrPersoane+ "servetele");
    }

    @Override
    public void asezareTacamuri() {

        System.out.println("Este nevoie de "+ nrPersoane+ "tacamuri");
    }

    @Override
    public void primireClienti() {

        System.out.println("Sunt intampinati " + nrPersoane+ "clieniti");
    }
}
