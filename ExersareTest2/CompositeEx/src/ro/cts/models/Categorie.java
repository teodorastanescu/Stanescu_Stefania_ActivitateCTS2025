package ro.cts.models;

import java.util.ArrayList;
import java.util.List;

public class Categorie extends Meniu{

    private List<Meniu> lista;

    public Categorie(String nume, int gramaj) {
        super(nume, gramaj);
        this.lista=new ArrayList<>();
    }

    @Override
    public void adaugaPreparat(Meniu m) {
        lista.add(m);
    }

    @Override
    public void stergePreparat(Meniu m) {

        lista.remove(m);
    }

    @Override
    public Meniu veziNod(int index) {
       return lista.get(index);
    }

    @Override
    public void afiseaza() {
        System.out.println("Categoria " +super.getNume()+ "are urmatoarele preparate:");
        lista.forEach(Meniu::afiseaza);
        }

    @Override
    public int calculeazaCantitate() {
        int total=0;
        for(Meniu m:lista) {
            total += m.getGramaj();
        }
        return total+this.getGramaj();
    }
}


