package ro.cts.main;

import ro.cts.modules.Masa;
import ro.cts.modules.Receptionist;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(true, 20, 4);
        Receptionist receptionist = new Receptionist();
        String mesaj1 = receptionist.poateLuaLocLaMasa(masa1);
        System.out.println(mesaj1);

        Masa masa2 = new Masa(true, 23, 5);
        String mesaj2 = receptionist.poateLuaLocLaMasa(masa2);
        System.out.println(mesaj2);

        Masa masa3 = new Masa(true, 4, 2);
        String mesaj3 = receptionist.poateLuaLocLaMasa(masa3);
        System.out.println(mesaj3);
    }
}