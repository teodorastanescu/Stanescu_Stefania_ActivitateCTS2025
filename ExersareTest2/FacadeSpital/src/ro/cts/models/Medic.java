package ro.cts.models;

public class Medic {
    private String nume;
    private boolean confirmareInternare;

    public Medic(String nume, boolean confirmareInternare) {
        this.nume = nume;
        this.confirmareInternare = confirmareInternare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isConfirmareInternare() {
        return confirmareInternare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setConfirmareInternare(boolean confirmareInternare) {
        this.confirmareInternare = confirmareInternare;
    }

}
