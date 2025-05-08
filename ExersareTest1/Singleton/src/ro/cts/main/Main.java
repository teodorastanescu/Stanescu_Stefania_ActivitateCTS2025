package ro.cts.main;

import ro.cts.ManagerAutentificare.EagerSingleton;
import ro.cts.ManagerAutentificare.ThreadSafeSingleton;

public class Main {
    public static void main(String[] args) {

        ThreadSafeSingleton instanta1= ThreadSafeSingleton.getInstance("maricia05", "miliarde", Boolean.TRUE);
        ThreadSafeSingleton instanta2= ThreadSafeSingleton.getInstance("maria5", "altceva", Boolean.TRUE);

        System.out.println(instanta1.toString());
        System.out.println(instanta2.toString());

        EagerSingleton i1= EagerSingleton.getInstance("ceva", "altceva", Boolean.FALSE);
        System.out.println(i1.toString());
    }
}