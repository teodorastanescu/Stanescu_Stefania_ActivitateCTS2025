package ro.cts.models;

public class Sectie extends StructuraAbs{



    public Sectie(String nume, int numeAngajati) {
        super(nume, numeAngajati);
    }

    @Override
    public void adaugaNod(StructuraAbs structuraAbs) {
        System.out.println("Nu se poate!");
    }

    @Override
    public void stergeNod(StructuraAbs structuraAbs) {

        System.out.println("Nu se poate!");
    }

    @Override
    public StructuraAbs getNodCopil(int indexCopil) {
        return null;
    }

    @Override
    public void afiseazaDescriere() {

        System.out.println("Sectie" + this.getNume());
    }

    @Override
    public int calculeazaNrAngajati() {
        return this.getNumarAngajati();
    }
}
