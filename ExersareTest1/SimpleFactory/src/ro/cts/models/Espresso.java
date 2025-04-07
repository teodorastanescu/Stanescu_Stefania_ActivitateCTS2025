package ro.cts.models;

public class Espresso extends Cafea{
    private static int discount;

    public Espresso(float pret, String nume, int cantitate, Boolean areLapte) {
        super(pret, nume, cantitate, areLapte);
    }


    @Override
    public void descriereCafea() {
        System.out.println("Espresso are cantitatea de " + super.getCantitate() + " mL");
    }

    @Override
    public float pretFinal() {
        return super.getPret() - super.getPret()* discount;
    }
}
