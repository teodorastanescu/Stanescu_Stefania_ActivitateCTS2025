package ro.cts.models;

public class ProxyAsigurare implements InternareInterface{
    private InternareInterface internare;

    public ProxyAsigurare(InternareInterface internare) {
        this.internare = internare;
    }

    @Override
    public void interneaza(int nrFisa, String nume, boolean areAsigurare) {
        if(areAsigurare==true){
            System.out.println("Pacientul a fost internat!");
        }else{
            System.out.println("Nu se poate interna un pacient fara asigurare medicala.");
        }
    }
}
