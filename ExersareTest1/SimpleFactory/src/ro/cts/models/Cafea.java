package ro.cts.models;

public abstract class Cafea {
    private float pret;
    private String nume;
    private int cantitate;
    private Boolean areLapte;

    public Cafea(float pret, String nume, int cantitate, Boolean areLapte) {
        this.pret = pret;
        this.nume = nume;
        this.cantitate = cantitate;
        this.areLapte = areLapte;
    }

    public abstract void descriereCafea();
    public abstract float pretFinal();

    public float getPret() {
        return pret;
    }

    public int getCantitate() {
        return cantitate;
    }
}
