package ro.cts.models;

public class SMS extends AModalitateNotificare{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon() !=0){
            System.out.println("notificare prin nr telefon");
        }else{
            super.getNext().notifica(client,mesaj);
        }
    }
}
