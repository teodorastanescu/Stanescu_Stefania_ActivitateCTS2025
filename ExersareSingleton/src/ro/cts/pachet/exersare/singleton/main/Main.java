package ro.cts.pachet.exersare.singleton.main;
import ro.cts.pachet.exersare.singleton.Hotel.HotelEager;
import ro.cts.pachet.exersare.singleton.Hotel.HotelLazy;

public class Main {
    public static void main(String[] args) {
        HotelEager hotel= HotelEager.getHotel();
        System.out.println(hotel.toString());

        HotelEager hotel2= HotelEager.getHotel();
        hotel2.setSite("altsite.com");
        hotel2.rezervaCamera("rezervare2");
        hotel.rezervaCamera("rezervare1");
        System.out.println(hotel.toString());


        HotelLazy hotel4= HotelLazy.getHotel("Ceva", 15, "site4.com", 170000);
        HotelLazy hotel5= HotelLazy.getHotel("VrajaMarii", 34, "Hotel5.com", 450000);

    }
}