package ro.cts.ManagerAutentificare;

public class EagerSingleton {
    private String username;
    private String parola;
    private Boolean userLogat;

    private static EagerSingleton managerAutentificare = new EagerSingleton("cosmin04", "carteamea", Boolean.TRUE);

    private EagerSingleton(String username, String parola, Boolean userLogat) {
        this.username = username;
        this.parola = parola;
        this.userLogat = userLogat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ThreadSafeSingleton{");
        sb.append("username='").append(username).append('\'');
        sb.append(", parola='").append(parola).append('\'');
        sb.append(", userLogat=").append(userLogat);
        sb.append('}');
        return sb.toString();
    }

    //lazy fara synchronized
    public  static EagerSingleton getInstance(String username, String parola, Boolean userLogat){
        return managerAutentificare;
    }
}
