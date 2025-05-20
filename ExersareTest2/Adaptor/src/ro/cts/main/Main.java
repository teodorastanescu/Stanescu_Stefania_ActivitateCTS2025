package ro.cts.main;

import ro.cts.models.AdapterSoft;
import ro.cts.models.SoftBar;
import ro.cts.models.SoftBucatarie;

public class Main {

    public static void cereNota(SoftBucatarie softBucatarie){
        softBucatarie.printeazaFactura();
    }
    public static void main(String[] args) {

        SoftBucatarie softBucatarie=new SoftBucatarie("peste", 23, 1, 50);
        cereNota(softBucatarie);
        SoftBar softBar=new SoftBar("limonada", 4, 3);
        AdapterSoft adapter= new AdapterSoft(softBar);
        cereNota(adapter);
    }
}