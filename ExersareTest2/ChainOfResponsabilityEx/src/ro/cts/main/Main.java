package ro.cts.main;

import ro.cts.models.*;

public class Main {
    public static void main(String[] args) {
        AModalitateNotificare SMS= new SMS();
        AModalitateNotificare email=new Email();
        AModalitateNotificare manager=new FaraDate();

        SMS.setNext(email);
        email.setNext(manager);

        Client client=new Client("Alin", 0, "alin@gmail.com");
        SMS.notifica(client, "mesaj de proba");

    }
}