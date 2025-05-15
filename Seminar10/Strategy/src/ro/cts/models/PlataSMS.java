package ro.cts.models;

public class PlataSMS implements IMetodaPlata{

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Ai platit cu SMS!");
    }
}
