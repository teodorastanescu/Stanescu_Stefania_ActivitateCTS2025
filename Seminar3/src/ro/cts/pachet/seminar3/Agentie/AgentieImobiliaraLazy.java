package ro.cts.pachet.seminar3.Agentie;

public class AgentieImobiliaraLazy {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraLazy agentieImobiliara= new AgentieImobiliaraLazy("Agentia", 10, "agentie.com", 120000);

    private AgentieImobiliaraLazy(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }


    public synchronized static AgentieImobiliaraLazy getAgentieImobiliara(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        if(agentieImobiliara==null){
            agentieImobiliara=new AgentieImobiliaraLazy(nume, nrAnunturi, site, cifraAfaceri);

        }
        return agentieImobiliara;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void posteazaAnunt(String anunt){
        this.nrAnunturi++;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieImobiliara{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAnunturi=").append(nrAnunturi);
        sb.append(", site='").append(site).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }
}
