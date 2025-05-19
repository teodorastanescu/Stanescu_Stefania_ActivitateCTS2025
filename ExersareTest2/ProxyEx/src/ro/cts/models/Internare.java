package ro.cts.models;

public class Internare implements InternareInterface{
    @Override
    public void interneaza(int nrFisa, String nume, boolean areAsigurare) {
        System.out.println("Pacientul "+ nume+ "cu numarul de inregistrare "+ nrFisa+ "a fost internat");
    }
}
