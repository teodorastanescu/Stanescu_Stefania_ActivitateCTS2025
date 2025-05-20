package ro.cts.models;

public class OcupareBufetSuedez extends AOcupare {


    @Override
    public void curatareMasa() {
        System.out.println("Se curata singura si unica masa!");
    }

    @Override
    public void asezareServetele() {

        System.out.println("Se aseaza un set complet de servetele");
    }

    @Override
    public void asezareTacamuri() {

        System.out.println("Se aduce un set de tacamuri dupa disponibilitatea restaurantului");
    }

    @Override
    public void primireClienti() {
        System.out.println("Sunt intampinati clientii!");
    }
}
