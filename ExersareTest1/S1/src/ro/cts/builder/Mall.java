package ro.cts.builder;

public interface Mall {
    Magazin adaugaMagazin();
    Mall setDenumire(String denumire);
    Mall setSuprafata(int suprafata);
    Mall setNrIntrari(int nrIntrari);
    Mall setDuritatePodea(int duritatePodea);
    Mall setTipPodea(TipPodea tipPodea);
    Mall setMaterialeDecoratiuni(MaterialeDecoratiuni materialeDecoratiuni);
}
