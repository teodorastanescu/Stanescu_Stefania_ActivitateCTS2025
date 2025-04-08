package models;

public abstract class Bautura {
    private String nume;
    private int pret;
    private int cantitate;

    public Bautura(String nume, int pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public int getPret() {
        return pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public abstract void getDescriere();
}
