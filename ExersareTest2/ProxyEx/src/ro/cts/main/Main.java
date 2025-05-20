package ro.cts.main;

import ro.cts.models.Internare;
import ro.cts.models.InternareInterface;
import ro.cts.models.ProxyAsigurare;

public class Main {
    public static void main(String[] args) {
        InternareInterface internare= new Internare();
        internare.interneaza(2, "Mihai", false);

        InternareInterface internare2=new ProxyAsigurare(internare);
        internare2.interneaza(4, "Cara", false);

    }
}