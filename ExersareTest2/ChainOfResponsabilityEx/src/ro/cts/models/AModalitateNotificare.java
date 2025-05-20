package ro.cts.models;

public abstract class AModalitateNotificare {
    private AModalitateNotificare next;

    public AModalitateNotificare getNext() {
        return next;
    }

    public void setNext(AModalitateNotificare next) {
        this.next = next;
    }

    public abstract void notifica(Client client, String mesaj);
}
