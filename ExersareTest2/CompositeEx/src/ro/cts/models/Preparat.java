package ro.cts.models;

public class Preparat extends Meniu{

    public Preparat(String nume, int gramaj) {
        super(nume, gramaj);
    }

    @Override
    public void adaugaPreparat(Meniu m) {
        System.out.println("nu este posibil");
    }

    @Override
    public void stergePreparat(Meniu m) {
        System.out.println("nu este posibil");
    }

    @Override
    public Meniu veziNod(int index) {
        return null;
    }

    @Override
    public void afiseaza() {
        System.out.println("Preparatul este" +this.getNume());
    }

    @Override
    public int calculeazaCantitate() {
        return this.getGramaj();
    }
}
