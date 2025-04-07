package ro.cts.ManagerAutentificare;

public class ThreadSafeSingleton {
    private String username;
    private String parola;
    private Boolean userLogat;

    private static ThreadSafeSingleton managerAutentificare = null;

    private ThreadSafeSingleton(String username, String parola, Boolean userLogat) {
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
    public synchronized static ThreadSafeSingleton getInstance(String username, String parola, Boolean userLogat){
        if(managerAutentificare ==null){
            managerAutentificare=new ThreadSafeSingleton(username,parola,userLogat);
        }
        return managerAutentificare;
    }
}
