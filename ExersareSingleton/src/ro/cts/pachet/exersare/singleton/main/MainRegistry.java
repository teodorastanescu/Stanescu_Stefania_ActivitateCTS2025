package ro.cts.pachet.exersare.singleton.main;
import Rezervari.Hotel;
import Rezervari.Rezervare;

public class MainRegistry {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Frumosul", 140000);
        Rezervare rezervare1 = hotel.getRezervari("Popescu Dan", 37, 3000);
        Rezervare rezervare2 = hotel.getRezervari("Constantin Mihai", 56, 5677);
        Rezervare rezervare3 = hotel.getRezervari("Popescu Dan", 45, 2300);
        System.out.println(rezervare3);
    }
}
