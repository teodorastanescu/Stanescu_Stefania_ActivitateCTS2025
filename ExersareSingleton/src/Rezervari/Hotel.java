package Rezervari;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private String nume;
    private float cifraAfaceri;
    private Map<String, Rezervare> rezervari= new HashMap<>();

    public Hotel(String nume, float cifraAfaceri) {
        this.nume = nume;
        this.cifraAfaceri = cifraAfaceri;
    }

    public Rezervare getRezervari(String numeClient, int varsta, float sumaPlata){
        if(!(rezervari.containsKey(numeClient))){
            Rezervare rezervare=new Rezervare(numeClient, varsta, sumaPlata);
            rezervari.put(numeClient, rezervare);
        }
        return rezervari.get(numeClient);
    }
}
