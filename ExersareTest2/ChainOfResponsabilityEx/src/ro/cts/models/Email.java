package ro.cts.models;

public class Email extends AModalitateNotificare{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() != null){
            System.out.println("Notificare prin mail");
        }else {
            super.getNext().notifica(client,mesaj);
        }
    }
}
