package ro.cts.models;

public class Card implements MetodaPlata{

    private float sold;

    public Card(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pret) {
        if(sold>pret){
            System.out.println("S-a realizat plata cu cardul!");
            sold--;
        }else{
            System.out.println("Fonduri insuficiente!");
        }
    }
}
