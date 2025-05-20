package ro.cts.models;

public abstract class AOcupare {

    public abstract void curatareMasa();
    public abstract void asezareServetele();
    public abstract void asezareTacamuri();
    public abstract void primireClienti();

    public final void ocupareMasa(){
        curatareMasa();
        asezareServetele();
        asezareTacamuri();
        primireClienti();
    }

    public final void ocupareMasaLive(){
        curatareMasa();
        primireClienti();
        asezareServetele();
        asezareTacamuri();
    }
}
