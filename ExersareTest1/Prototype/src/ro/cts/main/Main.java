package ro.cts.main;

import ro.cts.cereri.ACerere;
import ro.cts.cereri.Cerere;

public class Main {
    public static void main(String[] args) {
        ACerere c1= new Cerere("Cerere Concediu", "Ion", 1234, "concediu");
        ACerere c2= c1.clonare();
        System.out.println(c2);
    }
}