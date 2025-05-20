package ro.cts.models;

public class AdapterSoft extends SoftBucatarie{

    private SoftBar softBar;

    public AdapterSoft(String numeProdus, float pret, int cantitate, int stoc, SoftBar softBar) {
        super(numeProdus, pret, cantitate, stoc);
        this.softBar=softBar;
    }

    public AdapterSoft(SoftBar softBar) {
        super(softBar.getNumeProdus(), softBar.getPret(), softBar.getCantitate(), 100);
        this.softBar= softBar;
    }

    @Override
    public void printeazaFactura() {
        softBar.aduNota();
    }
}
