package ro.cts.models;

public class Salon {
    private int id;
    private int nrPat;
    private int zileSpitalizare;

    public Salon(int id, int nrPat, int zileSpitalizare) {
        this.id = id;
        this.nrPat = nrPat;
        this.zileSpitalizare = zileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salon{");
        sb.append("id=").append(id);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", zileSpitalizare=").append(zileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
