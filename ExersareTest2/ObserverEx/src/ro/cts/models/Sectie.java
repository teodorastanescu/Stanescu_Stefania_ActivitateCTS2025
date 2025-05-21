package ro.cts.models;

public class Sectie extends Spital{

    private String nume;

    public Sectie(String nume) {
        super(nume);
    }

    @Override
    public void mentioneazaSectie() {
        trimiteMesaj( this.getNume()+ " este numele sectiei unde s-a detectat alerta");
    }
}
