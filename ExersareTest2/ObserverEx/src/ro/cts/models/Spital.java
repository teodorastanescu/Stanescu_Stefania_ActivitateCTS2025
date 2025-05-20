package ro.cts.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Spital implements Subject{

    private String nume;
    private List<Observer> pacientiAbonati;

    public Spital(String nume) {
        this.nume = nume;
        this.pacientiAbonati=new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public List<Observer> getPacientiAbonati() {
        return pacientiAbonati;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        pacientiAbonati.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        pacientiAbonati.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer pacient: pacientiAbonati){
            pacient.primesteMesaj(mesaj);
        }
    }

    public abstract void mentioneazaSectie();
}
