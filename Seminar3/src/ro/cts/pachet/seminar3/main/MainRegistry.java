package ro.cts.pachet.seminar3.main;

import Anunturi.Agentie;
import Anunturi.Anunt;

public class MainRegistry {
    public static void main(String[] args){
        Agentie agentie=new Agentie("Imobiliare.ro", 140000);
        Anunt anunt1= agentie.getAnunt("Romana nr.6", "Popescu", 3);
        Anunt anunt2=agentie.getAnunt("Universitate nr.6", "Georgescu", 3);
        Anunt anunt3=agentie.getAnunt("Romana nr.6", "Vasilescu", 3);
        System.out.println(anunt3);
    }
}
