package ro.cts.models;

public class Pacient {
    private int id;
    private MetodaPlata metodaPlata;

    public Pacient(int id, MetodaPlata metodaPlata) {
        this.id = id;
        this.metodaPlata = metodaPlata;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void realizeazaPlata(float pret){
        metodaPlata.plateste(pret);
    }
}
