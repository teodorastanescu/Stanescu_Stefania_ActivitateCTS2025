package ro.cts.main;

import ro.cts.builder.BuilderMagazin;
import ro.cts.builder.Magazin;
import ro.cts.builder.Mall;
import ro.cts.builder.MaterialeDecoratiuni;

public class Main {
    public static void main(String[] args) {

        Magazin magazin1=new BuilderMagazin("Zara", 500, 0).setDuritatePodea(3).setMaterialeDecoratiuni(MaterialeDecoratiuni.Lemn).adaugaMagazin();
        System.out.println(magazin1);
        //magazin1.setSuprafata(400); //nu ma lasa sa fac modificari, am pus protected in Magazin si la constructor si la setteri
        //.out.println(magazin1);

        Mall mall= new BuilderMagazin("Zara", 500, 0);
        Magazin magazin2=mall.setDuritatePodea(3).setMaterialeDecoratiuni(MaterialeDecoratiuni.Lemn).adaugaMagazin();
        System.out.println(magazin2.toString());


    }
}