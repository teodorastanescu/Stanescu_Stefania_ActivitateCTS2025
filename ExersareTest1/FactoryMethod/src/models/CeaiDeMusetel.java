package models;

public class CeaiDeMusetel extends Bautura{


    public CeaiDeMusetel(String nume, int pret, int cantitate) {
        super(nume, pret, cantitate);
    }

    @Override
    public void getDescriere() {
        System.out.println("S-a creat bautura care costa: " + super.getPret());
    }
}
