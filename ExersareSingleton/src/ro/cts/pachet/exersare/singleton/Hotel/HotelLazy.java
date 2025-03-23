package ro.cts.pachet.exersare.singleton.Hotel;

public class HotelLazy {

        private String nume;
        private int nrCamere;
        private String site;
        private float cifraAfaceri;
        private static HotelLazy hotel= new HotelLazy("Continental", 20, "hotelcontinental.com", 140000);

        public HotelLazy(String nume, int nrCamere, String site, float cifraAfaceri) {
            this.nume = nume;
            this.nrCamere = nrCamere;
            this.site = site;
            this.cifraAfaceri = cifraAfaceri;
        }

        public synchronized static HotelLazy getHotel(String nume, int nrCamere, String site, float cifraAfaceri) {
            if(hotel==null){
                hotel=new HotelLazy(nume, nrCamere, site, cifraAfaceri);

            }
            return hotel;
        }

        public String getSite() {
            return site;
        }

        public void setSite(String site) {
            this.site = site;
        }

        public void rezervaCamera(int nrCamere){
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
