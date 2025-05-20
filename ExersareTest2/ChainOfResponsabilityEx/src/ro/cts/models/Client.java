package ro.cts.models;

public class Client {
    private String nume;
    private int nrTelefon;
    private String email;

    public Client(String nume, int nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(int nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
