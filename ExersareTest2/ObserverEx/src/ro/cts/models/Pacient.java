package ro.cts.models;

public class Pacient implements Observer{

    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume + "ai primit de la spital urmatorul mesaj: " + mesaj);
    }
}
