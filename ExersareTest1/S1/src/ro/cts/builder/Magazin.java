package ro.cts.builder;

public class Magazin {
    private String denumire;
    private int suprafata;
    private int nrIntrari;
    private int duritatePodea;
    private TipPodea tipPodea;
    private MaterialeDecoratiuni materialeDecoratiuni;

    public Magazin(String denumire, int suprafata, int nrIntrari, int duritatePodea, TipPodea tipPodea, MaterialeDecoratiuni materialeDecoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.duritatePodea = duritatePodea;
        this.tipPodea = tipPodea;
        this.materialeDecoratiuni = materialeDecoratiuni;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public void setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
    }

    public void setTipPodea(TipPodea tipPodea) {
        this.tipPodea = tipPodea;
    }

    public void setDuritatePodea(int duritatePodea) {
        this.duritatePodea = duritatePodea;
    }

    public void setMaterialeDecoratiuni(MaterialeDecoratiuni materialeDecoratiuni) {
        this.materialeDecoratiuni = materialeDecoratiuni;
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
