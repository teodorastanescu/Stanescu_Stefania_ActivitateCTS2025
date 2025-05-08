package ro.cts.models;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbs{

    private List<StructuraAbs> structuri;

    public Departament(String nume, int numarAngajati) {
        super(nume, numarAngajati);
        structuri=new ArrayList<>();
    }

    @Override
    public void adaugaNod(StructuraAbs structuraAbs) {
        structuri.add(structuraAbs);
    }

    @Override
    public void stergeNod(StructuraAbs structuraAbs) {
        structuri.remove(structuraAbs);

    }

    @Override
    public StructuraAbs getNodCopil(int indexCopil) {
        return structuri.get(indexCopil);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Departamentul " + this.getNume() + "contine urmatoarele subdepartamente:");
        structuri.forEach(StructuraAbs::afiseazaDescriere);

    }

    @Override
    public int calculeazaNrAngajati() {
        int sum=0;
        for(StructuraAbs structuraAbs: structuri){
            sum+=structuraAbs.getNumarAngajati();
        }
        return sum+this.getNumarAngajati();
    }
}
