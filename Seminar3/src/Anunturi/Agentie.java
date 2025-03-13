package Anunturi;

import java.util.HashMap;
import java.util.Map;

public class Agentie {
    private String nume;
    private float cifraAfaceri;
    private Map<String, Anunt> anunturi= new HashMap<>();

    public Agentie(String nume, float cifraAfaceri) {
        this.nume = nume;
        this.cifraAfaceri = cifraAfaceri;
    }

    public Anunt getAnunt(String adresa, String proprietar, int nrCamere){
        if(!(anunturi.containsKey(adresa))){
            Anunt anunt=new Anunt(adresa, proprietar, nrCamere, anunturi.size()+1);
            anunturi.put(adresa, anunt);
        }
        return anunturi.get(adresa);
    }

}
