package ro.cts.builder;

public class BuilderMagazin implements Mall{

    protected Magazin magazin;

    public BuilderMagazin(String denumire, int suprafate, int nrIntrari){
        this.magazin=new Magazin(denumire, suprafate, nrIntrari, 3, TipPodea.Standard, MaterialeDecoratiuni.Lemn);
    }

    @Override
    public Mall setDenumire(String denumire) {
        magazin.setDenumire(denumire);
        return this;
    }

    @Override
    public Mall setSuprafata(int suprafata) {
         magazin.setSuprafata(suprafata);
         return this;
    }

    @Override
    public Mall setNrIntrari(int nrIntrari) {
        if (nrIntrari==0) {
            nrIntrari=1;
        }
        else{
            magazin.setNrIntrari(nrIntrari);
        }
        return this;
    }

    @Override
    public Mall setDuritatePodea(int duritatePodea) {
        magazin.setDuritatePodea(duritatePodea);
        return this;
    }

    @Override
    public Mall setTipPodea(TipPodea tipPodea) {
        magazin.setTipPodea(tipPodea);
        return this;
    }

    @Override
    public Mall setMaterialeDecoratiuni(MaterialeDecoratiuni materialeDecoratiuni) {
        magazin.setMaterialeDecoratiuni(materialeDecoratiuni);
        return this;
    }

    @Override
    public Magazin adaugaMagazin() {
        return magazin;
    }
}
