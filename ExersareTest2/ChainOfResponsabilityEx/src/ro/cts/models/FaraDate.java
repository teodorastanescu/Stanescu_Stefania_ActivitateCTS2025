package ro.cts.models;

public class FaraDate extends AModalitateNotificare{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Domnule manager, nu exista date de notificare pentru clientul "+ client.getNume());
    }
}
