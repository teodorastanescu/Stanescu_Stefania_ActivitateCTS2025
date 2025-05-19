package ro.cts.models;

public class Medic {
    public boolean confirmaInternare(Internare candidat){
        return candidat.getCodAfectiune() %5==0;
    }
}
