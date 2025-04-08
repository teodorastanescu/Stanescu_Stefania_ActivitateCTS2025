package models;

public class Espresso extends Bautura{


    public Espresso(String nume, int pret, int cantitate) {
        super(nume, pret, cantitate);
    }

    @Override
    public void getDescriere() {
        System.out.println("S-a creat bautura care costa: " + super.getPret());
    }
}
