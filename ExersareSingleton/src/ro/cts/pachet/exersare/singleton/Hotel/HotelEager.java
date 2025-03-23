package ro.cts.pachet.exersare.singleton.Hotel;

public class HotelEager {
    private String nume;
    private int nrCamere;
    private String site;
    private float cifraAfaceri;
    private static HotelEager hotel= new HotelEager("Continental", 20, "hotelcontinental.com", 140000);

    public HotelEager(String nume, int nrCamere, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrCamere = nrCamere;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public static HotelEager getHotel() {
        return hotel;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void rezervaCamera(String rezervare){
        this.nrCamere--;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HotelEager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrCamere=").append(nrCamere);
        sb.append(", site='").append(site).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }
}

