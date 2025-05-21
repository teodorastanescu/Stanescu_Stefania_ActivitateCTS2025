package ro.cts.models;

public class Pacient implements IPacient{

    private String nume;
    private int nrTelefon;
    private String adresa;

    public Pacient(String nume, int nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void internare(Salon salon) {
        System.out.println("Pacientul "+ nume+ " are numarul de telefon "+ nrTelefon+ " si adresa "+ adresa+ ".Acesta i-a fost alocat salonului:");
        System.out.println(salon.toString());
    }
}
