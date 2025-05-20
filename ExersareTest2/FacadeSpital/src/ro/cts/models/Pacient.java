package ro.cts.models;

public class Pacient {
    private String nume;
    private int varsta;
    private int isBolnav;

    public Pacient(String nume, int varsta, int isBolnav) {
        this.nume = nume;
        this.varsta = varsta;
        this.isBolnav = isBolnav;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int isBolnav() {
        return isBolnav;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setBolnav(int bolnav) {
        isBolnav = bolnav;
    }

    public void verificaGravitate(){
        if(isBolnav==1){
            System.out.println("E ok");
        }else if(isBolnav==2){
            System.out.println("E mediu");
        }else{
            System.out.println("E grav!");
        }
    }
}
