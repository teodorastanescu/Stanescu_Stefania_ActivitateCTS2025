package ro.cts.models;

public class Cash implements MetodaPlata {

    @Override
    public void plateste(float pret) {
        System.out.println("S-a realizat plata cash!");
    }
}
