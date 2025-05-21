package ro.cts.models;

import java.util.HashMap;

public class FabricaInternare {

    private int nrInternare;
    private HashMap<Integer, IPacient> map;

    public FabricaInternare(int nrInternare) {
        this.nrInternare = nrInternare;
        this.map = new HashMap<>();
    }

    public int getNrInternare() {
        return nrInternare;
    }

    public HashMap<Integer, IPacient> getMap() {
        return map;
    }

    public IPacient putObiect(String nume, int nrTelefon, String adresa){
        if(!this.map.containsKey(nrTelefon)){
             this.map.put(nrTelefon, new Pacient(nume, nrTelefon, adresa));
        }
        return this.map.get(nrTelefon);
    }

    public IPacient getObiect(int nrTelefon) throws Exception{
        if(this.map.containsKey(nrTelefon)){
            return this.map.get(nrTelefon);
        }else{
            throw new Exception("Nu exista pacientul!");
        }

    }
}
