package ro.cts.models;

public class Internare {
    private int nrFisa;
    private int codAfectiune;
    private boolean esteLaSpital;

    public Internare(int nrFisa, int codAfectiune, boolean esteLaSpital) {
        this.nrFisa = nrFisa;
        this.codAfectiune=codAfectiune;
        this.esteLaSpital=esteLaSpital;
    }

    public int getNrFisa() {
        return nrFisa;
    }

    public int getCodAfectiune() {
        return codAfectiune;
    }

    public boolean isEsteLaSpital() {
        return esteLaSpital;
    }
}
