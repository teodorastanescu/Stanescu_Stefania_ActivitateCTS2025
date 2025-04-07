package ro.cts.cereri;

public abstract class ACerere {
    protected String nume;
    protected int id;
    protected String solicitant;


    protected ACerere() {
        this.nume = "Cerere de student";
        this.id = 123456;
        this.solicitant = "Marcel";
    }

    public ACerere(String nume, String solicitant, int id) {
        if(nume.length()>4){
            this.nume="Inexistent";
        }
        else{
            this.nume = nume;
        }

        this.solicitant = solicitant;
        this.id = id;
    }

    public abstract ACerere clonare();

}
