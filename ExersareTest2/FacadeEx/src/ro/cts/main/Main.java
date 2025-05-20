package ro.cts.main;

import ro.cts.models.Facade;
import ro.cts.models.Internare;

public class Main {
    public static void main(String[] args) {

        Internare candidat1= new Internare(12, 10, true);
        Facade internare= new Facade();
        System.out.println(internare.interneazaPacient(candidat1));
    }
}