package ro.cts.models;

public abstract class Meniu {

    private String nume;
    private int gramaj;

    public Meniu(String nume, int gramaj) {
        this.nume = nume;
        this.gramaj = gramaj;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGramaj() {
        return gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public abstract void adaugaPreparat(Meniu m);
    public abstract void stergePreparat(Meniu m);
    public abstract Meniu veziNod (int index);
    public abstract void afiseaza ();
    public abstract int calculeazaCantitate();
}
