package ro.cts.cereri;

public class Cerere extends  ACerere{

    protected String tip;

    private Cerere() {
        super();
    }

    public Cerere(String nume, String solicitant, int id, String tip){
       super(nume, solicitant, id);
       this.tip=tip;
    }

    @Override
    public ACerere clonare() {
        Cerere c=new Cerere();
        c.id=this.id;
        c.nume=this.nume;
        c.solicitant=this.solicitant;
        c.tip=this.tip;
        return c;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cerere{");
        sb.append("tip='").append(tip).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", id=").append(id);
        sb.append(", solicitant='").append(solicitant).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
