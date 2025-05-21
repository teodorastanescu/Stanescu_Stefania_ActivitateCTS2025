package ro.cts.main;

import ro.cts.models.FabricaInternare;
import ro.cts.models.Salon;

public class Main {
    public static void main(String[] args) {
        FabricaInternare fabricaInternare=new FabricaInternare(1);

        fabricaInternare.putObiect("Pantea", 123456, "str. Florilor");
        fabricaInternare.putObiect("Crinu", 0000, "str. Garii");

        Salon salon= new Salon(2,4,5);

        try{

            fabricaInternare.getObiect(0000).internare(salon);
            //fabricaInternare.getObiect(1);

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}