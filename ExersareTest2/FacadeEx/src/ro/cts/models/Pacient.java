package ro.cts.models;

public class Pacient {
    public boolean problemaGrava(Internare candidat){
        return candidat.getCodAfectiune() % 2==0;
    }
}
