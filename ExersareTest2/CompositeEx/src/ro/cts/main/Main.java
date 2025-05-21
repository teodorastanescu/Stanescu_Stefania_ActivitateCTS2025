package ro.cts.main;

import ro.cts.models.Categorie;
import ro.cts.models.Meniu;
import ro.cts.models.Preparat;

public class Main {
    public static void main(String[] args) {
        Meniu categorie1=new Categorie("Desert", 236);
        Meniu categorie2=new Categorie("Bauturi", 330);

        Meniu preparat1=new Preparat("Ecler", 50);
        Meniu preparat2= new Preparat("Tort", 135);
        Meniu preparat3=new Preparat("Suc", 250);
        Meniu preparat4=new Preparat("Apa", 300);

        categorie2.adaugaPreparat(preparat3);
        categorie2.adaugaPreparat(preparat4);

        categorie2.afiseaza();
        System.out.println(categorie2.calculeazaCantitate());
    }
}