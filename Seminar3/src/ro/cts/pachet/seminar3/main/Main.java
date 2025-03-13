package ro.cts.pachet.seminar3.main;
import ro.cts.pachet.seminar3.Agentie.AgentieImobiliaraEager;
import ro.cts.pachet.seminar3.Agentie.AgentieImobiliaraLazy;

public class Main {
    public static void main(String[] args) {
        AgentieImobiliaraEager agentieImobiliara= AgentieImobiliaraEager.getAgentieImobiliara();
        System.out.println(agentieImobiliara.toString());

        AgentieImobiliaraEager agentie2= AgentieImobiliaraEager.getAgentieImobiliara();
        agentie2.setSite("sitenou.com");
        agentie2.posteazaAnunt("anunt2");
        agentieImobiliara.posteazaAnunt("anunt1");
        System.out.println(agentieImobiliara.toString());


        AgentieImobiliaraLazy agentie4= AgentieImobiliaraLazy.getAgentieImobiliara("Max", 4, "site4.com", 150000);
        AgentieImobiliaraLazy agentie5= AgentieImobiliaraLazy.getAgentieImobiliara("Max", 4, "site4.com", 150000);

    }
}