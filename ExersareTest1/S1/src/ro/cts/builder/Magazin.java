package ro.cts.builder;

public class Magazin {
    private String denumire;
    private int suprafata;
    private int nrIntrari;
    private int duritatePodea;
    private TipPodea tipPodea;
    private MaterialeDecoratiuni materialeDecoratiuni;

    protected Magazin(String denumire, int suprafata, int nrIntrari, int duritatePodea, TipPodea tipPodea, MaterialeDecoratiuni materialeDecoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        try {
            if(nrIntrari >1 && nrIntrari >= suprafata/100){
                this.nrIntrari = nrIntrari;
            }
            else{
                this.nrIntrari= (int) Math.ceil(suprafata/100);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        this.duritatePodea = duritatePodea;
        this.tipPodea = tipPodea;
        this.materialeDecoratiuni = materialeDecoratiuni;
    }

    protected void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    protected void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    protected void setNrIntrari(int nrIntrari) {
        if(nrIntrari >1 && nrIntrari >= suprafata/100){
            this.nrIntrari = nrIntrari;
        }
        else{
            this.nrIntrari= (int) Math.ceil(suprafata/100);
        }
    }

    protected void setTipPodea(TipPodea tipPodea) {
        this.tipPodea = tipPodea;
    }

    protected void setDuritatePodea(int duritatePodea) {
        this.duritatePodea = duritatePodea;
    }

    protected void setMaterialeDecoratiuni(MaterialeDecoratiuni materialeDecoratiuni) {
        this.materialeDecoratiuni = materialeDecoratiuni;
    }

    public int CalculGradIncendiu(int duritatePodea, MaterialeDecoratiuni materialeDecoratiuni){
        if(duritatePodea<2 && materialeDecoratiuni==MaterialeDecoratiuni.Lemn){
            return 100;
        }
        else {
            return 10;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrIntrari=").append(nrIntrari);
        sb.append(", duritatePodea=").append(duritatePodea);
        sb.append(", tipPodea=").append(tipPodea);
        sb.append(", materialeDecoratiuni=").append(materialeDecoratiuni);
        sb.append('}');
        return sb.toString();
    }
}
