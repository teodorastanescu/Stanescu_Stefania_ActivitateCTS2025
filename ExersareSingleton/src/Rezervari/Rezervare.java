package Rezervari;

public class Rezervare {
    private String numeClient;
    private int varsta;
    private float sumaPlata;

    public Rezervare(String numeClient, int varsta, float sumaPlata) {
        this.numeClient = numeClient;
        this.varsta = varsta;
        this.sumaPlata = sumaPlata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", sumaPlata=").append(sumaPlata);
        sb.append('}');
        return sb.toString();
    }
}
